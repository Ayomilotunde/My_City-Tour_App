package com.ayomi.mycity_tourapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailInformationActivity extends AppCompatActivity {

    ImageView Image;
    TextView PlaceNameText;
    TextView AddressText;
    TextView PhoneNoText;
    TextView OverviewText;
    DetailedInformation detailedInformation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_information);

        detailedInformation = getIntent().getParcelableExtra("place_data");

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

         Image = (ImageView)findViewById(R.id.image_view_detailed_info);
         PlaceNameText = (TextView)findViewById(R.id.detailed_name_text_view);
         PhoneNoText = (TextView)findViewById(R.id.detailed_phone_text_view);
         AddressText = (TextView)findViewById(R.id.detailed_address_text_view);
         OverviewText = (TextView)findViewById(R.id.detailed_overview_text_view);


        if(detailedInformation.getPlaceName() != null) {
            PlaceNameText.setText(detailedInformation.getPlaceName());
        }
         Image.setImageResource(detailedInformation.getImageResourceId());
         AddressText.setText(detailedInformation.getAddress());
         PhoneNoText.setText(detailedInformation.getPhoneNo());
         OverviewText.setText(detailedInformation.getDescription());


    }
}