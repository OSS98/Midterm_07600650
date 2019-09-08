package com.example.midterm07600650;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
//        startActivity(intent);

        Button login_button = findViewById(R.id.log_button);
        login_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText user = findViewById(R.id.username_editText);
                EditText pass = findViewById(R.id.password_editText2);
                Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                intent.putExtra("username",user.getText().toString());
                intent.putExtra("password",pass.getText().toString());
                startActivity(intent);

            }
        });

    }

}
