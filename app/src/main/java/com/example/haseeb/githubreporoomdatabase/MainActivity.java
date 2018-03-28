package com.example.haseeb.githubreporoomdatabase;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity implements RespsitoryView {

    TabLayout tabLayout;
    ViewPager viewPager;

    RepositoryPresenterImpl presenter;
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
        searchRespo = findViewById(R.id.activity_main_searchBtn);
        seatchlanguage = findViewById(R.id.activity_main_Edit_SearchRepositoryByName);
        searchRespo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                presenter.GettingLangiageName(seatchlanguage.getText().toString());
            }
        });


        presenter = new RepositoryPresenterImpl(new Model(), this);
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

    @Override
    public void GettingRepositoryList(List<RespoModel> respoModels) {
        Toast.makeText(getApplicationContext(), "reponce sucess", Toast.LENGTH_SHORT).show();

    }

    @Override
    public void GettingEmptyRepository() {
        Toast.makeText(getApplicationContext(), " Empty reponce sucess", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void GettingErrorRespository() {
        Toast.makeText(getApplicationContext(), " Error in reponce ", Toast.LENGTH_SHORT).show();
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
            }
            return null;
        }

        @Override
        public int getCount() {
            return 0;
        }
    }
}
