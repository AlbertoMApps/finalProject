package com.example.tae_user0.finalprojectapp1.Api;

import com.example.tae_user0.finalprojectapp1.Model.api2.Restaurant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.Model.api4.CoordinatesModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by TAE_user0 on 25/01/2016.
 */
public interface RestaurantsApiAllCitiesMaps {
    @Headers("user_key:99cd7c305d8c477c5751a32d4d28f62d")
    @GET("/api/v2.1/search?entity_type=city&cuisines=Spanish&entity_id=61")
//    @GET("/api/v2.1/geocode?lat=51.510210&lon=-0.070880")
    //https://developers.zomato.com/api/v2.1/geocode?lat=51.510210&lon=-0.070880
    public void getAllSpanishRestaurants(Callback<SpanishRestaurantModel> response);
}
