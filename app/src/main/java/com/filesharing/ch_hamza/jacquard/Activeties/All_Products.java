package com.filesharing.ch_hamza.jacquard.Activeties;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.filesharing.ch_hamza.jacquard.Pojoclasses.Products_pojo;
import com.filesharing.ch_hamza.jacquard.R;

import java.util.ArrayList;

public class All_Products extends AppCompatActivity {
    ArrayList<Products_pojo> arrayList=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all__products);
    }
}
