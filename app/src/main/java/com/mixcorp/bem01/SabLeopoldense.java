package com.mixcorp.bem01;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class SabLeopoldense extends AppCompatActivity {

    /*private AdView mAdView4;
    private AdView mAdView5;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sab_leopoldense);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference leopoldense_ref = database.getReference("Horarios").child("Leopodense");
        DatabaseReference sab = leopoldense_ref.child("Sab");

        PhotoView viewLeo3 = findViewById(R.id.sabLeo_p);
        sab.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String leo3 = snapshot.getValue(String.class);
                Picasso.get().load(leo3).into(viewLeo3);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        /*mAdView4 = findViewById(R.id.adView4);
        AdRequest adRequest4 = new AdRequest.Builder()
                .build();
        mAdView4.loadAd(adRequest4);

        mAdView5 = findViewById(R.id.adView5);
        AdRequest adRequest5 = new AdRequest.Builder()
                .build();
        mAdView5.loadAd(adRequest5);*/

        /*PhotoView sabLeo = (PhotoView)
                findViewById(R.id.sabLeo_p);
        sabLeo.setImageResource(R.drawable.leopoldense_sab);*/
    }
}