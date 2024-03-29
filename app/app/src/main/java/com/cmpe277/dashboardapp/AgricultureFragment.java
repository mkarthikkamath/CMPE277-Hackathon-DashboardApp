package com.cmpe277.dashboardapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

public class AgricultureFragment extends Fragment {
    public AgricultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_agriculture, container, false);

        // Find your checkboxes and set listeners or perform other actions as needed
        CheckBox checkBoxContributionGDP = rootView.findViewById(R.id.checkBoxContributionGDP);
        // Repeat for other checkboxes...

        return rootView;
    }

}
