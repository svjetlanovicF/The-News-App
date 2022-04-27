package com.example.thenewsapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import fragmenti.BusinessFragment;
import fragmenti.EntertainmentFragment;
import fragmenti.FoodFragment;
import fragmenti.GeneralFragment;
import fragmenti.HealthFragment;
import fragmenti.PoliticsFragment;
import fragmenti.ScienceFragment;
import fragmenti.SportsFragment;
import fragmenti.TechFragment;
import fragmenti.TravelFragment;

public class PagerAdapter extends FragmentPagerAdapter {

    int count;

    public PagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
        count = behavior;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new GeneralFragment();
            case 1:
                return new ScienceFragment();
            case 2:
                return new SportsFragment();
            case 3:
                return new BusinessFragment();
            case 4:
                return new HealthFragment();
            case 5:
                return new EntertainmentFragment();
            case 6:
                return new TechFragment();
            case 7:
                return new PoliticsFragment();
            case 8:
                return new FoodFragment();
            case 9:
                return new TravelFragment();
            default:
                return null;
        }

    }

    @Override
    public int getCount() {
        return count;
    }
}
