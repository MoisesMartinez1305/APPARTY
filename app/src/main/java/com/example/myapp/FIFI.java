package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class FIFI extends AppCompatActivity {
    private TextView nomfi, call, colo, muni, hori,ves, cover;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifi);
        nomfi = (TextView) findViewById(R.id.nomfi);
        call = (TextView) findViewById(R.id.call);
        colo = (TextView) findViewById(R.id.colo);
        muni = (TextView) findViewById(R.id.muni);
        hori = (TextView) findViewById(R.id.hori);
        ves = (TextView) findViewById(R.id.ves);
        cover = (TextView) findViewById(R.id.cover);
        String dato = getIntent().getStringExtra("dato");
        nomfi.setText(dato);
        String dato2 = getIntent().getStringExtra("dato2");
        call.setText(dato2);
        String dato3 = getIntent().getStringExtra("dato3");
        colo.setText(dato3);
        String dato4 = getIntent().getStringExtra("dato4");
        muni.setText(dato4);
        String dato5 = getIntent().getStringExtra("dato5");
        hori.setText(dato5);
        String dato6 = getIntent().getStringExtra("dato6");
        ves.setText(dato6);
        String dato7 = getIntent().getStringExtra("dato7");
        cover.setText(dato7);

    }
}