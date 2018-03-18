package com.example.android.gradient;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    public static final String EXTRA_USERNAME = "com.example.android.gradient.extra_USERNAME";
    private EditText mEdittext;
    public String mUsername;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        getSupportActionBar().hide();
    }

    public void toThirdActivity(View view) {
        mEdittext = findViewById(R.id.username_edittext);
        mUsername = mEdittext.getText().toString();
        Intent intent = new Intent(this, ThirdActivity.class);
        intent.putExtra(EXTRA_USERNAME,mUsername);
        startActivity(intent);
    }
}
