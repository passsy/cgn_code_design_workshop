package com.pascalwelsch.codeunddesign;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.UUID;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.next_activity);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                // called for every click
                Log.v("click", "button clicked");
                final Intent intent = new Intent(MainActivity.this, UserActivity.class);
                intent.putExtra("name", "Max-" + UUID.randomUUID().toString());
                startActivity(intent);
            }
        });
        final FrameLayout container = (FrameLayout) findViewById(R.id.container);

        final User userA = new User("A", 20);
        final User userB = new User("B", 18);

        final View switchFragment = findViewById(R.id.switch_fragment);
        switchFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final UserFragment userFragment = new UserFragment();

                final Bundle bundle = new Bundle();
                bundle.putString("name", "Max-" + UUID.randomUUID().toString());
                bundle.putSerializable("parcelable", userB);
                userFragment.setArguments(bundle);

                container.removeAllViews();

                getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.container, userFragment)
                        .commit();
            }
        });

        final View switchView = findViewById(R.id.switch_view);
        switchView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View v) {
                final UserView userView = new UserView(MainActivity.this, userB);
                container.removeAllViews();
                container.addView(userView);
            }
        });

    }
}
