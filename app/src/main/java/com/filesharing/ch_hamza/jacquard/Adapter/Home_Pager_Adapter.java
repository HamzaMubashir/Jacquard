package com.filesharing.ch_hamza.jacquard.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.filesharing.ch_hamza.jacquard.Fragments.Home;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CH-Hamza on 2/15/2018.
 */

public class Home_Pager_Adapter extends FragmentPagerAdapter {

    private final List<Home> mFragmentList = new ArrayList<Home>();
    private final List<String> mFragmentTitleList = new ArrayList<>();

    public Home_Pager_Adapter(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return null;
    }

    public void addFragment(Home fragment, String title) {
        mFragmentList.add(fragment);
        mFragmentTitleList.add(title);
    }
    @Override
    public CharSequence getPageTitle(int position) {
        return mFragmentTitleList.get(position);
    }


    @Override
    public int getCount() {
        return mFragmentList.size();
    }
}
