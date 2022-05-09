package com.mixcorp.bem01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.mixcorp.bem01.domingo.DomLeopoldense;

public class LeopoldenseDias extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_leopoldense_dias);

    }

    public void segLeo(View view) {
        Intent a = new Intent(this, SegLeopoldense.class);
        startActivity(a);
    }

    public void sabLeo(View view) {
        Intent a = new Intent(this, SabLeopoldense.class);
        startActivity(a);
    }

    public void domLeo(View view) {
        Intent a = new Intent(this, DomLeopoldense.class);
        startActivity(a);
    }
}