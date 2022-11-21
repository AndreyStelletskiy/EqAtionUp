package com.example.homescreen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Algrbra extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algrbra);
    }
    public void goquadra(View v) {
        Intent intQuadra = new Intent(this, quadraticequation.class);
        startActivity(intQuadra);
    }
}