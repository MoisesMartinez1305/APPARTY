package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PUFID extends AppCompatActivity {
    private EditText nom, ca, co, mu, ho,ve,cov;
    Button publif;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pufid);
        nom = (EditText) findViewById(R.id.nom);
        ca = (EditText) findViewById(R.id.ca);
        co = (EditText) findViewById(R.id.co);
        mu = (EditText) findViewById(R.id.mu);
        ho = (EditText) findViewById(R.id.ho);
        ve = (EditText) findViewById(R.id.ve);
        cov = (EditText) findViewById(R.id.cov);
        publif = findViewById(R.id.publif);

    }
    public void  enviar(View view){

        Intent i = new Intent(this, FIFI.class);
        i.putExtra("dato", nom.getText().toString());
        i.putExtra("dato2",ca.getText().toString());
        i.putExtra("dato3", co.getText().toString());
        i.putExtra("dato4", mu.getText().toString());
        i.putExtra("dato5", ho.getText().toString());
        i.putExtra("dato6", ve.getText().toString());
        i.putExtra("dato7", cov.getText().toString());
        startActivity(i);
    }
}