package com.minhtv.tour_guide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SpotAdapter extends ArrayAdapter<Spot> {

    public SpotAdapter(Context context, ArrayList<Spot> spots) {
        super(context, 0, spots);

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }
        Spot current = getItem(position);
        TextView Name = listItemView.findViewById(R.id.name);
        Name.setText(current.getmName());
        TextView Time = listItemView.findViewById(R.id.time);
        Time.setText(current.getmTime());
        ImageView pic = listItemView.findViewById(R.id.picture);
        pic.setImageResource(current.getmImageId());
        return listItemView;
    }
}
