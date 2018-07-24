package com.minhtv.tour_guide;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class oberhausenMain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oberhausen_details);
        TextView visit = findViewById(R.id.start);
        setTitle(getString(R.string.oberhausen));
        visit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(oberhausenMain.this, Sightseeing.class);
                startActivity(i);
            }
        });
    }
}