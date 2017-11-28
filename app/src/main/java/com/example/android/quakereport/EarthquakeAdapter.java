package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by LUPECASA on 26/11/2017.
 */
public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();

    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes) {
        super(context, 0, earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentAndroidFlavor = getItem(position);

        TextView magnitudTextView = (TextView) listItemView.findViewById(R.id.magnitud);
        magnitudTextView.setText(currentAndroidFlavor.getMagnitud());

        TextView lugarTextView = (TextView) listItemView.findViewById(R.id.lugar);
        lugarTextView.setText(currentAndroidFlavor.getLugar());

        TextView fechaTextView = (TextView) listItemView.findViewById(R.id.fecha);
        fechaTextView.setText(currentAndroidFlavor.getFecha());

        return listItemView;
    }
}
