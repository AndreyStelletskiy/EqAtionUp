package com.example.homescreen;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Homescreen extends AppCompatActivity {
    Button algebra;
    Button geometry;
    Button physics;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homescreen);
        algebra =findViewById(R.id.algebra);
        geometry =findViewById(R.id.geometry);
        physics = findViewById(R.id.physics);
    }

    public void goalg(View v) {
                Intent intAlg = new Intent(this, Algrbra.class);
                startActivity(intAlg);
        }
    public void gogeo(View v) {
        Intent intGeo = new Intent(this, Geometry.class);
        startActivity(intGeo);
    }
    public void gophy(View v) {
        Intent intPhy = new Intent(this, Physics.class);
        startActivity(intPhy);
    }

    }