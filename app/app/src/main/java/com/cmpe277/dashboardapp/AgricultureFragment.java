package com.cmpe277.dashboardapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class AgricultureFragment extends Fragment {
    private View rootView;
    private List<String[]> agricultureData; // List to store parsed CSV data
    private EditText startYearEditText, endYearEditText;
    private Button applyButton, showButton, annotationButton;
    private CheckBox checkBoxContributionGDP;
    // Define CheckBox variables for other checkboxes

    public AgricultureFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        rootView = inflater.inflate(R.layout.fragment_agriculture, container, false);

        // Initialize UI components
        startYearEditText = rootView.findViewById(R.id.start_year_edittext);
        endYearEditText = rootView.findViewById(R.id.end_year_edittext);
        applyButton = rootView.findViewById(R.id.apply_button);
        showButton = rootView.findViewById(R.id.show_button);
        annotationButton = rootView.findViewById(R.id.annotation_button);
        checkBoxContributionGDP = rootView.findViewById(R.id.checkBoxContributionGDP);
        // Initialize CheckBox variables for other checkboxes

        // Read CSV file and parse data
        agricultureData = readCSVData(); // Implement this method to read and parse CSV file

        // Handle Show button click
        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                filterDataAndDisplay();
            }
        });

        return rootView;
    }

    // Method to read CSV file and parse data
    private List<String[]> readCSVData() {
        List<String[]> data = new ArrayList<>();
        InputStream inputStream = getResources().openRawResource(R.raw.agriculture_data); // Replace with your CSV file
        BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
        String line;
        try {
            while ((line = reader.readLine()) != null) {
                String[] row = line.split(","); // Split CSV rows by comma
                data.add(row);
            }
            reader.close();
            inputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return data;
    }

    // Method to filter data based on selected checkboxes and display results
    private void filterDataAndDisplay() {
        String startYear = startYearEditText.getText().toString();
        String endYear = endYearEditText.getText().toString();

        // Implement filtering logic based on selected checkboxes and provided start/end years
        List<String[]> filteredData = new ArrayList<>();
        for (String[] row : agricultureData) {
            // Implement your filtering conditions here based on checkbox selection and year range
            if (checkBoxContributionGDP.isChecked()) {
                // Add filtering logic for Contribution to GDP checkbox
            }
            // Add filtering logic for other checkboxes
        }

        // Display filtered data or perform other actions as needed
        Toast.makeText(getActivity(), "Filtered data: " + filteredData.size(), Toast.LENGTH_SHORT).show();
    }
}

