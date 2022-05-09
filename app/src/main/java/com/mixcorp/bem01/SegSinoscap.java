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

public class SegSinoscap extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView1;
    private AdView mAdView2;
    private AdView mAdView3;
    private AdView mAdView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_sinoscap);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference sinoscap_ref = database.getReference("Horarios").child("Sinoscap");
        DatabaseReference seg1 = sinoscap_ref.child("Seg1");
        DatabaseReference seg2 =sinoscap_ref.child("Seg2");
        DatabaseReference seg3 =sinoscap_ref.child("Seg3");
        DatabaseReference seg4 =sinoscap_ref.child("Seg4");

        PhotoView viewSinos1 = findViewById(R.id.sinos_seg_p);
        seg1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String sinos1 = snapshot.getValue(String.class);
                Picasso.get().load(sinos1).into(viewSinos1);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSinos2 = findViewById(R.id.sinos_seg2_p);
        seg2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String sinos2 = snapshot.getValue(String.class);
                Picasso.get().load(sinos2).into(viewSinos2);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSinos3 = findViewById(R.id.sinos_seg3_p);
        seg3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String sinos3 = snapshot.getValue(String.class);
                Picasso.get().load(sinos3).into(viewSinos3);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSinos4 = findViewById(R.id.sinos_seg4_p);
        seg4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String sinos4 = snapshot.getValue(String.class);
                Picasso.get().load(sinos4).into(viewSinos4);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        mAdView3 = findViewById(R.id.adView28);
        AdRequest adRequest28 = new AdRequest.Builder()
                .build();
        mAdView3.loadAd(adRequest28);

        mAdView = findViewById(R.id.adView29);
        AdRequest adRequest29 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest29);

        mAdView1 = findViewById(R.id.adView30);
        AdRequest adRequest30 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest30);

        mAdView2 = findViewById(R.id.adView31);
        AdRequest adRequest31 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest31);

        mAdView4 = findViewById(R.id.adView32);
        AdRequest adRequest32 = new AdRequest.Builder()
                .build();
        mAdView4.loadAd(adRequest32);

        PhotoView segSinos = (PhotoView)
                findViewById(R.id.sinos_seg_p);
        segSinos.setImageResource(R.drawable.sinoscap_seg);

        PhotoView segSinos2 = (PhotoView)
                findViewById(R.id.sinos_seg2_p);
        segSinos2.setImageResource(R.drawable.sinoscap_seg2);

        PhotoView segSinos3 = (PhotoView)
                findViewById(R.id.sinos_seg3_p);
        segSinos3.setImageResource(R.drawable.sinoscap_seg3);

        PhotoView segSinos4 = (PhotoView)
                findViewById(R.id.sinos_seg4_p);
        segSinos4.setImageResource(R.drawable.sinoscap_seg4);
    }
}