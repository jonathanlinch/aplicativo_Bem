package com.mixcorp.bem01;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SabFeitoria extends AppCompatActivity {

    /*private AdView mAdView;
    private AdView mAdView1;
    private AdView mAdView2;*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sab_feitoria);

        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference feitoria_ref = database.getReference("Horarios").child("Feitoria");
        DatabaseReference dom = feitoria_ref.child("dom");

        PhotoView viewFei3 = findViewById(R.id.feitoria_dom_p);
        dom.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String fei3 = snapshot.getValue(String.class);
                Picasso.get().load(fei3).into(viewFei3);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });


        mAdView = findViewById(R.id.adView11);
        AdRequest adRequest11 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest11);

        mAdView1 = findViewById(R.id.adView12);
        AdRequest adRequest12 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest12);

        mAdView2 = findViewById(R.id.adView13);
        AdRequest adRequest13 = new AdRequest.Builder()
                .build();
        mAdView2.loadAd(adRequest13);

        /*PhotoView sabFei = (PhotoView)
                findViewById(R.id.feitoria_sab_p);
        sabFei.setImageResource(R.drawable.feitoria_sab);

        PhotoView sabFei2 = (PhotoView)
                findViewById(R.id.feitoria_sab2_p);
        sabFei2.setImageResource(R.drawable.feitoria_seg);*/

    }
}