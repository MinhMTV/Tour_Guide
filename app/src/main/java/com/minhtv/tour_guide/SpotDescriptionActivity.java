package com.minhtv.tour_guide;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class SpotDescriptionActivity extends AppCompatActivity {
    private int ImageID;
    private String Description;
    private TextView TextDesc;
    private ImageView image;
    private String Title;
    private String Time;
    private TextView TextTime;
    private int flag;
    private String owners;
    private TextView TextOwners;
    private String address;
    private TextView TextAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        Description = getIntent().getStringExtra(getString(R.string.desc));
        Title = getIntent().getStringExtra(getString(R.string.title));
        ImageID = getIntent().getIntExtra("1", 0);
        Time = getIntent().getStringExtra(getString(R.string.time));
        flag = getIntent().getIntExtra(getString(R.string.flag), 0);
        owners = getIntent().getStringExtra(getString(R.string.owners));
        address = getIntent().getStringExtra(getString(R.string.address));
        setTitle(Title);
        image = findViewById(R.id.description_image);
        image.setImageResource(ImageID);
        TextOwners = findViewById(R.id.Owners);
        if (flag == 1) {
            TextOwners.setText(getString(R.string.opening_date) + owners);
        } else if (flag == 2) {
            TextOwners.setText(getString(R.string.Owner) + owners);
        }
        TextAddress = findViewById(R.id.address);
        TextAddress.setText(getString(R.string.addressdisplay) + address);
        TextDesc = findViewById(R.id.short_description);
        TextDesc.setText(Description);
        TextTime = findViewById(R.id.opening);
        TextTime.setText(getString(R.string.opening) + Time);
    }
}

