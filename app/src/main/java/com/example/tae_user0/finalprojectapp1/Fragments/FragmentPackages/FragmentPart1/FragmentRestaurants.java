package com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1;


import android.app.ProgressDialog;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Adapters.RestaurantsAdapter;
import com.example.tae_user0.finalprojectapp1.Api.ItemClickListenerRestModel;
import com.example.tae_user0.finalprojectapp1.Api.RestaurantsApi;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.R;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by TAE_user0 on 19/01/2016.
 */
public class FragmentRestaurants extends Fragment implements ItemClickListenerRestModel{
    private static FragmentRestaurants fr;
    private RestAdapter restAdapt;
    private RestaurantsApi spRest;
    private RecyclerView mRecycler;
    private RestaurantsAdapter mAdapter;
    private ItemClickListenerRestModel clickListener;
    private SpanishRestaurantModel spModel;
    ProgressDialog progressDialog;
    
    public FragmentRestaurants(){}
    public static FragmentRestaurants newInstance(Bundle args){
        fr = new FragmentRestaurants();
        fr.setArguments(args);
        return fr;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        //Toast.makeText(getContext(), "cityId fragment 2; " + fr.getArguments().getInt("cityId"), Toast.LENGTH_SHORT).show();

        //set the imageView for the main content invisible in any of the other fragments
        ImageView im = (ImageView)getActivity().findViewById(R.id.imgLogo);
        im.setVisibility(View.INVISIBLE);
        im.getLayoutParams().height = 0;

        clickListener =  FragmentRestaurants.this;
        //restAdapter of the models
        restAdapt = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        int id= fr.getArguments().getInt("cityId");
        progressDialog = new ProgressDialog(getContext(), R.style.AppTheme);
        //Example first query
        if(id!=0) {
            progressDialog.show();
            spRest = restAdapt.create(RestaurantsApi.class);
            spRest.getSpanishRestaurants(id, new Callback<SpanishRestaurantModel>() {

                @Override
                public void success(SpanishRestaurantModel spanishRestaurantModel, Response response) {
                    recyclerModel2(spanishRestaurantModel);
                    spModel = spanishRestaurantModel;
                    progressDialog.dismiss();
                    //getToast("votes"+spanishRestaurantModel.getRestaurants().get(0).getRestaurant().getUserRating().getVotes());
//                    for (int i = 0; i < spanishRestaurantModel.getRestaurants().size(); i++) {
//                        Log.i("locations by id", "" + spanishRestaurantModel.getRestaurants().get(i).getRestaurant().getName());
//                        // Toast.makeText(getContext(), "Name restaurants,  fragment 2; " + spanishRestaurantModel.getRestaurants().get(i).getRestaurant().getName(), Toast.LENGTH_SHORT).show();
//                    }
                }

                @Override
                public void failure(RetrofitError error) {
                    getToast("failure charging the data");
                    progressDialog.dismiss();
                }
            });
        } else{
            getToast("No restaurants found on this location");
            progressDialog.dismiss();
        }

        return view;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    //methods
    public void getToast(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }

    //recycler view for the restaurants result *****
    public void recyclerModel2 (SpanishRestaurantModel model){
        //recycler view declaration
        mRecycler = (RecyclerView) getActivity().findViewById(R.id.listRestaurants);
        mRecycler.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(),2));
        mRecycler.setItemAnimator(new DefaultItemAnimator());

        // adapter set into recycler view
        mAdapter = new RestaurantsAdapter(model, R.layout.restaurants_item, getContext(),clickListener);
        mRecycler.setAdapter(mAdapter);
    }

//Click functionality to send the id to the fragment3-> restaurant details fragment

    @Override
    public void onClickDetails(View view, int restId, int pos) {
        //getToast(""+restId);
        Bundle arguments = new Bundle();
        arguments.putInt("restId", restId);
        //Model from fragment Restaurants for the charging of some details, in case the 3rd Api is not working...Had a problem before chargind it...
        arguments.putParcelable("restModel", spModel);
        arguments.putInt("restModelPos", pos);
        FragmentRestaurantDetails fDetails = FragmentRestaurantDetails.newInstance(arguments);
        android.support.v4.app.FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fragment, fDetails, "fragment3");
        fragmentTransaction.commit();

    }
}
