package com.skeleton.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.List;

/**
 * Developer: Saurabh Verma
 * Dated: 03-03-2017.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> fragments;
    private String[] mTabTitles = new String[]{"Sign Up", "Sign In"};

    /**
     * Instantiates a new Pager adapter.
     *
     * @param fm        the fm
     * @param fragments the fragments
     */
    public PagerAdapter(final FragmentManager fm, final List<Fragment> fragments) {
        super(fm);
        this.fragments = fragments;

    }

    @Override
    public Fragment getItem(final int position) {
        return this.fragments.get(position);
    }

    @Override
    public int getCount() {
        if (fragments == null) {
            return 0;
        } else {
            return fragments.size();
        }
    }

    @Override
    public CharSequence getPageTitle(final int position) {
        return mTabTitles[position];
    }


    @Override
    public int getItemPosition(final Object object) {
        return POSITION_NONE;
    }
}
