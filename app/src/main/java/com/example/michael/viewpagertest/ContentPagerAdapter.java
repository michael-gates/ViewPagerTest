package com.example.michael.viewpagertest;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import java.util.Vector;


public class ContentPagerAdapter extends FragmentStatePagerAdapter {
    Vector<ContentFragment> fragments = new Vector<>();

    public ContentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.elementAt(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }


    public void add(ContentFragment fragment) {
        fragments.add(fragment);
    }
}
