package com.abnerdev.trab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText _name;
    EditText _password;
    TextView _status;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _name = findViewById(R.id.EditTextEmail);
        _password = findViewById(R.id.editTextPassword);
        _status = findViewById(R.id.textViewStatus);
    }

    public void login(View view){
        _status.setVisibility(View.INVISIBLE);
        String login = _name.getText().toString();
        String password = _password.getText().toString();
        if(login.equals("admin") && password.equals("123")){
            Intent intent = new Intent(MainActivity.this,Home.class);
            startActivity(intent);
        }else{
            _status.setVisibility(View.VISIBLE);
        }

    }
}