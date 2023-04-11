package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {
    EditText username,password;
    TextView register;
    Button signin,signup;
    DPHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username=(EditText) findViewById(R.id.userlogin_edittext);
        password=(EditText) findViewById(R.id.passlogin_edittext);
        signin= (Button)findViewById(R.id.signin_btn_login);
        register=(TextView)findViewById(R.id.Register_loginpage) ;

        DB =new DPHelper(this);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String user=username.getText().toString();
                String pass=password.getText().toString();

                if(user.equals("")||pass.equals("")){
                    Toast.makeText(Login.this,"Please Enter All Fields !",Toast.LENGTH_LONG).show();

                }
                else{
                    boolean checkuserandpass=DB.checkuserandpass(user,pass);
                    if(checkuserandpass==true){
                        Toast.makeText(Login.this,"Signed In Successfully !",Toast.LENGTH_LONG).show();
                        Intent intent=new Intent(getApplicationContext(),categories.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(Login.this,"Wrong Username Or Password !",Toast.LENGTH_LONG).show();

                    }
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getApplicationContext(),Register.class);
                startActivity(intent);
            }
        });





    }
}