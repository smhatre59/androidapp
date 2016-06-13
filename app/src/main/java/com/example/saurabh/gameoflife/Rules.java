package com.example.saurabh.gameoflife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.widget.TextView;

/**
 * Created by saurabh on 12/6/16.
 */
public class Rules extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        Intent i = getIntent();
        TextView rules = (TextView)(findViewById(R.id.rules));
        TextView ruleslabel = (TextView)(findViewById(R.id.ruleslabel));
        ruleslabel.setGravity(Gravity.CENTER_HORIZONTAL);
        rules.setText(R.string.rules_text);

    }
}
