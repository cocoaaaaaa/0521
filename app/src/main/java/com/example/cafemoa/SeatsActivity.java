package com.example.cafemoa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SeatsActivity extends AppCompatActivity {
    TextView seatsCount = null;
    Button seatsUp = null;
    Button seatsDown = null;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seats);


        setup();


    }

    private void setup() {
        Button seatsUp = (Button) findViewById(R.id.seatsUp);
        Button seatsDown = (Button) findViewById(R.id.seatsDown);
        final TextView seatsCount = (TextView) findViewById(R.id.seatsCount);

        seatsUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                seatsCount.setText("" + count);
            }
        });
        seatsDown.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                seatsCount.setText("" + count);
            }
        });
    }
}
