package com.example.dictgayanilo.e_commerce;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Email, Pass;
    Button Login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Email = findViewById(R.id.txtEmail);
        Pass = findViewById(R.id.txtPass);
        Login = findViewById(R.id.btnLogin);

        Login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        String getEmail, getPass;

        getEmail = Email.getText().toString();
        getPass = Pass.getText().toString();

        Intent toHome = new Intent(this, Home.class);

        Bundle loginInfo = new Bundle();

        loginInfo.putString("Email", getEmail);
        loginInfo.putString("Password", getPass);
        toHome.putExtras(loginInfo);
        startActivity(toHome);
    }
}
