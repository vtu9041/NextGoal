package com.arun.prajasahayak;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView st;
    private CardView dn;
    private CardView pr;
    private CardView tn;
    private CardView gs;
    private CardView cs;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        st = findViewById(R.id.cv_test);
        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, TestActivity.class);
                startActivity(intent);

            }
        });

        dn = findViewById(R.id.cv_donations);
        dn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, DonationActivity.class);
                startActivity(intent);

            }
        });

        pr = findViewById(R.id.cv_epass);
        pr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, PassActivity.class);
                startActivity(intent);

            }
        });

        tn = findViewById(R.id.cv_numbers);
        tn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, NumbersActivity.class);
                startActivity(intent);

            }
        });

        gs = findViewById(R.id.cv_govt);
        gs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(intent);

            }
        });

        cs = findViewById(R.id.cv_cases);
        cs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, BiharActivity.class);
                startActivity(intent);

            }
        });


    }
}
