package com.example.mashal.resplash.pager_adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by mashal on 2018-04-18.
 */
    public class main_pager extends FragmentPagerAdapter {
    private int num_tab = 3;
    private String[] titles= {"NEW", "FEATURED","COLLECTION"};

    public main_pager(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new NEW();
            case 1:
                return new FEATURED();
            case 2:
                return new COLLECTION();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return num_tab;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return titles[position];
    }
}
