package com.example.aziz_musaev_hw_43;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView ColorTextView;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        String text2 =  getIntent().getStringExtra("color");
        ColorTextView = findViewById(R.id.color_tv);
        ColorTextView.setText(text2.toString());
    }
}