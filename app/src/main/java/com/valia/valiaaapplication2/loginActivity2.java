package com.valia.valiaaapplication2;

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

public class loginActivity2 extends AppCompatActivity {

    EditText usernameEditText, emailEditText, passwordEditText;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        usernameEditText = findViewById(R.id.username_Edit_Text);
        emailEditText = findViewById(R.id.email_Edit_Text);
        passwordEditText = findViewById(R.id.password_Edit_Text);
//        Button loginButton = findViewById(R.id.loginButton);

        Bundle extras = getIntent().getExtras();
        String username, email, password, confirm;
        username = extras.getString("USERNAME");
        email = extras.getString("EMAIL");
        password = extras.getString("PASSWORD");
        confirm = extras.getString("CONFIRM");

        emailEditText.setText(email);
        passwordEditText.setText(password);



//        loginButton.setOnClickListener(v -> {
//            // Intent untuk berpindah ke RegisterActivity2
//            Intent intent = new Intent(loginActivity2.this, dashboardActivity2.class);
//            startActivity(intent);
//        });
    }
}