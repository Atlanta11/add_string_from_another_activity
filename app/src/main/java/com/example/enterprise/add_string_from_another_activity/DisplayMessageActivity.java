package com.example.enterprise.add_string_from_another_activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Intent intent = this.getIntent();
        String message = intent.getStringExtra("com.example.enterprise.add_string_from_another_activity");
        TextView textView = new TextView(this);
        textView.setTextSize(40.0F);
        textView.setText(message);
        this.setContentView(textView);


    }
}
