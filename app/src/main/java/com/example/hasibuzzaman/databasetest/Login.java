package com.example.hasibuzzaman.databasetest;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText idEt;
    EditText passwordEt;
    LoginClass loginClass;
    String userName, password;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        idEt= (EditText) findViewById(R.id.id);
        passwordEt= (EditText) findViewById(R.id.password);

        loginClass=new LoginClass(Login.this);
    }


    public void login(View view) {

        String s = idEt.getText().toString();
        String s1 = passwordEt.getText().toString();
        loginClass.login(s,s1);

    }


}
