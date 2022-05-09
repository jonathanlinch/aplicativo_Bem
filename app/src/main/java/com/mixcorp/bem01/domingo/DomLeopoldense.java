package com.mixcorp.bem01.domingo;

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
import com.mixcorp.bem01.R;
import com.squareup.picasso.Picasso;


public class DomLeopoldense extends AppCompatActivity {

    private AdView mAdView;
    private AdView mAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom_leopoldense);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference leopoldense_ref = database.getReference("Horarios").child("Leopodense");
        DatabaseReference dom = leopoldense_ref.child("dom");

        PhotoView viewLeo4 = findViewById(R.id.domLeo_p);
        dom.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String leo4 = snapshot.getValue(String.class);
                Picasso.get().load(leo4).into(viewLeo4);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        mAdView = findViewById(R.id.adView6);
        AdRequest adRequest6 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest6);

        mAdView1 = findViewById(R.id.adView7);
        AdRequest adRequest7 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest7);

        /*PhotoView domLeo = (PhotoView)
                findViewById(R.id.domLeo_p);
        domLeo.setImageResource(R.drawable.leopoldense_dom);*/
    }
}