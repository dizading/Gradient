package com.example.android.gradient;


import android.os.Bundle;
import android.support.design.internal.SnackbarContentLayout;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
public class Easy extends Fragment {

    private int score = 0;
    private Button mButton;


    public Easy() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.fragment_easy, container, false);

        //first question
        RadioGroup mFirstRadioGroup = view.findViewById(R.id.myFirstRadioGroup);
        mFirstRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.easyOnea: score += 0;
                        break;
                    case R.id.easyOneb: score += 0;
                        break;
                    case R.id.easyOnec:
                        score += 1;
                        break;
                    case R.id.easyOned: score += 0;
                        break;
                }
            }
        });

        //second question
        RadioGroup mSecondRadioGroup = view.findViewById(R.id.mSecondRadioGroup);
        mSecondRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.easyTwoa: score += 0;
                        break;
                    case R.id.easyTwob: score += 0;
                        break;
                    case R.id.easyTwoc: score += 0;
                        break;
                    case R.id.easyTwod:
                        score += 1;
                        break;
                }
            }
        });

        //third question
        RadioGroup mThirdRadioGroup = view.findViewById(R.id.mThirdRadioGroup);
        mThirdRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.easyThreea: score += 0;
                        break;
                    case R.id.easyThreeb: score += 0;
                        break;
                    case R.id.easyThreec: score += 0;
                        break;
                    case R.id.easyThreed:
                        score += 1;
                        break;
                }
            }
        });

        //4th question
        RadioGroup mFourthRadioGroup = view.findViewById(R.id.q4radioGroup);
        mFourthRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.easyq4a: score += 0;
                        break;
                    case R.id.easyq4b:
                        score += 1;
                        break;
                    case R.id.easyq4c: score += 0;
                        break;
                }
            }
        });

        //5th question
        RadioGroup mFifthRadioGroup = view.findViewById(R.id.q5radioGroup);
        mFifthRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.q5a: score += 0;
                        break;
                    case R.id.q5b:
                        score += 1;
                        break;
                }
            }
        });

        //6th question
        RadioGroup mSixthRadioGroup = view.findViewById(R.id.q6radioGroup);
        mSixthRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.q6a:
                        score += 1;
                        break;
                    case R.id.q6b: score += 0;
                        break;
                }
            }
        });

        //7th question
        RadioGroup mSeventhRadioGroup = view.findViewById(R.id.q7);
        mSeventhRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.q7a: score += 0;
                        break;
                    case R.id.q7b:
                        score += 1;
                        break;
                    case R.id.q7c: score += 0;
                        break;
                    case R.id.q7d: score += 0;
                        break;
                }
            }
        });

        //8th question
        RadioGroup mEighthRadioGroup = view.findViewById(R.id.q8);
        mEighthRadioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i){
                    case R.id.q8a:
                        score += 1;
                        break;
                    case R.id.q8b: score += 0;
                        break;
                    case R.id.q8c: score += 0;
                        break;
                    case R.id.q8d: score += 0;
                        break;
                }
            }
        });

        mButton = view.findViewById(R.id.easy_button);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String myToast = getString(R.string.you_got) + " " + score + " " + getString(R.string.outof);
                Toast.makeText(getContext(), myToast, Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

}
