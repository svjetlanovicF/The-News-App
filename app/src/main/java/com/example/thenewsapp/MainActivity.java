package com.example.thenewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabItem;
import com.google.android.material.tabs.TabLayout;


public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    TabItem generalTab, scienceTab, sportsTab, businessTab, healthTab, entertainmentTab,
    techTab, politicsTab, foodTab, travelTab;
    PagerAdapter pagerAdapter;
    Toolbar toolbar;
    ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        tabLayout = findViewById(R.id.tabLayout);
        generalTab = findViewById(R.id.general);
        scienceTab = findViewById(R.id.science);
        sportsTab = findViewById(R.id.sports);
        businessTab = findViewById(R.id.business);
        healthTab = findViewById(R.id.health);
        entertainmentTab = findViewById(R.id.entertainment);
        techTab = findViewById(R.id.tech);
        politicsTab = findViewById(R.id.politics);
        foodTab = findViewById(R.id.food);
        travelTab = findViewById(R.id.travel);

        viewPager = findViewById(R.id.container);
        pagerAdapter = new PagerAdapter(getSupportFragmentManager(), 10);   //number of fragments
        viewPager.setAdapter(pagerAdapter);

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                if(tab.getPosition()==0 || tab.getPosition()==1 || tab.getPosition()==2 || tab.getPosition()==3 || tab.getPosition()==4 || tab.getPosition()==5
                        || tab.getPosition()==6 || tab.getPosition()==7 || tab.getPosition()==8 || tab.getPosition()==9){
                    pagerAdapter.notifyDataSetChanged();
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

    }

}