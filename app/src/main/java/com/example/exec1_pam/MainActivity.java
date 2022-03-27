package com.example.exec1_pam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnsign, register;
    EditText lednama, ledpassword;
    String nama, password;
    TextView tnama, tpass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnsign = findViewById(R.id.bsignin);
        register = findViewById(R.id.register);
        lednama = findViewById(R.id.lednama);
        ledpassword = findViewById(R.id.ledpassword);

        btnsign.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                nama = lednama.getText().toString();
                password = ledpassword.getText().toString();

                String email = "Pascal";

                String pass = "iniPascal";

                Intent main_toselamat = new Intent(getApplicationContext(), selamat_datang.class);
                Bundle b = new Bundle();
                b.putString("textnama", nama);
                main_toselamat.putExtras(b);

                if (nama.isEmpty() && password.isEmpty()) {

                    Toast.makeText(getApplicationContext(),
                            "Masukkan Email dan password terlebih dahulu", Toast.LENGTH_LONG).show();
                } else {

                    if (nama.equals(email) && password.equals(pass)) {

                        Toast.makeText(getApplicationContext(), "Login Sukses", Toast.LENGTH_LONG).show();

                        startActivity(main_toselamat);

                    }else if (nama.equals(email) && password != pass) {
                        Toast.makeText(getApplicationContext(), "passwors salah", Toast.LENGTH_LONG).show();
                    }else if (nama != email && password.equals(pass)) {
                        Toast.makeText(getApplicationContext(), "email salah", Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(getApplicationContext(), "login gagal", Toast.LENGTH_LONG).show();
                    }
                }
            }
        });

        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent main_toexe1 = new Intent(getApplicationContext(), exe1_register.class);
                startActivity(main_toexe1);
            }
        });
    }
}