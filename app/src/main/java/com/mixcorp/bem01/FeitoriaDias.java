package com.mixcorp.bem01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mixcorp.bem01.domingo.DomFeitoria;

public class FeitoriaDias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feitoria_dias);
    }

    public void segFei(View view) {
        Intent b = new Intent(this, SegFeitoria.class);
        startActivity(b);
    }

    public void sabFei(View view) {
        Intent b = new Intent(this, SabFeitoria.class);
        startActivity(b);
    }

    public void domFei(View view) {
        Intent b = new Intent(this, DomFeitoria.class);
        startActivity(b);
    }
}