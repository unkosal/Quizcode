package com.unkosal.quizcode;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

public class LoginActivity extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private AppCompatButton loginButton;
    private TextView registerTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        emailEditText = findViewById(R.id.email);
        passwordEditText = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginBtn);
        registerTextView = findViewById(R.id.registerText);

        // Handle login button click
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = emailEditText.getText().toString().trim();
                String password = passwordEditText.getText().toString().trim();

                // Example validation (replace with your authentication logic)
                if (isValidLogin(email, password)) {
                    // Successful login
                    startActivity(new Intent(LoginActivity.this, MainActivity.class));
                    finish(); // Optional: finish LoginActivity to prevent it from staying in back stack
                } else {
                    // Failed login
                    Toast.makeText(LoginActivity.this, "Invalid credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // Handle register text click
        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to registration activity or screen
                // Example: startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
                Toast.makeText(LoginActivity.this, "Navigate to Registration", Toast.LENGTH_SHORT).show();
            }
        });
    }

    // Example validation method (replace with your authentication logic)
    private boolean isValidLogin(String email, String password) {
        // Add your authentication logic here (e.g., check against a database)
        // For simplicity, this example always returns true
        return true;
    }
}
