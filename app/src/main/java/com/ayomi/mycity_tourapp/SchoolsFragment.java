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


public class SchoolsFragment extends Fragment implements AdapterView.OnItemClickListener {
    ArrayList<DetailedInformation> mInfoDetailed;


    public SchoolsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_schools, container, false);

        mInfoDetailed = new ArrayList<DetailedInformation>();

        mInfoDetailed.add(new DetailedInformation(
                "Baptist Model School",
                R.drawable.baptist_school,
                "+2348067126789",
                "Off-Baptist Church, off Bida Road, Lapai",
                "Baptist Model School Lapai, is a Nursery, Primary and Secondary school, which is own by First Baptist Church Lapai, I is part of the best school here Lapai, which contains students of both the two major religion practice here which are mainly the Christians and the Muslims. It is a citadel of learning which produces best students each year."));

mInfoDetailed.add(new DetailedInformation(
                "Ibrahim Badamasi Babangide University Lapai",
                R.drawable.ibbu_lapai,
                "+2348077034546",
                "Off-Minna Road, Lapai",
                "Ibrahim Babangida University is a university  in Niger State, central, Nigeria. It had its first convocation in 2014. it was named after the formal Head of State General Ibrahim Babangida. The University started academic activities in 2005/2006 academic session"));

mInfoDetailed.add(new DetailedInformation(
                "Muhammad Jero Secondary School",
                R.drawable.jero_school,
                "0000000000",
                "Off-Baptist Church, off Bida Road, Lapai",
                "Muhammad Jero Secondary School is a muslim school located at the state low coast area of Lapai, Niger State. It is just a Secondary school and not like Baptist that comprises of Nursery, Primary and secondary School. Its also a citadel of learning."));

mInfoDetailed.add(new DetailedInformation(
                "Muhammad Kobo Secondary School",
                R.drawable.ibbu2,
                "0000000000",
                "Off-Suleja Lambata Road, Lapai",
                "Muhammad Kobo Secondary School is a secondary school also, both muslims and christians attend the school, Ibrahim Badamasi Babangide University also have a branch of their institution there in Muhammad Kobo Secondary school where mainly the History Receives their lectures. There are Hostels where Ibrahim Badamasi Babangide University students stays too(Both Boys and Girls Hostels)."));


        TourAdapter mTourAdapter = new TourAdapter(getActivity(), mInfoDetailed);
        ListView listView = (ListView) rootView.findViewById(R.id.fragmentSchool_list_view);
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