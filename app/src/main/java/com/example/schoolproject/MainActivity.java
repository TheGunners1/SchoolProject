package com.example.schoolproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    EditText etFirstName, etLastName,etUsernameS, etEmail, etPasswordS;
    Button btnSignUp, btnAddImage, btnLogInS;
    ImageView ivImage;
    SharedPreferences sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etUsernameS= findViewById(R.id.etUserNameS);
        etEmail = findViewById(R.id.etEmail);
        etPasswordS = findViewById(R.id.etPasswordS);
        btnAddImage = findViewById(R.id.btnAddImage);
        btnSignUp = findViewById(R.id.btnSignUp);
        btnLogInS   = findViewById(R.id.btnLogInS);
        ivImage = findViewById(R.id.ivImage);

        btnSignUp.setOnClickListener(this);
        btnAddImage.setOnClickListener(this);
        btnLogInS.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        switch(v.getId()){
            case R.id.btnSignUp:
                Toast.makeText(this,"Singing Up", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btnAddImage:
                break;
            case R.id.btnLogInS:
                Intent FirstIntent = new Intent(MainActivity.this , LoginActivity.class);
                startActivity(FirstIntent);
                break;
            default:
                break;
        }
    }
}