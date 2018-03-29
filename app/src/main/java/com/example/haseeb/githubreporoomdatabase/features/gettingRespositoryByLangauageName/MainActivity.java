package com.example.haseeb.githubreporoomdatabase.features.gettingRespositoryByLangauageName;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.haseeb.githubreporoomdatabase.R;
import com.example.haseeb.githubreporoomdatabase.data.Respository;
import com.example.haseeb.githubreporoomdatabase.data.models.Item;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager viewPager;
    ProgressBar loadingbar;



    Button searchRespo;
    EditText seatchlanguage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.activity_tab_layout);
        viewPager = findViewById(R.id.activity_main_ViewPager);




        tabLayout.addTab(tabLayout.newTab().setText("Java"));
        tabLayout.addTab(tabLayout.newTab().setText("Kotlin"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);



        PaggerAdapter adapter = new PaggerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);
        viewPager.setOffscreenPageLimit(2);


        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }



    private class PaggerAdapter extends FragmentStatePagerAdapter {
        int number;

        public PaggerAdapter(FragmentManager supportFragmentManager, int tabCount) {
            super(supportFragmentManager);
            this.number = tabCount;

        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    JavaFragment javaFragment = new JavaFragment();
                    return javaFragment;
                case 1:
                    KotlinFragment kotlinFragment = new KotlinFragment();
                    return kotlinFragment;
                    default:
                        return null;
            }

        }

        @Override
        public int getCount() {
            return number;
        }
    }
}
