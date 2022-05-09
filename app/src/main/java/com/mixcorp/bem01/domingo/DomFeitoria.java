package com.mixcorp.bem01.domingo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.mixcorp.bem01.R;

public class DomFeitoria extends AppCompatActivity {

    //private AdView mAdView;
   // private AdView mAdView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dom_feitoria);

        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference feitoria_ref = database.getReference("Horarios").child("Feitoria");
        DatabaseReference dom = feitoria_ref.child("dom");

        PhotoView viewFei4 = findViewById(R.id.feitoria_dom_p);
        dom.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Context context = getApplicationContext();
                CharSequence text = "Aguarde...";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

                String fei4 = snapshot.getValue(String.class);
                Picasso.get().load(fei4).into(viewFei4);
                //Glide.with(Leopoldense_seg.this).load(leo1).into(viewLeo1);
            }
            @Override
            public void onCancelled(@NonNull DatabaseError error) {
            }
        });

        mAdView = findViewById(R.id.adView14);
        AdRequest adRequest14 = new AdRequest.Builder()
                .build();
        mAdView.loadAd(adRequest14);

        mAdView1 = findViewById(R.id.adView15);
        AdRequest adRequest15 = new AdRequest.Builder()
                .build();
        mAdView1.loadAd(adRequest15);

        /*PhotoView domFei = (PhotoView)
                findViewById(R.id.feitoria_dom_p);
        domFei.setImageResource(R.drawable.feitoria_seg);*/

    }
}