package com.example.exec1_pam;

import android.os.Bundle;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class selamat_datang extends AppCompatActivity {

    EditText namatask, jenistask, timetask;
    String snamatask, sjenistask, stimetask;
    FloatingActionButton fab;
    TextView namaAnda;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selamat_datang);

        namatask = findViewById(R.id.tednatask);
        jenistask = findViewById(R.id.edjenistask);
        timetask = findViewById(R.id.edtimetask);
        fab = findViewById(R.id.fab);
        namaAnda = findViewById(R.id.pascal);

        Bundle bundle = getIntent().getExtras();

        String nama = bundle.getString("textnama");

        namaAnda.setText(nama);

        fab.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                snamatask = namatask.getText().toString();
                sjenistask = jenistask.getText().toString();
                stimetask = timetask.getText().toString();


                Toast.makeText(getApplicationContext(),
                        "Berhasil", Toast.LENGTH_LONG).show();

                Bundle b = new Bundle();

                b.putString("a", snamatask.trim());

                b.putString("b", sjenistask.trim());

                b.putString("c", stimetask.trim());

                Intent selamat_tohasil = new Intent(getApplicationContext(), hasil_task.class);

                selamat_tohasil.putExtras(b);

                startActivity(selamat_tohasil);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getItemId() == R.id.mnsubmit){
            snamatask = namatask.getText().toString();
            sjenistask = jenistask.getText().toString();
            stimetask = timetask.getText().toString();


            Toast.makeText(getApplicationContext(),
                    "Berhasil", Toast.LENGTH_LONG).show();

            Bundle b = new Bundle();

            b.putString("a", snamatask.trim());

            b.putString("b", sjenistask.trim());

            b.putString("c", stimetask.trim());

            Intent selamat_tohasil = new Intent(getApplicationContext(), hasil_task.class);

            selamat_tohasil.putExtras(b);

            startActivity(selamat_tohasil);
        }
        else {
            Intent i = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

}
