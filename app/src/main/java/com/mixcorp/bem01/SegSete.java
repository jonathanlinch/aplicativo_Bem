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

public class SegSete extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView1;
    private AdView mAdView2;
    private AdView mAdView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_sete);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference sete_ref = database.getReference("Horarios").child("Sete");
        DatabaseReference seg1 = sete_ref.child("Seg1");
        DatabaseReference seg2 = sete_ref.child("Seg2");
        DatabaseReference seg3 = sete_ref.child("Seg3");
        DatabaseReference seg4 = sete_ref.child("Seg4");

        PhotoView viewSet1 = findViewById(R.id.sete_seg_p);
        seg1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String set1 = snapshot.getValue(String.class);
                Picasso.get().load(set1).into(viewSet1);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSet2 = findViewById(R.id.sete_seg2_p);
        seg2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String set2 = snapshot.getValue(String.class);
                Picasso.get().load(set2).into(viewSet2);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSet3 = findViewById(R.id.sete_seg3_p);
        seg3.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String set3 = snapshot.getValue(String.class);
                Picasso.get().load(set3).into(viewSet3);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewSet4 = findViewById(R.id.sete_seg4_p);
        seg4.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String set4 = snapshot.getValue(String.class);
                Picasso.get().load(set4).into(viewSet4);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        mAdView3 = findViewById(R.id.adView16);
        AdRequest adRequest16 = new AdRequest.Builder()
                .build();
        mAdView3.loadAd(adRequest16);

        mAdView = findViewById(R.id.adView17);
        AdRequest adRequest17 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest17);

        mAdView1 = findViewById(R.id.adView18);
        AdRequest adRequest18 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest18);

        mAdView2 = findViewById(R.id.adView19);
        AdRequest adRequest19 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest19);

        /*PhotoView segSet = (PhotoView)
                findViewById(R.id.sete_seg_p);
        segSet.setImageResource(R.drawable.sete_seg);

        PhotoView segSet2 = (PhotoView)
                findViewById(R.id.sete_seg2_p);
        segSet2.setImageResource(R.drawable.sete_seg2);

        PhotoView segSet3 = (PhotoView)
                findViewById(R.id.sete_seg3_p);
        segSet3.setImageResource(R.drawable.sete_seg3);*/

    }
}