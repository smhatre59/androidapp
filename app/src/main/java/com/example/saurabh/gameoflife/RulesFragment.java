package com.example.saurabh.gameoflife;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by saurabh on 13/6/16.
 */
public class RulesFragment extends Fragment {
    View rootView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.rules,container,false);
        TextView rules = (TextView)(rootView.findViewById(R.id.rules));
        TextView ruleslabel = (TextView)(rootView.findViewById(R.id.ruleslabel));
        ruleslabel.setGravity(Gravity.CENTER_HORIZONTAL);
        rules.setText(R.string.rules_text);
        return rootView;
    }
}
