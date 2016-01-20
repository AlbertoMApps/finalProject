package com.example.tae_user0.finalprojectapp1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Adapters.ScreenSlidePagerAdapter;
import com.example.tae_user0.finalprojectapp1.Api.RestaurantDetailsApi;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.Model.api3.RestaurantDetailsModel;
import com.example.tae_user0.finalprojectapp1.R;

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
    private RestaurantDetailsApi spRest;

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
        //final int restId = fr.getArguments().getInt("restId");
        final ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment3, container, false);
        //restAdapter of the models
        restAdapt = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();

        final int id= fr.getArguments().getInt("restId");
        //Example first query
        if(id!=0) {
            spRest = restAdapt.create(RestaurantDetailsApi.class);
            spRest.getSpanishRestaurantDetails(id, new Callback<RestaurantDetailsModel>() {
                @Override
                public void success(RestaurantDetailsModel detailsModel, Response response) {
                    RestaurantDetailsModel details= detailsModel;
                    //getToast(id+"pricerange   "+details.getPriceRange());
                    //receive the restaurant model to show the details in the 3rd fragment in case the detailsApi for restaurnts is not working
                    //send the model to the main activity
                    final SpanishRestaurantModel spModel= fr.getArguments().getParcelable("restModel");
                    final int pos = fr.getArguments().getInt("restModelPos");
                    //all the views for the final detail restaurants fragment
                    TextView txtTitle = (TextView) rootView.findViewById(R.id.txtRestName);
                    TextView txtAddress = (TextView) rootView.findViewById(R.id.txtAddress);
                    TextView txtCity = (TextView) rootView.findViewById(R.id.txtCity);
                    TextView txtPrice = (TextView) rootView.findViewById(R.id.txtPrice);
                    //setTexts
                    txtTitle.setText("Restaurant name: "+spModel.getRestaurants().get(pos).getRestaurant().getName());
                    txtAddress.setText("Restaurant address: " + spModel.getRestaurants().get(pos).getRestaurant().getLocation().getAddress());
                    txtCity.setText("Restaurant city: " + spModel.getRestaurants().get(pos).getRestaurant().getLocation().getCity());
                    txtPrice.setText("Price range: "+  spModel.getRestaurants().get(pos).getRestaurant().getPriceRange());

                    // Instantiate a ViewPager and a PagerAdapter.
                    ViewPager mPager = (ViewPager)rootView.findViewById(R.id.pager);
                    ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getActivity().getSupportFragmentManager(), spModel);
                    mPager.setAdapter(mPagerAdapter);

                }

                @Override
                public void failure(RetrofitError error) {

                }
            });

        } else{
            getToast("No restaurants found on this location");
        }
        return rootView;
    }

    //methods
    public void getToast(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}
