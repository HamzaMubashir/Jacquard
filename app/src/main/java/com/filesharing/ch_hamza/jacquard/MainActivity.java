package com.filesharing.ch_hamza.jacquard;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Toolbar;

import com.filesharing.ch_hamza.jacquard.Adapter.Home_Pager_Adapter;
import com.filesharing.ch_hamza.jacquard.Fragments.Home;
import com.filesharing.ch_hamza.jacquard.Fragments.Home2;

public class MainActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    Home_Pager_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


//        setContentView(R.layout.activity_main);
//
//        Toolbar toolbar = (Toolbar) findViewById(R.id.bar);
//        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(),R.color.black));
//        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowTitleEnabled(false);


        viewPager = (ViewPager)findViewById(R.id.viewpager);
        setupViewPager(viewPager);
        tabLayout = (TabLayout)findViewById(R.id.tablayout);
        tabLayout.setupWithViewPager(viewPager);



    }

    public void setupViewPager(ViewPager upViewPager) {

       Home_Pager_Adapter adapter = new Home_Pager_Adapter(getSupportFragmentManager());
        adapter.addFragment( new Home2(), "HOME");
        upViewPager.setAdapter(adapter);
    }
}
