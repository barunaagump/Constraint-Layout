package com.example.sampleconstrainlayout;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Deklarasi variabel untuk button
    Button btnLogin;

    //Deklarasi variabel untuk EditText
    EditText edemail, edpassword;

    //Deklarasi variabel untuk menyimpan email dan password
    String nama, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Menghubungkan variabel btnLogin dengan componen button pada Layout
        btnLogin=findViewById(R.id.btSignin);

        //Menghubungkan variabel edemail dengan componen button pada layout
        edemail=findViewById(R.id.edEmail);

        //Menghubungkan variabel edpassword dengan componen button pada Layout
        edpassword=findViewById(R.id.edPassword);

        //membuat fungsi onclik pada button btnLogin
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            //menyimpan input user di edittext email kedalam variabel nama
            nama =edemail.getText().toString();

            //menyimpan input user di edittext password kedalam variabel password
            password =edpassword.getText().toString();

            //membuat variabel toast dan membuat toast dengan menambhakan variabel nama dan password
                Toast t = Toast.makeText(getApplicationContext(),
                    text: "email anda: "+nama+" dan Password anda: "+password+"",Toast.LENGTH_LONG);
            //menampilkan toast
            t.show();
        }
    });






    }
}