package com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart2;


import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Api.CitiesApi;
import com.example.tae_user0.finalprojectapp1.Api.RestaurantsApiAllCitiesMaps;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api2.Restaurant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.Model.api4.CoordinatesModel;
import com.example.tae_user0.finalprojectapp1.R;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;


/**
 * Created by TAE_user0 on 25/01/2016.
 */
public class FragmentMaps extends Fragment implements OnMapReadyCallback {
    private RestAdapter restAdapt;
    private GoogleMap mMap;
    private RestaurantsApiAllCitiesMaps spAllCities;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_maps, container, false);
        //mapview
        initilizeMap();
        //restAdapter of the models
        restAdapt = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        return v;
    }

    //onMapReady
    @Override
    public void onMapReady(final GoogleMap googleMap) {
        mMap = googleMap;
        mMap.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        //get retrofit options for the new api to get all the restaurants around
        spAllCities = restAdapt.create(RestaurantsApiAllCitiesMaps.class);
        spAllCities.getAllSpanishRestaurants(new Callback<SpanishRestaurantModel>() {
            @Override
            public void success(SpanishRestaurantModel spanishRestaurantModel, Response response) {
                List<Restaurant> restaurantsList = spanishRestaurantModel.getRestaurants();
                for (int i = 0; i < restaurantsList.size(); i++) {
                    double lat = Double.parseDouble(restaurantsList.get(i).getRestaurant().getLocation().getLatitude());
                    double lng = Double.parseDouble(restaurantsList.get(i).getRestaurant().getLocation().getLongitude());
                    final LatLng place = new LatLng(lat, lng);
                    MarkerOptions placeMarker = new MarkerOptions()
                            .position(place)
                            .title(restaurantsList.get(i).getRestaurant().getName())
                            .snippet("Scope: " + restaurantsList.get(i).getRestaurant().getLocation().getAddress());
                    mMap.addMarker(placeMarker);
                    //                    mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place, 12.5f));
                }
            }

            @Override
            public void failure(RetrofitError error) {
                getToast("failure loading retrofit for the restaurant places");
            }
        });
        // Enable / Disable zooming controls
        mMap.getUiSettings().setZoomControlsEnabled(false);

        // Enable / Disable my location button
        mMap.getUiSettings().setMyLocationButtonEnabled(true);

        // Enable / Disable Compass icon
        mMap.getUiSettings().setCompassEnabled(true);

        // Enable / Disable Rotate gesture
        mMap.getUiSettings().setRotateGesturesEnabled(true);

        // Enable / Disable zooming functionality
        mMap.getUiSettings().setZoomGesturesEnabled(true);

        //My location
        double lat = 51.510210;
        double lng = -0.070880;
        final LatLng place = new LatLng(lat, lng);
        MarkerOptions placeMarker = new MarkerOptions()
                .position(place)
                .title("My position")
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));
        mMap.addMarker(placeMarker);
        mMap.moveCamera(CameraUpdateFactory.newLatLngZoom(place, 12.5f));
    }

    //methods
    public void getToast(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onResume() {
        super.onResume();
        initilizeMap();
    }


    /**
     * function to load map If map is not created it will create it for you
     * */
    private void initilizeMap() {
        if (mMap == null) {
            SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);
            mapFragment.getMapAsync(this);
            // check if map is created successfully or not
            if (mMap == null) {
               // getToast("unable to start maps");
            }
        }
    }

    public void onBackPressed(){
        FragmentManager fm = getFragmentManager();
        if (fm.getBackStackEntryCount() > 0) {
            Log.i("MainActivity", "popping backstack");
            fm.popBackStack();
        } else {
            Log.i("MainActivity", "nothing on backstack, calling super");
            //super.onBackPressed();
        }
    }
}
