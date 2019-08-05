package com.example.spinner_coustomadapter_java;

public class CountryItem {
    private String CountryName;
    private int FlagImage;

    public CountryItem(String countryName, int flagImage) {
        CountryName = countryName;
        FlagImage = flagImage;
    }
    public String getCountryName() {
        return CountryName;
    }

    public int getFlagImage() {
        return FlagImage;
    }
}





