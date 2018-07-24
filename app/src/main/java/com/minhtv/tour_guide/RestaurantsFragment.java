package com.minhtv.tour_guide;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class RestaurantsFragment extends Fragment {
    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag = 2;
    private String owners;
    private String address;

    public RestaurantsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Spot> DetailsList = new ArrayList<>();
        DetailsList.add(new Spot(getString(R.string.piwy), getString(R.string.piwy_desc), R.drawable.piwy_descimage, getString(R.string.piwy_opening), getString(R.string.piwy_owner), getString(R.string.piwy_adress)));
        DetailsList.add(new Spot(getString(R.string.shalimar), getString(R.string.shalimar_desc), R.drawable.shalimar_descimage, getString(R.string.shalimar_opening), getString(R.string.shalimar_owner), getString(R.string.shalimar_adress)));
        SpotAdapter itemsAdapter = new SpotAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Spot pos = DetailsList.get(i);
                Description = pos.getmDescription();
                ImageId = pos.getmImageId();
                Title = pos.getmName();
                Time = pos.getmTime();
                owners = pos.getmOwners();
                address = pos.getmAddress();
                Intent next = new Intent(getActivity(), SpotDescriptionActivity.class);
                next.putExtra(getString(R.string.title), Title);
                next.putExtra(getString(R.string.desc), Description);
                next.putExtra("1", ImageId);
                next.putExtra(getString(R.string.time), Time);
                next.putExtra(getString(R.string.flag), flag);
                next.putExtra(getString(R.string.owners), owners);
                next.putExtra(getString(R.string.address), address);
                startActivity(next);
            }
        });
        return rootView;
    }
}
