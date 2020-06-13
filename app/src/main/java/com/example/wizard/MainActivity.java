package com.example.wizard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greeting = findViewById(R.id.textView);
        String hello = getResources().getString(R.string.Wizardy);
        hello += "!!";
        greeting.setText(hello);
    }

    public void sendMessage(View view) {
    }
}