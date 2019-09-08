package com.example.midterm07600650;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        Intent intent = getIntent();
        String username_pro = intent.getStringExtra("username");
        String password_pro = intent.getStringExtra("password");
//        String welcome = R.string.toast_welcome;

        if(username_pro.equals("aaa") && password_pro.equals("111")){
                TextView name = findViewById(R.id.user_textView);
                TextView school = findViewById(R.id.school_textView10);
                TextView resident = findViewById(R.id.resident_textView11);
                TextView from = findViewById(R.id.from_textView12);

                name.setText(R.string.user_name_s);
                school.setText(R.string.school_s);
                resident.setText(R.string.resident_s);
                from.setText(R.string.from_where_s);

            Toast.makeText(getApplicationContext(),R.string.toast_welcome+" "+R.string.user_name_s,Toast.LENGTH_LONG).show();

        } else if(username_pro.equals("bbb") && password_pro.equals("222")){
            TextView name = findViewById(R.id.user_textView);
            TextView school = findViewById(R.id.school_textView10);
            TextView resident = findViewById(R.id.resident_textView11);
            TextView from = findViewById(R.id.from_textView12);

            name.setText(R.string.user_name);
            school.setText(R.string.school);
            resident.setText(R.string.resident);
            from.setText(R.string.from_where);

            Toast.makeText(getApplicationContext(),R.string.toast_welcome+" "+R.string.user_name,Toast.LENGTH_LONG).show();

        }else{
            intent = new Intent(getApplicationContext(),LoginActivity.class);
            intent.putExtra("check","1");
            startActivity(intent);

        }
    }
}
