package com.example.mmark.sunshine;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private List<String> weekForcast;

    public MainActivityFragment() {

        String[] data = {
                "Zeile 1; Temperatur ... ur heiß",
                "Zeile 1; Temperatur ... ur heiß",
                "Zeile 2; Temperatur ... ur heiß",
                "Zeile 3; Temperatur ... ur heiß",
                "Zeile 4; Temperatur ... ur heiß",
                "Zeile 5; Temperatur ... ur heiß",
                "Zeile 6; Temperatur ... ur heiß",
                "Zeile 7; Temperatur ... ur heiß",
                "Zeile 8; Temperatur ... ur heiß",
                "Zeile 9; Temperatur ... ur heiß",

        };

        weekForcast = new ArrayList<>(Arrays.asList(data));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_main, container, false);

        final ArrayAdapter<String> stringArrayAdapter =
                new ArrayAdapter<String>(getActivity(), R.layout.list_item_forcast, R.id.list_item_forcast_textview, weekForcast);

        final ListView listView = (ListView) view.findViewById(R.id.listview_forecast);
        listView.setAdapter(stringArrayAdapter);

        return view;
    }
}
