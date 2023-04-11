package com.example.mainpage;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText username,password,confirm;
    Button signup;
    TextView already;
    DPHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        username=(EditText) findViewById(R.id.userreg_edittext);
        password=(EditText) findViewById(R.id.passreg_edittext);
        signup=(Button)findViewById(R.id.signup_btn_reg);
        confirm=(EditText)findViewById(R.id.repassword_edittext);

        already=(TextView)findViewById(R.id.login_text_have);
        DB =new DPHelper(this);

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user=username.getText().toString();
                String pass=password.getText().toString();
                String  confirm_pass=confirm.getText().toString();
                if(user.equals("")||pass.equals("")){
                    Toast.makeText(Register.this,"Please Enter All Fields !",Toast.LENGTH_LONG).show();
                }
                else{
                    boolean checkuser=DB.checkusername(user);
                    if(checkuser==false) {
                        if (confirm_pass.equals(pass)) {
                            DB.addnewaccount(user, pass);

                            Toast.makeText(Register.this, "Registered Successfully !", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);

                        }
                        else{
                            Toast.makeText(Register.this, "Password Doesn't Match ! ", Toast.LENGTH_LONG).show();
                        }
                    }
                    else{
                        Toast.makeText(Register.this,"Username Already EXIST !",Toast.LENGTH_LONG).show();

                    }

                }


            }
        });

        already.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent =new Intent(getApplicationContext(),Login.class);
                startActivity(intent);
            }
        });


    }
}