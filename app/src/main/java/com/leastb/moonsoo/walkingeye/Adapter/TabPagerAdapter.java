package com.leastb.moonsoo.walkingeye.Adapter;

/**
 * Created by wisebody on 2017. 5. 29..
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.leastb.moonsoo.walkingeye.Fragment.TabFragment1;
import com.leastb.moonsoo.walkingeye.Fragment.TabFragment2;
import com.leastb.moonsoo.walkingeye.Fragment.TabFragment3;

/**
 * Created by Junyoung on 2016-06-23.
 */

public class TabPagerAdapter extends FragmentStatePagerAdapter {

    // Count number of tabs
    private int tabCount;
    public TabFragment1 tabFragment1;
    TabFragment2 tabFragment2;
    TabFragment3 tabFragment3;

    public TabPagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {

        // Returning the current tabs
        switch (position) {
            case 0:
                tabFragment1 = new TabFragment1();
                return tabFragment1;
            case 1:
                tabFragment2 = new TabFragment2();
                return tabFragment2;
            case 2:
                tabFragment3 = new TabFragment3();
                return tabFragment3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}