package com.example.spinner_coustomadapter_java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    private ArrayList<CountryItem> reference_countryitem;
    private CountryAdapter mCountryAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initList();
        Spinner spinnerCountries = findViewById(R.id.spinner_country);
        mCountryAdapter = new CountryAdapter(this, reference_countryitem);
        spinnerCountries.setAdapter(mCountryAdapter);

        spinnerCountries.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int posotion, long id) {
                CountryItem clickItem = (CountryItem) adapterView.getItemAtPosition(posotion);
                String clickedCountryName = clickItem.getCountryName();
                Toast.makeText(MainActivity.this, clickedCountryName + " Selected", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

    }
    private void initList(){
        reference_countryitem = new ArrayList<>();
        reference_countryitem.add(new CountryItem("India", R.drawable.in));
        reference_countryitem.add(new CountryItem("Argentina", R.drawable.ar));
        reference_countryitem.add(new CountryItem("Afganisthan", R.drawable.af));
        reference_countryitem.add(new CountryItem("Bangladash", R.drawable.bd));
    }
}



















































































