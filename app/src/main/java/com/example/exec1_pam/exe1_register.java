package com.example.exec1_pam;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class exe1_register extends AppCompatActivity {

    EditText rednama, redemail, redpass, reredpass;
    String rnama, remail, rpass, rrepass;
    Button sign_up;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exe1_register);

        rednama = findViewById(R.id.rednama);
        redemail = findViewById(R.id.redemail);
        redpass = findViewById(R.id.redpassword);
        reredpass = findViewById(R.id.reredpass);
        sign_up = findViewById(R.id.signup);

        sign_up.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                rnama = rednama.getText().toString();
                remail = redemail.getText().toString();
                rpass = redpass.getText().toString();
                rrepass = redpass.getText().toString();



                if( rnama.isEmpty() || remail.isEmpty() || rpass.isEmpty() || rrepass.isEmpty()){
                    Toast.makeText(getApplicationContext(),
                            "masukkan semua data terlebih dahulu", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(getApplicationContext(),
                            "Nama Anda: "+rnama+". Email Anda: "+remail+". Password Anda: "+rpass, Toast.LENGTH_LONG).show();

                    //Bundle b = new Bundle();

                    //b.putString("a", rnama.trim());

                    //b.putString("b", rpass.trim());

                    //Intent exec_toMain = new Intent(getApplicationContext(), MainActivity.class);

                    //exec_toMain.putExtras(b);

                    //startActivity(exec_toMain);

                }
            }
        });

    }
}
