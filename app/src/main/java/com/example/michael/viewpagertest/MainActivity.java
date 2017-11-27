package com.example.michael.viewpagertest;


import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;


public class MainActivity extends FragmentActivity {
    ViewPager mViewPager;
    ContentPagerAdapter mContentPagerAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_pager_layout);

        mContentPagerAdapter = new ContentPagerAdapter(getSupportFragmentManager());

        mContentPagerAdapter.add(new ContentFragment());
        mContentPagerAdapter.add(new ContentFragment());
        mContentPagerAdapter.add(new ContentFragment());
        mContentPagerAdapter.add(new ContentFragment());
        mContentPagerAdapter.add(new ContentFragment());

        mViewPager = findViewById(R.id.main);
        mViewPager.setAdapter(mContentPagerAdapter);
    }
}
