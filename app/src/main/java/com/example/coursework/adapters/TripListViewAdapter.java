package com.example.coursework.adapters;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.coursework.R;
import com.example.coursework.models.Trip;

import java.util.ArrayList;

public class TripListViewAdapter extends BaseAdapter {

    ArrayList<Trip> tripArrayList;
    Context context;

    public TripListViewAdapter(Context context, ArrayList<Trip> tripArrayList) {
        this.context = context;
        this.tripArrayList = tripArrayList;
    }

    @Override
    public int getCount() {
        return tripArrayList.size();
    }

    @Override
    public Object getItem(int i) {
        return tripArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {
        return tripArrayList.get(i).getId();
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View viewTrip;
        if(view == null)
        {
            viewTrip = View.inflate(viewGroup.getContext(), R.layout.trips_view, null);
        }
        else viewTrip = view;

        Trip trip = (Trip) getItem(i);
        ((TextView) viewTrip.findViewById(R.id.trip_id)).setText(String.format("ID = %d", trip.getId()));
        ((TextView) viewTrip.findViewById(R.id.trip_name)).setText(String.format("Tên SP : %s", trip.getName()));
        ((TextView) viewTrip.findViewById(R.id.trip_date)).setText(String.format("Giá %s", trip.getDestination()));
        return viewTrip;
    }
}
