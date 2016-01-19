package com.example.tae_user0.finalprojectapp1.Api;

import com.example.tae_user0.finalprojectapp1.Model.api1.CitiesModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by TAE_user0 on 16/01/2016.
 */
public interface CitiesApi {
    @Headers("user_key:99cd7c305d8c477c5751a32d4d28f62d")
    @GET("/api/v2.1/cities")
    public void getCities(@Query("q") String city, Callback<CitiesModel> response);
}
