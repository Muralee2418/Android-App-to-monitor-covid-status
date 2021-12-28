package com.example.covid19status;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Summary {
    @SerializedName("Global")
    Globaldata globaldata;
    @SerializedName("Countries")
    List<CountryData> countryData;

    public Summary(Globaldata globaldata, List<CountryData> countryData) {
        this.globaldata = globaldata;
        this.countryData = countryData;
    }

    public Globaldata getGlobaldata() {
        return globaldata;
    }

    public void setGlobaldata(Globaldata globaldata) {
        this.globaldata = globaldata;
    }

    public List<CountryData> getCountryData() {
        return countryData;
    }

    public void setCountryData(List<CountryData> countryData) {
        this.countryData = countryData;
    }
}
