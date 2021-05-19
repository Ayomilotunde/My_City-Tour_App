package com.ayomi.mycity_tourapp;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class TourAdapter extends ArrayAdapter<DetailedInformation> {

    public TourAdapter(Activity context, ArrayList<DetailedInformation> listDetailed) {
        super(context,0, listDetailed);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View listItemView = convertView;
        if(convertView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.item_list,parent,false);

        }
        DetailedInformation currentInfoDetailed = getItem(position);

        TextView nameTextView = listItemView.findViewById(R.id.list_item_name_text);
        nameTextView.setText(currentInfoDetailed.getPlaceName());

        TextView addressTextView = listItemView.findViewById(R.id.list_item_address_text);
        addressTextView.setText(currentInfoDetailed.getAddress());

        ImageView placeImageView = listItemView.findViewById(R.id.list_item_image);
        placeImageView.setImageResource(currentInfoDetailed.getImageResourceId());


        return listItemView;
    }
}
