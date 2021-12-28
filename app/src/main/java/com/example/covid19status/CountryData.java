package com.example.covid19status;

import com.google.gson.annotations.SerializedName;

public class CountryData {
    @SerializedName("Country")
    String country_name;
    String CountryCode;
    String Slug;
    String NewConfirmed;
    String TotalConfirmed;
    String NewDeaths;
    String TotalDeaths;
    String NewRecovered;
    String TotalRecovered;
    @SerializedName("Date")
    String dateinfo;

    public CountryData(String country_name, String countryCode, String slug, String newConfirmed, String totalConfirmed, String newDeaths, String totalDeaths, String newRecovered, String totalRecovered, String dateinfo) {
        this.country_name = country_name;
        CountryCode = countryCode;
        Slug = slug;
        NewConfirmed = newConfirmed;
        TotalConfirmed = totalConfirmed;
        NewDeaths = newDeaths;
        TotalDeaths = totalDeaths;
        NewRecovered = newRecovered;
        TotalRecovered = totalRecovered;
        this.dateinfo = dateinfo;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getSlug() {
        return Slug;
    }

    public void setSlug(String slug) {
        Slug = slug;
    }

    public String getNewConfirmed() {
        return NewConfirmed;
    }

    public void setNewConfirmed(String newConfirmed) {
        NewConfirmed = newConfirmed;
    }

    public String getTotalConfirmed() {
        return TotalConfirmed;
    }

    public void setTotalConfirmed(String totalConfirmed) {
        TotalConfirmed = totalConfirmed;
    }

    public String getNewDeaths() {
        return NewDeaths;
    }

    public void setNewDeaths(String newDeaths) {
        NewDeaths = newDeaths;
    }

    public String getTotalDeaths() {
        return TotalDeaths;
    }

    public void setTotalDeaths(String totalDeaths) {
        TotalDeaths = totalDeaths;
    }

    public String getNewRecovered() {
        return NewRecovered;
    }

    public void setNewRecovered(String newRecovered) {
        NewRecovered = newRecovered;
    }

    public String getTotalRecovered() {
        return TotalRecovered;
    }

    public void setTotalRecovered(String totalRecovered) {
        TotalRecovered = totalRecovered;
    }

    public String getDateinfo() {
        return dateinfo;
    }

    public void setDateinfo(String dateinfo) {
        this.dateinfo = dateinfo;
    }
}
