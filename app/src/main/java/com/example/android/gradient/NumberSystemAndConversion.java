package com.example.android.gradient;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class NumberSystemAndConversion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_system_and_conversion);
    }

    public void toNumberActivity(View view) {
        Intent intent = new Intent(this, Number.class);
        startActivity(intent);
    }

    public void toDecimalExplanation(View view) {
        Intent intent = new Intent(this, DecimalNumberSystem.class);
        startActivity(intent);
    }

    public void toBinaryExplanation(View view) {
        Intent intent = new Intent(this, BinaryNumberSystem.class);
        startActivity(intent);
    }

    public void toOctalExplanation(View view) {
        Intent intent = new Intent(this, OctalNumberSystem.class);
        startActivity(intent);
    }

    public void toHexadecimalExplanation(View view) {
        Intent intent = new Intent(this, HexadecimalNumberSystem.class);
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
