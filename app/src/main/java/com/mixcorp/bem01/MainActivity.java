package com.mixcorp.bem01;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class MainActivity extends AppCompatActivity {

    String url = "https://forms.gle/3qPnXLereupyKZNZ7";
    FirebaseDatabase database = FirebaseDatabase.getInstance();
    DatabaseReference myRef = database.getReference();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });*/
        Button btReclaim = findViewById(R.id.button14);
        btReclaim.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });


        /*btLeopoldense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });*/
    }

    //ImageView btLeopoldense = findViewById(R.id.imageView2);



    public void trocarTela1(View view) {
        Intent a = new Intent(this, LeopoldenseDias.class);
        startActivity(a);
    }

    public void trocarTela2(View view) {
        Intent b = new Intent(this, FeitoriaDias.class);
        startActivity(b);
    }

    public void trocarTela3(View view) {
        Intent c = new Intent(this, SeteDias.class);
        startActivity(c);
    }

    public void trocarTela4(View view) {
        Intent d = new Intent(this, SinoscapDIas.class);
        startActivity(d);
    }

}