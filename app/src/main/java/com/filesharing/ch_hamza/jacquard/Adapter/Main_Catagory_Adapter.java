package com.filesharing.ch_hamza.jacquard.Adapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.filesharing.ch_hamza.jacquard.R;

/**
 * Created by CH-Hamza on 2/19/2018.
 */

public class Main_Catagory_Adapter extends RecyclerView.Adapter<Main_Catagory_Adapter.MyViewHolder> {


    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

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