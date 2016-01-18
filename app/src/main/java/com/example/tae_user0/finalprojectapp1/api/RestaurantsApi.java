package com.example.tae_user0.finalprojectapp1.api;

import com.example.tae_user0.finalprojectapp1.model.api2.SpanishRestaurantModel;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Headers;
import retrofit.http.Query;

/**
 * Created by TAE_user0 on 15/01/2016.
 */
public interface RestaurantsApi {
    @Headers("user_key:99cd7c305d8c477c5751a32d4d28f62d")
    @GET("/api/v2.1/search?entity_type=city&cuisines=Spanish")
    public void getSpanishRestaurants(@Query("&entity_id") int cityID, Callback<SpanishRestaurantModel> response);
}
