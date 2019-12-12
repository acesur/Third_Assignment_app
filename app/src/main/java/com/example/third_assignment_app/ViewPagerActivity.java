package com.example.third_assignment_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.graphics.Color;
import android.os.Bundle;

import com.example.third_assignment_app.adapter.ViewPageAdapter;
import com.example.third_assignment_app.fragments.AboutFragment;
import com.example.third_assignment_app.fragments.AddStudentFragment;
import com.example.third_assignment_app.fragments.HomeFragment;
import com.google.android.material.tabs.TabLayout;

public class ViewPagerActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private TabLayout tabId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
        viewPager =findViewById(R.id.viewPager);
        tabId=findViewById(R.id.tabId);
        tabId.setSelectedTabIndicatorColor(Color.parseColor("#FFFFFF"));
        ViewPageAdapter viewPageAdapter = new ViewPageAdapter(getSupportFragmentManager());

        viewPageAdapter.addFragment(new HomeFragment(),"Home");
        viewPageAdapter.addFragment(new AddStudentFragment(),"Add");
        viewPageAdapter.addFragment(new AboutFragment(),"About Us");

        viewPager.setAdapter(viewPageAdapter);
        tabId.setupWithViewPager(viewPager);
    }
}
