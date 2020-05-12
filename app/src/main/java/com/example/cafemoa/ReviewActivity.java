package com.example.cafemoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;


public class ReviewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review);

        TextView reviewText=(TextView) findViewById(R.id.reviewText);
        EditText reviewEdit=(EditText) findViewById(R.id.reviewEdit);
        Button cancelButton=(Button) findViewById(R.id.cancelButton);
        Button okButton=(Button)findViewById(R.id.okButton);
        RatingBar reviewRating=(RatingBar)findViewById(R.id.reviewRating);

        cancelButton.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent( ReviewActivity.this,InformationActivity.class );
                startActivity( intent );
            }
        });

        reviewRating.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {

            }
        });
    }

}
