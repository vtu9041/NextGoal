package com.arun.prajasahayak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.EventListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.FirebaseFirestoreException;

import javax.annotation.Nullable;

public class BiharActivity extends AppCompatActivity {


    TextView time, cnf , rec, death;
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bihar);

        time = (TextView)findViewById(R.id.case_updates);
        cnf = (TextView)findViewById(R.id.cnf_txt);
        rec = (TextView)findViewById(R.id.rec_txt);
        death = (TextView)findViewById(R.id.death_txt);

        DocumentReference documentReference = db.collection("Corona").document("Bihar");
        documentReference.addSnapshotListener(this, new EventListener<DocumentSnapshot>() {
            @Override
            public void onEvent(@Nullable DocumentSnapshot documentSnapshot, @Nullable FirebaseFirestoreException e) {

                time.setText(documentSnapshot.getString("time"));
                cnf.setText(documentSnapshot.getString("cnf"));
                rec.setText(documentSnapshot.getString("rec"));
                death.setText(documentSnapshot.getString("death"));

            }
        });


    }
}
