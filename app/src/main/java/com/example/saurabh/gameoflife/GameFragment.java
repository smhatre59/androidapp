package com.example.saurabh.gameoflife;

import android.app.Fragment;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by saurabh on 13/6/16.
 */
public class GameFragment extends Fragment {
    View rootView;
    public int counter = 0;
    private final String PREFS_NAME  = "filename";
    private final String COUNTER_VALUE    = "count";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        rootView = inflater.inflate(R.layout.gamefragment,container,false);
        SharedPreferences sharedPreferences = this.getActivity().getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = sharedPreferences.edit();

        Button plusOne = (Button)(rootView.findViewById(R.id.plusone));
        Button plusTwo = (Button)(rootView.findViewById(R.id.plustwo));
        Button plusFour = (Button)(rootView.findViewById(R.id.plusfour));
        Button plusTen = (Button)(rootView.findViewById(R.id.plusten));
        Button minusOne = (Button)(rootView.findViewById(R.id.minusone));
        Button minusTwo = (Button)(rootView.findViewById(R.id.minustwo));
        Button minusFour = (Button)(rootView.findViewById(R.id.minusfour));
        Button minusTen = (Button)(rootView.findViewById(R.id.minusten));
        Button clear = (Button)(rootView.findViewById(R.id.clear));
        final TextView score = (TextView)(rootView.findViewById(R.id.score));
        TextView dailyGoal = (TextView)(rootView.findViewById(R.id.dialygoal));
//        counter =  sharedPreferences.getInt("count", 0);
//        score.setText(String.valueOf(counter));

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
        return rootView;
    }
}
