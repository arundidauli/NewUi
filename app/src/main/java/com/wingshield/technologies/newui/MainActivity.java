package com.wingshield.technologies.newui;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.wingshield.technologies.newui.fragment.AppointmentFragment;
import com.wingshield.technologies.newui.fragment.HomeFragment;
import com.wingshield.technologies.newui.fragment.InboxFragment;
import com.wingshield.technologies.newui.fragment.ProfileFragment;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    final Fragment homeFragment = new HomeFragment();
    final Fragment inboxFragment = new InboxFragment();
    final Fragment appointmentFragment = new AppointmentFragment();
    final Fragment profileFragment = new ProfileFragment();
    @SuppressLint("NonConstantResourceId")
    private final BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = item -> {
        switch (item.getItemId()) {
            case R.id.nearby:
                loadFragment(homeFragment);
                return true;
            case R.id.home:
                loadFragment(inboxFragment);
                return true;
            case R.id.profile:
                loadFragment(appointmentFragment);
                return true;
            case R.id.chat:
                loadFragment(profileFragment);
                return true;
        }
        return false;

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        /*int menuItemId = navigation.getMenu().getItem(2).getItemId();
        BadgeDrawable badge = navigation.getOrCreateBadge(menuItemId);
        badge.setNumber(0);*/
        loadFragment(homeFragment);

    }

    private void loadFragment(Fragment fragment) {
        if (fragment != null) {
            FragmentManager manager = getSupportFragmentManager();
            FragmentTransaction transaction = manager.beginTransaction();
            transaction.replace(R.id.fragment_container, fragment).commit();
        }
    }
}