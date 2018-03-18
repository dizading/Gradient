package com.example.android.gradient;

import android.content.Intent;
import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class Conversions extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conversions);
    }

    public void toDecimaltoBinaryExplanation(View view) {
        Intent intent = new Intent(this, DecimaltoBinary.class);
        startActivity(intent);
    }

    public void toBinarytoDecimalExplanation(View view) {
        Intent intent = new Intent(this, BinarytoDecimal.class);
        startActivity(intent);
    }

    public void onDecimaltoOctal(View view) {
        Intent intent = new Intent(this, DecimaltoOctal.class);
        startActivity(intent);
    }

    public void toOctaltoDecimal(View view) {
        Intent intent = new Intent(this, OctaltoDecimal.class);
        startActivity(intent);
    }

    public void toDecimaltoHexadecimal(View view) {
        Intent intent = new Intent(this, DecimaltoHexadecimal.class);
        startActivity(intent);
    }

    public void toHexadecimaltoDecimal(View view) {
        Intent intent = new Intent(this, HexadecimaltoDecimal.class);
        startActivity(intent);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.first_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.conversion_tab){
            Intent intent = new Intent(this, ConversionTab.class);
            startActivity(intent);
        }
        return  true;
    }
}
