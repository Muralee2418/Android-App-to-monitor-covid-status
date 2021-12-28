package com.example.covid19status;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Api {
    String BASE_URL="https://api.covid19api.com/";

    //@GET("marvel")
    //Call<List<Hero>> getHeroes();
    @GET("summary")
    Call<Summary> getCoronaData();
}
