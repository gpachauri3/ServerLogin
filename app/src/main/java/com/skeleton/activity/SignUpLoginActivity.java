package com.skeleton.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;


import com.skeleton.R;
import com.skeleton.fragment.SignInFragment;
import com.skeleton.fragment.SignUpFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * base
 */
public class SignUpLoginActivity extends BaseActivity {

    private ViewPager pager;
    private List<Fragment> fragmentList;
    private TabLayout tabLayout;

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        init();
        final com.skeleton.adapter.PagerAdapter adapter = new com.skeleton.adapter.PagerAdapter(getSupportFragmentManager(), fragmentList);
        pager.setAdapter(adapter);
        tabLayout.setupWithViewPager(pager);
    }

    /**
     * init
     */
    private void init() {
        pager = (ViewPager) findViewById(R.id.vpSwipe);
        tabLayout = (TabLayout) findViewById(R.id.sliding_tab);
        fragmentList = new ArrayList<>();
        fragmentList.add(new SignUpFragment());
        fragmentList.add(new SignInFragment());
    }
}
