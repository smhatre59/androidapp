package com.example.saurabh.gameoflife;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    public int counter = 0;
    private final String PREFS_NAME  = "filename";
    private final String COUNTER_VALUE    = "count";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Context ctx   = getApplicationContext();
        SharedPreferences sharedPreferences = ctx.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        Button plusOne = (Button)(findViewById(R.id.plusone));
        Button plusTwo = (Button)(findViewById(R.id.plustwo));
        Button plusFour = (Button)(findViewById(R.id.plusfour));
        Button plusTen = (Button)(findViewById(R.id.plusten));
        Button minusOne = (Button)(findViewById(R.id.minusone));
        Button minusTwo = (Button)(findViewById(R.id.minustwo));
        Button minusFour = (Button)(findViewById(R.id.minusfour));
        Button minusTen = (Button)(findViewById(R.id.minusten));
        Button clear = (Button)(findViewById(R.id.clear));
        final TextView score = (TextView)(findViewById(R.id.score));
        TextView dailyGoal = (TextView)(findViewById(R.id.dialygoal));
        counter =  sharedPreferences.getInt("count", 0);
        score.setText(String.valueOf(counter));

        plusOne.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                    counter = counter + 1;
                    score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();

                    }
                }
        );
        plusTwo.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter + 2;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();
                    }
                }
        );
        plusFour.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter + 4;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();
                    }
                }
        );
        plusTen.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter + 10;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();
                    }
                }
        );
        minusOne.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter - 1;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();
                    }
                }
        );
        minusTwo.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter - 2;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();

                    }
                }
        );
        minusFour.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter - 4;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();

                    }
                }
        );
        minusTen.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = counter - 10;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();

                    }
                }
        );

        clear.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        counter = 0;
                        score.setText(String.valueOf(counter));
                        editor.putInt(COUNTER_VALUE, counter);
                        editor.commit();

                    }
                }
        );
    }

    public void onDestroy() {
        super.onDestroy();

    }
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        Fragment objFragment = null;
        if (id == R.id.Home) {
            // Handle the camera action

        } else if (id == R.id.Rules) {
            objFragment = new RulesFragment();

        } else if (id == R.id.scoringSchedule) {

        } else if (id == R.id.nav_manage) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_send) {

        }
        android.app.FragmentManager fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container,objFragment).commit();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
