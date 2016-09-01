package com.example.enterprise.add_string_from_another_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
String value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // important the onclick statement for the layout in the xml file
    public void buttonOnClick(View v) {

        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText)this.findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra("com.example.enterprise.add_string_from_another_activity", message);
        this.startActivity(intent);
    }
}

