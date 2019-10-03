package com.example.demo;

import android.support.v7.app.AppCompatActivity;
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
        final EditText regName = (EditText) findViewById(R.id.txtName);
        final EditText regEmail = (EditText) findViewById(R.id.txtEmail);
        final EditText regPass = (EditText) findViewById(R.id.txtPwd);
        Button regButton = (Button) findViewById(R.id.Reg);

        regButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(regName.getText().toString().isEmpty()){
                    regName.setError("Cant be Empty");
                    regName.requestFocus();
                    Toast.makeText(getApplicationContext(),"Please enter",Toast.LENGTH_LONG).show();
                }
                else if(regEmail.getText().toString().isEmpty()){
                    regEmail.setError("Cant be Empty");
                    regEmail.requestFocus();
                    Toast.makeText(getApplicationContext(),"Please enter",Toast.LENGTH_LONG).show();
                }
               else if(regPass.getText().toString().isEmpty()){
                    regPass.setError("Cant be Empty");
                    regPass.requestFocus();
                    Toast.makeText(getApplicationContext(),"Please enter",Toast.LENGTH_LONG).show();
                }
               else {
                   Toast.makeText(getApplicationContext(),"Registered",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}

