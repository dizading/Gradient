package com.example.android.gradient;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Advanced extends Fragment {

    private Button mButton;
    private int score = 0;


    public Advanced() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_advanced, container, false);

        //first
        RadioGroup first = view.findViewById(R.id.aq1);
        first.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq1a: score += 0;
                        break;
                    case R.id.aq1b: score += 0;
                        break;
                    case R.id.aq1c: score += 0;
                        break;
                    case R.id.aq1d:
                        score += 1;
                        break;
                }
            }
        });

        //second question
        RadioGroup second = view.findViewById(R.id.aq2);
        second.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq2a: score += 0;
                        break;
                    case R.id.aq2b: score += 0;
                        break;
                    case R.id.aq2c:
                        score += 1;
                        break;
                    case R.id.aq2d: score += 0;
                        break;
                }
            }
        });

        //third question
        RadioGroup third = view.findViewById(R.id.aq3);
        third.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq3a: score += 0;
                        break;
                    case R.id.aq3b:
                        score += 1;
                        break;
                }
            }
        });

        //fourth question
        RadioGroup fourth = view.findViewById(R.id.aq4);
        fourth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq4a: score += 0;
                        score += 1;
                        break;
                    case R.id.aq4b: score += 0;
                        break;
                    case R.id.aq4c: score += 0;
                        break;
                    case R.id.aq4d:
                        break;
                }
            }
        });

        //fifth question
        RadioGroup fifth = view.findViewById(R.id.aq5);
        fifth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq5a: score += 0;
                        break;
                    case R.id.aq5b:
                        score += 1;
                        break;
                    case R.id.aq5c: score += 0;
                        break;
                    case R.id.aq5d: score += 0;
                        break;
                }
            }
        });

        //sixth question
        RadioGroup sixth = view.findViewById(R.id.aq6);
        sixth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq6a: score += 0;
                        break;
                    case R.id.aq6b: score += 0;
                        break;
                    case R.id.aq6c: score += 0;
                        break;
                    case R.id.aq6d:
                        score += 1;
                        break;
                }
            }
        });

        //seventh question
        RadioGroup seventh = view.findViewById(R.id.aq7);
        seventh.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq7a:
                        score += 1;
                        break;
                    case R.id.aq7b: score += 0;
                        break;
                    case R.id.aq7c: score += 0;
                        break;
                    case R.id.aq7d: score += 0;
                        break;
                }
            }
        });

        //eighth question
        RadioGroup eighth = view.findViewById(R.id.aq8);
        eighth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.aq8a: score += 0;
                        break;
                    case R.id.aq8b: score += 0;
                        break;
                    case R.id.aq8c: score += 0;
                        break;
                    case R.id.aq8d:
                        score += 1;
                        break;
                }
            }
        });

        mButton = view.findViewById(R.id.advanced_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myToast = getString(R.string.you_got)+ " " + score + " " +getString(R.string.outof);
                Toast.makeText(getContext(), myToast, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
