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
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.name.setText(arrayList.get(position).getName());
        holder.name.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int length=arrayList.get(position).getChild();
                if (length!=0)
                {

//                Intent intent = new Intent(activity,Sub_Categories.class);
//                  intent.putExtra("id",arrayList.get(position).getCategory_id());
//
//                  activity.startActivity(intent);
             }
                else
                {

//                    Intent intent=new Intent(activity,All_Products.class);
//                    intent.putExtra("Id",arrayList.get(position).getCategory_id());
//
//                    activity.startActivity(intent);

                }
            }
        });


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