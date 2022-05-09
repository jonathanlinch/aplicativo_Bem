package com.mixcorp.bem01;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.mixcorp.bem01.domingo.DomSinos;

public class SinoscapDIas extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sinoscap_d_ias);
    }

    public void segSinos(View view) {
        Intent d = new Intent(this, SegSinoscap.class);
        startActivity(d);
    }

    public void sabSinos(View view) {
        Intent d = new Intent(this, SabSinoscap.class);
        startActivity(d);
    }

    public void domSinos(View view) {
        Intent d = new Intent(this, DomSinos.class);
        startActivity(d);
    }
}