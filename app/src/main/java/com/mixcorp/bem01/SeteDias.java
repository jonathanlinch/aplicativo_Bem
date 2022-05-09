package com.mixcorp.bem01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mixcorp.bem01.domingo.DomSete;

public class SeteDias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sete_dias);
    }

    public void segSete(View view) {
        Intent c = new Intent(this, SegSete.class);
        startActivity(c);
    }

    public void sabSete(View view) {
        Intent c = new Intent(this, SabSete.class);
        startActivity(c);
    }

    public void domSete(View view) {
        Intent c = new Intent(this, DomSete.class);
        startActivity(c);
    }
}