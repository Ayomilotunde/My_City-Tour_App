package com.ayomi.mycity_tourapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class HotelsFragment  extends Fragment implements AdapterView.OnItemClickListener  {

    ArrayList<DetailedInformation> mInfoDetailed;


    public HotelsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_hotels, container, false);
        mInfoDetailed = new ArrayList<DetailedInformation>();

        mInfoDetailed.add(new DetailedInformation(
                "Akuvera Hotel",
                R.drawable.akuvera,
                "28288828282882211",
                "Along Ibrahim Badamasi Babangide University, off-Minna Road, Lapai",
                "Akuvera Hotel is the best hotel in Lapai, It has some facilities and it has a Hall for events too, It run 24 hours in 7 days, that is, there is no time it is not open. They have various types of rooms ranging from Economy, to VIP, to VVIP and others."));

  mInfoDetailed.add(new DetailedInformation(
                "Royal Suite Hotel",
                R.drawable.royalsuite,
                "28288828282882211",
                "Along Ibrahim Badamasi Babangide University Main Gate, off-Minna Road, Lapai",
                "Royal Suite Hotel is more of a guest house but has a mini hotel where people lodge of pass their night. They have a guest house too Where people go and just refresh their selves. "));




        TourAdapter mTourAdapter = new TourAdapter(getActivity(), mInfoDetailed);
        ListView listView = (ListView) rootView.findViewById(R.id.fragmentHotel_list_view);
        listView.setAdapter(mTourAdapter);
        listView.setOnItemClickListener(this);



        return rootView;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(getActivity(),DetailInformationActivity.class);
        intent.putExtra("place_data",mInfoDetailed.get(position));
        startActivity(intent);

    }
}