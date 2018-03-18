package com.example.android.gradient;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

public class Quiz extends AppCompatActivity {

    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mTabLayout = (TabLayout)findViewById(R.id.tab_layout);
        mViewPager = (ViewPager)findViewById(R.id.view_pager);

        mViewPager.setAdapter(new myFragmentPagerAdapter(getSupportFragmentManager()));
        mTabLayout.setupWithViewPager(mViewPager);
    }

    public class myFragmentPagerAdapter extends FragmentPagerAdapter{

        String mTitle[] = {"Easy","Moderate","Advanced"};

        public myFragmentPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new Easy();
                case 1:
                    return new Moderate();
                case 2:
                    return new Advanced();
                default:
                    return null;
            }
        }

        @Override
        public int getCount() {
            return mTitle.length;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            return mTitle[position];
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.conversion_tab){
            Intent intent = new Intent(this, ConversionTab.class);
            startActivity(intent);
        }
        return true;
    }

    public void first(View view){
        boolean checked = ((RadioButton)view).isChecked();
        switch (view.getId()){
            case R.id.easyOnea:
                if (checked)
                    Toast.makeText(this, "Right", Toast.LENGTH_SHORT).show();
                break;
            case R.id.easyOneb:
                if (checked)
                    Toast.makeText(this,"Not right!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.easyOnec:
                if (checked)
                    Toast.makeText(this,"Right!",Toast.LENGTH_SHORT).show();
                break;
            case R.id.easyOned:
                if (checked)
                    Toast.makeText(this,"Not right!",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
