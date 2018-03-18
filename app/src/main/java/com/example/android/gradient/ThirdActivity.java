package com.example.android.gradient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private String mUsername;
    private TextView mTextview;
    private String mSetText;
    private boolean mRadiobutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_third);

        Intent intent = getIntent();
        mUsername = intent.getStringExtra(SecondActivity.EXTRA_USERNAME);
        mTextview = findViewById(R.id.hellow_user);
        mSetText = getString(R.string.welcome) + " "+ mUsername + getString(R.string.apos);
        mTextview.setText(mSetText);
    }

    public void onRadioButtonClicked(View view) {
        mRadiobutton = ((RadioButton) view).isChecked();
        switch (view.getId()) {
            case R.id.first_option:
                Intent intent = new Intent(this, NumberSystemAndConversion.class);
                startActivity(intent);
                break;
            case R.id.second_option:
                Intent intent1 = new Intent(this, Conversions.class);
                startActivity(intent1);
                break;
            case R.id.third_option:
                Intent intent2 = new Intent(this, Quiz.class);
                startActivity(intent2);
                break;
            case R.id.fourth_option:
                Intent intent3 = new Intent(this, ConversionTab.class);
                startActivity(intent3);
                break;
        }
    }
}
