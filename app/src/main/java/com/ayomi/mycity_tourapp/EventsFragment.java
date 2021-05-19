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


public class EventsFragment extends Fragment implements AdapterView.OnItemClickListener {

    ArrayList<DetailedInformation> mInfoDetailed;

    public EventsFragment() {
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
        View rootView = inflater.inflate(R.layout.fragment_events, container, false);


        mInfoDetailed = new ArrayList<>();

        mInfoDetailed.add(new DetailedInformation(
                "Gbagyi Day",
                R.drawable.gbagyi_day,
                "28288828282882211",
                "Ibrahim Badamasi Babangide University Campus",
                "This is a cultural day for all the Gbagyi students of Ibrahim Badamasi Babangide University, it is a day they a come together to celebrate and show some of their cultural behaviours like cultural dance, traditional shows, powers, games, songs and many more.... It is always an interesting event to watch and attend as a lot of lectures attend, dance and make fun wit students."));

 mInfoDetailed.add(new DetailedInformation(
                "Amala Day",
                R.drawable.ibbu3,
                "28288828282882211",
                "Ibrahim Badamasi Babangide University Campus",
                "This is a cultural day for all the Oyo side of the Yoruba students of Ibrahim Badamasi Babangide University, it is a day they a come together to celebrate and show some of their cultural behaviours like cultural dance, traditional shows, powers, games, eating of their local foods, traditional Histories and many more.... It is always an interesting event to watch and attend as a lot of lectures attend, dance and make fun wit students."));

 mInfoDetailed.add(new DetailedInformation(
                "Eid'-kabir Celeration",
                R.drawable.eid_kabir,
                "28288828282882211",
                "Emir Palace Lapai",
                "This is a celebration that is mainly done after the month of ramadan, the celebration do take them complete seven days here in Lapai, wit a lot of games, sports, dance and traditional practices. They made theirselves equal before one another i.e the Emir comes out and participate in all they do like Horse ride, egg race, table tennis sport, bike skills, bike race, car race, traditional games and many more, it is always very fun to watch as in do amaze people."));

 mInfoDetailed.add(new DetailedInformation(
                "Matriculation of Ibrahim Badamasi Babangide University",
                R.drawable.matriculatioon,
                "28288828282882211",
                "Ibrahim Badamasi Babangide University Campus",
                "This is the welcoming ceremony and swearing-in, they do for the Newly admitted students into the institution"));

 mInfoDetailed.add(new DetailedInformation(
                "Social Nights",
                R.drawable.social,
                "28288828282882211",
                "Ibrahim Badamasi Babangide University Campus",
                "This are night event that occurs on the campus, were awards are share, prices are won. Its where a lot od dances occur, games as well, fastest fingers and and many more, It's always full of fun as well."));


        TourAdapter mTourAdapter = new TourAdapter(getActivity(), mInfoDetailed);
        ListView listView = (ListView) rootView.findViewById(R.id.fragmentEvent_list_view);
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