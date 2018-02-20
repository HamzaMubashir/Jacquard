package com.filesharing.ch_hamza.jacquard.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.filesharing.ch_hamza.jacquard.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class Catagories extends Fragment {

    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;


    public Catagories() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       // return inflater.inflate(R.layout.fragment_catagories, container, false);
        final View view = inflater.inflate(R.layout.fragment_home, container, false);

        recyclerView=(RecyclerView)view.findViewById(R.id.model_recyclerView);
        layoutManager=new GridLayoutManager(getActivity(),1);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);

        return view;
    }

}
