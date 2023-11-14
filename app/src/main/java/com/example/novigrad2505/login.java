package com.example.novigrad2505;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class login extends AppCompatActivity {
    private TextView Welcome;
    private EditText edUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Welcome = findViewById(R.id.welcome);
        edUsername = findViewById(R.id.ed_username);
        Welcome = findViewById(R.id.welcome);
        Welcome.setText("Hi "+ "Amadou");
    }
}
