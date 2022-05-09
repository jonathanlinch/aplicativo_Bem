package com.mixcorp.bem01;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;


public class SegLeopoldense extends AppCompatActivity {

    private AdView mAdView1;
    private AdView mAdView2;
    private AdView mAdView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_leopoldense);
        //Database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference leopoldense_ref = database.getReference("Horarios").child("Leopodense");
        DatabaseReference seg1 = leopoldense_ref.child("Seg1");
        DatabaseReference seg2 = leopoldense_ref.child("Seg2");

        PhotoView viewLeo1 = findViewById(R.id.leopoldense_seg_p);
        seg1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String leo1 = snapshot.getValue(String.class);
                Picasso.get().load(leo1).into(viewLeo1);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewLeo2 = findViewById(R.id.leopoldense_seg2_p);
        seg2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String leo2 = snapshot.getValue(String.class);
                Picasso.get().load(leo2).into(viewLeo2);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        //Ads
        mAdView1 = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest);

        mAdView2 = findViewById(R.id.adView2);
        AdRequest adRequest1 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest1);

        mAdView3 = findViewById(R.id.adView3);
        AdRequest adRequest3 = new AdRequest.Builder()
                .build();
        mAdView3.loadAd(adRequest3);

        PhotoView segLeo1 = (PhotoView)
                findViewById(R.id.leopoldense_seg_p);
        segLeo1.setImageResource(R.drawable.leopoldense_seg);

        PhotoView segLeo2 = (PhotoView)
                findViewById(R.id.leopoldense_seg2_p);
        segLeo2.setImageResource(R.drawable.leopoldense_seg2);
    }
}