package com.example.novigrad2505;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class login extends AppCompatActivity {
    private TextView WelcomE;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        WelcomE = findViewById(R.id.welcome);
    }
}