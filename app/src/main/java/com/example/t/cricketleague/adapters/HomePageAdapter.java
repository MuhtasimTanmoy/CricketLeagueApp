package com.example.t.cricketleague.adapters;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.t.cricketleague.activity.Fragment1;
import com.example.t.cricketleague.activity.Fragment2;
import com.example.t.cricketleague.activity.Fragment3;


/** * Created by Tanmoy on 10/14/2016.
 */
public class HomePageAdapter extends FragmentPagerAdapter {

    private String fragments [] = {"Forum","Fixture","Quiz"};

    public HomePageAdapter(FragmentManager supportFragmentManager, Context applicationContext) {
        super(supportFragmentManager);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new Fragment1();
            case 1:
                return new Fragment2();
            case 2:
                return new Fragment();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return fragments[position];
    }
}
