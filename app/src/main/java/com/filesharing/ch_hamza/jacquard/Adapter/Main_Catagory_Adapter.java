package com.filesharing.ch_hamza.jacquard.Adapter;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.filesharing.ch_hamza.jacquard.Pojoclasses.Catagories;
import com.filesharing.ch_hamza.jacquard.R;

import java.util.ArrayList;

/**
 * Created by CH-Hamza on 2/19/2018.
 */

public class Main_Catagory_Adapter extends RecyclerView.Adapter<Main_Catagory_Adapter.MyViewHolder> {
    ArrayList<Catagories> arrayList= new ArrayList<>();
    Activity activity;
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.catagories,parent,false);
        return new MyViewHolder(view);
    }


//    @Override
//    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        return null;
//    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class MyViewHolder extends  RecyclerView.ViewHolder
    {
        TextView name;
        public MyViewHolder(View itemView) {
            super(itemView);
            name=(TextView)itemView.findViewById(R.id.name);
        }
    }
}