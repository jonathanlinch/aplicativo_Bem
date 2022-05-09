package com.mixcorp.bem01;

import android.content.Context;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.github.chrisbanes.photoview.PhotoView;
import com.google.android.gms.ads.AdView;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.squareup.picasso.Picasso;

public class SegFeitoria extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView1;
    private AdView mAdView2;
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seg_feitoria);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference feitoria_ref = database.getReference("Horarios").child("Feitoria");
        DatabaseReference feiseg1 = feitoria_ref.child("Seg1");
        DatabaseReference feiseg2 = feitoria_ref.child("Seg2");
        DatabaseReference teste = feitoria_ref.child("Teste");

        textView1 = findViewById(R.id.textTeste);

        PhotoView viewFei1 = findViewById(R.id.feitoria_seg_p);

        feiseg1.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
                String fei1 = snapshot.getValue(String.class);
                Picasso.get().load(fei1).into(viewFei1);
                //Glide.with(SegFeitoria.this).load(fei1).into(viewFei1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        PhotoView viewFei2 = findViewById(R.id.feitoria_seg2_p);
        feiseg2.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String Fei2 = snapshot.getValue(String.class);
                Picasso.get().load(Fei2).into(viewFei2);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        
        /*mAdView = findViewById(R.id.adView8);
        AdRequest adRequest8 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest8);

        mAdView1 = findViewById(R.id.adView9);
        AdRequest adRequest9 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest9);

        mAdView2 = findViewById(R.id.adView10);
        AdRequest adRequest10 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest10);
*/
        /*PhotoView segFei = (PhotoView)
                findViewById(R.id.feitoria_seg_p);
        segFei.setImageResource(R.drawable.feitoria_seg);

        PhotoView segFei2 = (PhotoView)
                findViewById(R.id.feitoria_seg2_p);
        segFei2.setImageResource(R.drawable.feitoria_seg2);*/
    }
}