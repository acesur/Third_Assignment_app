package com.example.third_assignment_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private EditText etUserName,etPassword;
    private Button btnLoginSignIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUserName=findViewById(R.id.etUserName);
        etPassword=findViewById(R.id.etPassword);
        btnLoginSignIn=findViewById(R.id.btnLoginSignIn);
        btnLoginSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkUser();


            }
        });

    }
    private void checkUser(){
        Intent intent = new Intent(getApplicationContext(),ViewPagerActivity.class);
        startActivity(intent);
        SharedPreferences sharedPreferences = getSharedPreferences("User",MODE_PRIVATE);
        String username = sharedPreferences.getString("username","");
        String password = sharedPreferences.getString("password","");
        if (username.equals(etUserName.getText().toString())||password.equals(etPassword.getText().toString())){
            Toast.makeText(LoginActivity.this,"Successful",Toast.LENGTH_SHORT).show();
        }
else
    {
    Toast.makeText(LoginActivity.this,"Something Error",Toast.LENGTH_SHORT).show();
        }


    }
}
