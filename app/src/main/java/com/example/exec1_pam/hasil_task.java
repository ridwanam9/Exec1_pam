package com.example.exec1_pam;


import android.os.Bundle;

import android.widget.TextView;


import androidx.appcompat.app.AppCompatActivity;

public class hasil_task extends AppCompatActivity {

    TextView hnamatask, hjenistask, htimetask;
    String shnamatask, shjenistask, shtimetask;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hasil_task);

        hnamatask = findViewById(R.id.hnamatask);
        hjenistask = findViewById(R.id.hjenistask);
        htimetask = findViewById(R.id.htimetask);

        Bundle bundle = getIntent().getExtras();

        shnamatask = bundle.getString("a");
        shjenistask = bundle.getString("b");
        shtimetask = bundle.getString("c");

        hnamatask.setText(shnamatask);
        hjenistask.setText(shjenistask);
        htimetask.setText(shtimetask);

    }
}
