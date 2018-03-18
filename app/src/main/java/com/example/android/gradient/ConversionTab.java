package com.example.android.gradient;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Objects;

public class ConversionTab extends AppCompatActivity {

    private Spinner myFirstSpinner;
    private Spinner mySecondSpinner;
    private String myFirstNumberSystem;
    private String mySecondNumberSystem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_conversion_tab);

        myFirstSpinner = findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> firstAdapter = ArrayAdapter.createFromResource
                (this, R.array.first, R.layout.spinner_item);
        if (myFirstSpinner != null){
            myFirstSpinner.setAdapter(firstAdapter);
        }

        mySecondSpinner = findViewById(R.id.spinner2);
        ArrayAdapter<CharSequence> secondAdapter = ArrayAdapter.createFromResource
                (this, R.array.second, R.layout.spinner_item);
        if (mySecondSpinner != null){
            mySecondSpinner.setAdapter(secondAdapter);
        }

        myFirstSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                myFirstNumberSystem = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });

        mySecondSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                mySecondNumberSystem = adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {}
        });
    }

    @SuppressLint("NewApi")
    public void convert(View view) {
        String decimal = "Decimal", binary = "Binary" , octal = "Octal", hexadecimal = "Hexadecimal";

        if (Objects.equals(decimal, myFirstNumberSystem) && Objects.equals(binary, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s);
            String result = Integer.toBinaryString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        if (Objects.equals(decimal, myFirstNumberSystem) && Objects.equals(decimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(s);
        }
        else if (Objects.equals(decimal, myFirstNumberSystem) && Objects.equals(octal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s);
            String result = Integer.toOctalString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(decimal, myFirstNumberSystem) && Objects.equals(hexadecimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s);
            String result = Integer.toHexString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(binary, myFirstNumberSystem) && Objects.equals(decimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,2);
            String result = Integer.toString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(binary, myFirstNumberSystem) && Objects.equals(binary, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(s);
        }
        else if (Objects.equals(binary, myFirstNumberSystem) && Objects.equals(octal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,2);
            String result = Integer.toOctalString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(binary, myFirstNumberSystem) && Objects.equals(hexadecimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,2);
            String result = Integer.toHexString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(octal, myFirstNumberSystem) && Objects.equals(decimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,8);
            String result = Integer.toString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(octal, myFirstNumberSystem) && Objects.equals(binary, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,8);
            String result = Integer.toBinaryString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(octal, myFirstNumberSystem) && Objects.equals(octal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(s);
        }
        else if (Objects.equals(octal, myFirstNumberSystem) && Objects.equals(hexadecimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,8);
            String result = Integer.toHexString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(hexadecimal, myFirstNumberSystem) && Objects.equals(decimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,16);
            String result = Integer.toString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(hexadecimal, myFirstNumberSystem) && Objects.equals(binary, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,16);
            String result = Integer.toBinaryString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(hexadecimal, myFirstNumberSystem) && Objects.equals(octal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,16);
            String result = Integer.toOctalString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
        else if (Objects.equals(hexadecimal, myFirstNumberSystem) && Objects.equals(hexadecimal, mySecondNumberSystem)){
            EditText editTextOne = findViewById(R.id.firstEdittext);
            String s = editTextOne.getText().toString();
            int myIntValue = Integer.parseInt(s,16);
            String result = Integer.toHexString(myIntValue);
            TextView textView = findViewById(R.id.myLabel);
            textView.setText(result);
        }
    }
}
