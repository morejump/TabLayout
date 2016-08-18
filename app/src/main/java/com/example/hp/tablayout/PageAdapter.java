package com.example.hp.tablayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by HP on 8/17/2016.
 */
public class PageAdapter extends FragmentPagerAdapter {
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        Fragment fragment=null;
        switch (position) {
            case 0: {
                // do somthing here :))
                fragment = new tab01();
                break;
            }
            case 1: {
                fragment = new tab02();
                // do somthing here :))
                break;
            }
        }
        return fragment;
    }

    @Override
    public int getCount() {
        return 2;
    }
    // hí hí

    @Override
    public CharSequence getPageTitle(int position) {
        String title="";
        switch (position) {
            case 0: {
                title="Ngọc Trinh";
                break;
            }
            case 1: {
                title="Hà Thiên Lộn";
                break;
            }

        }
        return title;

    }
}

