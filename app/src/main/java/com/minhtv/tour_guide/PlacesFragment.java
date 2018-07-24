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
public class PlacesFragment extends Fragment {

    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag = 1;
    private String owners;
    private String address;

    public PlacesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Spot> DetailsList = new ArrayList<>();
        DetailsList.add(new Spot(getString(R.string.centro), getString(R.string.centro_desc), R.drawable.centro_descimage, getString(R.string.centro_opening), getString(R.string.centro_time), getString(R.string.centro_adress)));
        DetailsList.add(new Spot(getString(R.string.gasometer), getString(R.string.gasometer_desc), R.drawable.gasometer_descimage, getString(R.string.gasometer_opening), getString(R.string.gasometer_time), getString(R.string.gaseometer_adress)));
        DetailsList.add(new Spot(getString(R.string.ludwig), getString(R.string.ludwig_desc), R.drawable.ludwig_descimage, getString(R.string.ludwig_opening), getString(R.string.ludwig_time), getString(R.string.ludwig_adress)));
        SpotAdapter adapter = new SpotAdapter(getActivity(), DetailsList);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(adapter);
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

