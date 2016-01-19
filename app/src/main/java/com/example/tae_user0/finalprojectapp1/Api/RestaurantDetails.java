package com.example.tae_user0.finalprojectapp1.Api;

import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by TAE_user0 on 19/01/2016.
 */
public interface RestaurantDetails {
    @Headers("user_key:99cd7c305d8c477c5751a32d4d28f62d")
    @GET("/api/v2.1/restaurant?")
    public void getSpanishRestaurantDetails(@Query("res_id") int resID, Callback<RestaurantDetails> response);
}

