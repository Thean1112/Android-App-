package com.sreunhphleng.foodapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SignUpActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_activity);

        TextView textView = findViewById(R.id.loginRedirectText);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start DrinkActivity when imageView is clicked
                Intent intent = new Intent(SignUpActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}
