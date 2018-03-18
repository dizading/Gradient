package com.example.android.gradient;


import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.zip.Inflater;


/**
 * A simple {@link Fragment} subclass.
 */
public class Moderate extends Fragment {

    private Button mButton;
    private int score = 0;


    public Moderate() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_moderate, container, false);

        //first question
        RadioGroup first = view.findViewById(R.id.mq1);
        first.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq1a:
                        score += 1;
                        break;
                    case R.id.mq1b: score += 0;
                        break;
                    case R.id.mq1c: score += 0;
                        break;
                    case R.id.mq1d: score += 0;
                        break;
                }
            }
        });
        
        //second question
        RadioGroup second = view.findViewById(R.id.mq2);
        second.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq1a: score += 0;
                        break;
                    case R.id.mq2b:
                        score += 1;
                        break;
                }
            }
        });

        //third question
        RadioGroup third = view.findViewById(R.id.mq3);
        third.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq3a:
                        score += 1;
                        break;
                    case R.id.mq3b: score += 0;
                        break;
                    case R.id.mq3c: score += 0;
                        break;
                    case R.id.mq3d: score += 0;
                        break;
                }
            }
        });

        //fourth question
        RadioGroup fourth = view.findViewById(R.id.mq4);
        fourth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq4a: score += 0;
                        break;
                    case R.id.mq4b:
                        score += 1;
                        break;
                    case R.id.mq4c: score += 0;
                        break;
                    case R.id.mq4d: score += 0;
                        break;
                }
            }
        });

        //fifth question
        RadioGroup fifth = view.findViewById(R.id.mq5);
        fifth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq5a: score += 0;
                        break;
                    case R.id.mq5b:
                        score += 1;
                        break;
                    case R.id.mq5c: score += 0;
                        break;
                    case R.id.mq5d: score += 0;
                        break;
                }
            }
        });

        //sixth question
        RadioGroup sixth = view.findViewById(R.id.mq6);
        sixth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq6a:
                        score += 1;
                        break;
                    case R.id.mq6b: score += 0;
                        break;
                }
            }
        });

        //seventh
        RadioGroup seventh = view.findViewById(R.id.mq7);
        seventh.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq7a:
                        score += 1;
                        break;
                    case R.id.mq7b: score += 0;
                        break;
                    case R.id.mq7c: score += 0;
                        break;
                    case R.id.mq7d: score += 0;
                        break;
                }
            }
        });

        //eighth
        RadioGroup eighth = view.findViewById(R.id.mq8);
        eighth.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.mq8a:
                        score += 1;
                        break;
                    case R.id.mq8b: score += 0;
                        break;
                    case R.id.mq8c: score += 0;
                        break;
                    case R.id.mq8d: score += 0;
                        break;
                }
            }
        });

        mButton = view.findViewById(R.id.moderate_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myToast = getString(R.string.you_got) + score + getString(R.string.outof);
                Toast.makeText(getContext(), myToast, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
