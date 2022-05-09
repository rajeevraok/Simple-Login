package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText email = findViewById(R.id.txtEmail);
        EditText password = findViewById(R.id.txtPwd);
        Button login = (Button)findViewById(R.id.btnlogin);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!email.getText().toString().equals("")&&!password.getText().toString().equals("")){
                    if(email.getText().toString().contains("@")&&email.getText().toString().contains(".")){
                        Toast.makeText(getApplicationContext(),"Validated",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(),"Wrong Email",Toast.LENGTH_LONG).show();
                    }
                }
                else{
                    Toast.makeText(getApplicationContext(),"Email & Password is Compulsory",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}