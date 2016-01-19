package com.example.tae_user0.finalprojectapp1.Fragments;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Adapters.CityAdapter;
import com.example.tae_user0.finalprojectapp1.Api.CitiesApi;
import com.example.tae_user0.finalprojectapp1.Api.ItemClickListener;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api1.CitiesModel;
import com.example.tae_user0.finalprojectapp1.R;

import retrofit.Callback;
import retrofit.RestAdapter;
import retrofit.RetrofitError;
import retrofit.client.Response;

/**
 * Created by TAE_user0 on 16/01/2016.
 */
public class FragmentSearch extends Fragment implements View.OnClickListener, ItemClickListener{

    private EditText searchText;
    private Button btnSearch;
    private RecyclerView mRecycler;
    private CityAdapter mAdapter;
    private RestAdapter restAdapt;
    private CitiesApi spCities;
    private ItemClickListener cityClick;

    public FragmentSearch() {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        searchText = (EditText) view.findViewById(R.id.txtSearch);
        btnSearch = (Button) view.findViewById(R.id.btnSearch);
        btnSearch.setOnClickListener(FragmentSearch.this);

        //restAdapter of the models
        restAdapt = new RestAdapter.Builder()
                .setEndpoint(Constant.BASE_URL)
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .build();
        //city Click
        cityClick = FragmentSearch.this;

        return view;
    }
    //Secondly, we click on btn Search
    @Override
    public void onClick(final View v) {
        //Toast.makeText(getContext(), searchText.getText().toString(),Toast.LENGTH_SHORT).show();
        //restAdapter for cities API1//// //

        String q= searchText.getText().toString();
        spCities = restAdapt.create(CitiesApi.class);
        if(!q.isEmpty()) {
            //Example first query
            spCities.getCities(q, new Callback<CitiesModel>() {
                @Override
                public void success(CitiesModel citiesModel, Response response) {
                    recyclerModel1(citiesModel);
                    for (int i = 0; i < citiesModel.getLocationSuggestions().size(); i++) {
                        Log.i("locations by id", ""+citiesModel.getLocationSuggestions().get(i).getId());
                        //Toast.makeText(getContext(), citiesModel.getLocationSuggestions().get(i).getName(), Toast.LENGTH_SHORT).show();
                    }
                }

                @Override
                public void failure(RetrofitError error) {

                }
            });
        } else{
            Toast.makeText(getContext(), "Please enter a valid value", Toast.LENGTH_SHORT).show();

        }

    }

    //recycler view for the cities result *****
    public void recyclerModel1 (CitiesModel model){
        //recycler view declaration
        mRecycler = (RecyclerView) getActivity().findViewById(R.id.list);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getBaseContext()));
        mRecycler.setItemAnimator(new DefaultItemAnimator());

        // adapter set into recycler view
        mAdapter = new CityAdapter(model, R.layout.cities_item, getContext(), cityClick);
        mRecycler.setAdapter(mAdapter);
        //mAdapter.setClickListener(this);
    }

    @Override
    public void onClick(View view, int cityId) {
        Toast.makeText(getContext(), "city ID: "+cityId, Toast.LENGTH_SHORT).show();
        Bundle arguments = new Bundle();
        arguments.putInt("cityId", cityId);
        FragmentRestaurants fRest = FragmentRestaurants.newInstance(arguments);
        android.support.v4.app.FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fragment, fRest, "fragment2");
        fragmentTransaction.commit();
    }
}
