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
public class HotelsFragment extends Fragment {
    private String Description;
    private int ImageId;
    private String Title;
    private String Time;
    private int flag = 4;
    private String address;

    public HotelsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.details_list, container, false);
        final ArrayList<Spot> DetailsList = new ArrayList<>();
        DetailsList.add(new Spot(getString(R.string.tryp), getString(R.string.tryp_desc), R.drawable.tryp_descimage, getString(R.string.tryp_opening), getString(R.string.tryp_adress)));

        DetailsList.add(new Spot(getString(R.string.nh), getString(R.string.nh_desc), R.drawable.nh_descimage, getString(R.string.nh_opening), getString(R.string.nh_adress)));
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
                address = pos.getmAddress();
                Intent next = new Intent(getActivity(), SpotDescriptionActivity.class);
                next.putExtra(getString(R.string.title), Title);
                next.putExtra(getString(R.string.desc), Description);
                next.putExtra("1", ImageId);
                next.putExtra(getString(R.string.time), Time);
                next.putExtra(getString(R.string.flag), flag);
                next.putExtra(getString(R.string.address), address);
                startActivity(next);
            }
        });
        return rootView;
    }
}
