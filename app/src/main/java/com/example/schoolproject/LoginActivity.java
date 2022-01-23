package com.example.schoolproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etUsernameL, etPasswordL;
    Button btnLoginS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etUsernameL=findViewById(R.id.etUserNameL);
        etPasswordL=findViewById(R.id.etPasswordL);
        btnLoginS=findViewById(R.id.btnLogInS);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()) {
            case R.id.btnSignUp:
                Toast.makeText(this, "Logging in", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}