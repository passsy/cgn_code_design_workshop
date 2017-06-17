package com.pascalwelsch.codeunddesign;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class UserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);

        final String username = getIntent().getExtras().getString("name");

        final TextView view = (TextView) findViewById(R.id.username);

        view.setText(username);

        final ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        viewPager.setAdapter(new ChildItemPagerAdapter(viewPager));


    }
}