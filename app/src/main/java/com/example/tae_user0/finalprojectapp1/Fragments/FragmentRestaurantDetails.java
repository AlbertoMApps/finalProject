package com.example.tae_user0.finalprojectapp1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Api.RestaurantDetails;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by TAE_user0 on 19/01/2016.
 */
public class FragmentRestaurantDetails extends Fragment {
    private static FragmentRestaurantDetails fr;
    private RestAdapter restAdapt;
    private RestaurantDetails spRest;

    public FragmentRestaurantDetails() {

    }
    public static FragmentRestaurantDetails newInstance(Bundle args){
        fr = new FragmentRestaurantDetails();
        fr.setArguments(args);
        return fr;

    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        int restId = fr.getArguments().getInt("restId");
        //restAdapter of the models
        restAdapt = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        int id= fr.getArguments().getInt("restId");
        //Example first query
        if(id!=0) {
            spRest = restAdapt.create(RestaurantDetails.class);
            spRest.getSpanishRestaurantDetails(id, new Callback<RestaurantDetails>() {
                @Override
                public void success(RestaurantDetails restaurantDetails, Response response) {

                }

                @Override
                public void failure(RetrofitError error) {

                }
            });
        } else{
            getToast("No restaurants found on this location");
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    //methods
    public void getToast(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
