package com.example.third_assignment_app.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPageAdapter extends FragmentPagerAdapter {
    private List<Fragment>fragmentList = new ArrayList<>();
    private List<String> fragmentTitle=new ArrayList<>();
    //constructor
    public ViewPageAdapter(FragmentManager fm){
        super(fm);
    }
    @Override
    public Fragment getItem(int i){
       // return null;
        return fragmentList.get(i);
    }
    @Override
    public int getCount(){
       // return 0;
        return fragmentList.size();
    }
    @NonNull
    @Override
    public CharSequence getPageTitle(int position){
        return fragmentTitle.get(position);
    }
    public void addFragment(Fragment fragment, String title){
        fragmentList.add(fragment);
        fragmentTitle.add(title);
    }

}
