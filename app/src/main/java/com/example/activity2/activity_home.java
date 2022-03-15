package com.example.activity2;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class activity_home extends AppCompatActivity {
    TextView emailText, passwordText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        emailText = findViewById(R.id.tf_nama);
        passwordText = findViewById(R.id.tf_password);

        Bundle bundle = getIntent().getExtras();

        String email = bundle.getString("data1");
        String password = bundle.getString("data2");

        emailText.setText(email);
        passwordText.setText(password);

    }
}