package com.wingshield.technologies.newui.activities;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.tbuonomo.viewpagerdotsindicator.DotsIndicator;
import com.wingshield.technologies.newui.R;
import com.wingshield.technologies.newui.fragment.StoriesFragment;
import com.wingshield.technologies.newui.model.Stories;

import java.util.ArrayList;
import java.util.List;

public class StoriesActivity extends AppCompatActivity {

    ViewPagerAdapter viewPagerAdapter;
    List<Stories> storiesList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stories);
        storiesList = new ArrayList<>();
        DotsIndicator dotsIndicator = findViewById(R.id.dots_indicator);
        ViewPager viewPager = findViewById(R.id.view_pager);
        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        demo_data();
        for (int i = 0; i < storiesList.size(); i++) {
            viewPagerAdapter.addFragment(new StoriesFragment(storiesList.get(i).getImage_url()));
            viewPager.setAdapter(viewPagerAdapter);

        }
        dotsIndicator.setViewPager(viewPager);
    }

    private void demo_data() {
        storiesList.add(new Stories("1", "https://www.wingshieldtechnologies.com/loveknot_api/uploads/userprofile/6009154877db5.png"));
        storiesList.add(new Stories("2", "https://www.wingshieldtechnologies.com/loveknot_api/uploads/userprofile/6009154877db5.png"));
        storiesList.add(new Stories("3", "https://www.wingshieldtechnologies.com/loveknot_api/uploads/userprofile/6009154877db5.png"));
        storiesList.add(new Stories("4", "https://www.wingshieldtechnologies.com/loveknot_api/uploads/userprofile/6009154877db5.png"));
        storiesList.add(new Stories("5", "https://www.wingshieldtechnologies.com/loveknot_api/uploads/userprofile/6009154877db5.png"));
    }

    static class ViewPagerAdapter extends FragmentPagerAdapter {
        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();

        ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @NonNull
        @Override
        public Fragment getItem(int position) {
            return mFragmentList.get(position);
        }

        @Override
        public int getCount() {
            return mFragmentList.size();
        }


        void addFragment(Fragment fragment) {
            mFragmentList.add(fragment);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mFragmentTitleList.get(position);
        }

    }
}