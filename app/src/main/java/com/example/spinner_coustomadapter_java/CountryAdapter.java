package com.example.spinner_coustomadapter_java;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;

public class CountryAdapter extends ArrayAdapter<CountryItem> {

    public CountryAdapter(Context context, ArrayList<CountryItem> countryList){
        super(context, 0, countryList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return initView(position, convertView, parent);
    }

    private View initView(int position, View convertView, ViewGroup parent){
        if (convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.country_spinner_coustom, parent, false);
        }
        // Initilize the imageview and textview to implement
        ImageView image = convertView.findViewById(R.id.country_image);
        TextView text = convertView.findViewById(R.id.country_name);

        CountryItem currentItem = getItem(position);
        if (currentItem != null) {
            image.setImageResource(currentItem.getFlagImage());
            text.setText(currentItem.getCountryName());
        }
        return  convertView;
    }
}



























































