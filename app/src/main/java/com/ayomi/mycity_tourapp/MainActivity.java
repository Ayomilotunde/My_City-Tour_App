package com.ayomi.mycity_tourapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    private ViewPager myViewPager;
    private TabLayout myTabLayout;
    private TabAccessorAdapter myTabsAccessorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myViewPager = findViewById(R.id.view_pager);
        myTabsAccessorAdapter = new TabAccessorAdapter(getSupportFragmentManager());
        myViewPager.setAdapter(myTabsAccessorAdapter);

        myTabLayout = findViewById(R.id.tab_slider_layout);
        myTabLayout.setupWithViewPager(myViewPager);
    }
}