package com.cmpe277.hackathon_cmpe277;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.Toast;

import com.cmpe277.hackathon_cmpe277.sqldb.DBController;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link macro_graph#newInstance} factory method to
 * create an instance of this fragment.
 */
public class macro_graph extends Fragment {

    GraphView graph;
    DBController controller;
    ListAdapter adapter;
    ArrayList<HashMap<String, String>> myList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public macro_graph() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment macro_graph.
     */
    // TODO: Rename and change types and number of parameters
    public static macro_graph newInstance(String param1, String param2) {
        macro_graph fragment = new macro_graph();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_macro, container, false);

//        String country = getIntent().getExtras().getString("country");
//        System.out.println(country);
//        String fromYear = getIntent().getExtras().getString("fromYear");
//        System.out.println(fromYear);
//        String toYear = getIntent().getExtras().getString("toYear");
//        System.out.println(toYear);
//        String gdp = getIntent().getExtras().getString("gdp");
//        System.out.println(gdp);
//        String fdiinflows = getIntent().getExtras().getString("fdiinflow");
//        System.out.println(fdiinflows);
//        String fdioutflows = getIntent().getExtras().getString("fdioutflow");
//        System.out.println(fdioutflows);
//        String ieflow = getIntent().getExtras().getString("ieFlow");
//        System.out.println(ieflow);

//
//        graph = (GraphView) rootView.findViewById(R.id.graph);
//        graph.setVisibility(View.VISIBLE);
//
//        controller = new DBController(getContext());
//
//        myList = controller.getAllProducts();
//
//        int i=0;
//        if (myList.size() != 0) {
//
//            DataPoint init = new DataPoint(0, 1);
//            DataPoint[] dataPoints = new DataPoint[61];
//
//            dataPoints[0] = init;
//            try {
//
//                while (i<myList.size()){
//                    Double x = Double.valueOf(myList.get(i).get("a"));
//                    Double y = Double.valueOf(myList.get(i).get("b"));
//                    DataPoint dp = new DataPoint(x,y);
//                    dataPoints[i] = dp;
//                    i++;
//                }
//
//                LineGraphSeries< DataPoint > series = new LineGraphSeries < > (dataPoints);
//                graph.addSeries(series);
//            } catch (IllegalArgumentException e) {
//                Toast.makeText(getContext(), e.getMessage(), Toast.LENGTH_LONG).show();
//            }
//        }

        return rootView;
    }
}