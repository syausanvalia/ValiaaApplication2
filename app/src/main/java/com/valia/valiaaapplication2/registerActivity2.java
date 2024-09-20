package com.valia.valiaaapplication2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class registerActivity2 extends AppCompatActivity {

    Intent intent;
    EditText usernameEditText, emailEditText, passwordEditText, confirmPasswordEdtText;
    Button registerButton, button2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_register2);

        // Set window insets for system bars
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Inisialisasi Button dengan ID button2
        usernameEditText = findViewById(R.id.username_EditText);
        emailEditText = findViewById(R.id.email_EditText);
        passwordEditText = findViewById(R.id.password_EditText);
        confirmPasswordEdtText = findViewById(R.id.confirm_PasswordEditText);
//        Button button2 = findViewById(R.id.button2);
//
//        // Set OnClickListener untuk tombol
//        button2.setOnClickListener(v -> {
//            // Intent untuk berpindah ke MainActivity
//            Intent intent = new Intent(registerActivity2.this, MainActivity.class);
//            startActivity(intent);
//        });
//        Button registerButton = findViewById(R.id.registerButton);
//
//
//        registerButton.setOnClickListener(v -> {
//            // Intent untuk berpindah ke RegisterActivity2
//            Intent intent = new Intent(registerActivity2.this, loginActivity2.class);
//            startActivity(intent);
//        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = usernameEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String password = passwordEditText.getText().toString();
                String confirm = confirmPasswordEdtText.getText().toString();

                Intent intent = new Intent(registerActivity2.this, loginActivity2.class);
                intent.putExtra("USERNAME", username);
                intent.putExtra("EMAIL", email);
                intent.putExtra("PASSWORD", password);
                intent.putExtra("CONFIRM", confirm);

                startActivity(intent);
            }
        });

    }
}

