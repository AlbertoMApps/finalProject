package com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Adapters.FavouriteAdapter;
import com.example.tae_user0.finalprojectapp1.Api.ItemClickListenerManager;
import com.example.tae_user0.finalprojectapp1.R;
import com.example.tae_user0.finalprojectapp1.dbModel.MyOpenHelperManager;

/**
 * Created by TAE_user0 on 22/01/2016.
 */
public class FragmentFavourites extends Fragment implements ItemClickListenerManager, SwipeRefreshLayout.OnRefreshListener{

    private RecyclerView mRecycler;
    private FavouriteAdapter mAdapter;
    private static FragmentFavourites ff;
    private MyOpenHelperManager mom;
    private SwipeRefreshLayout swipeRefreshLayout;

    public FragmentFavourites(){
    }

    public static FragmentFavourites newInstance(Bundle args) {
        ff = new FragmentFavourites();
        ff.setArguments(args);
        return ff;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.favourites_rest, container, false);

        //set the imageView for the main content invisible in any of the other fragments
        ImageView im = (ImageView)getActivity().findViewById(R.id.imgLogo);
        im.setVisibility(View.INVISIBLE);
        im.getLayoutParams().height = 0;

        //swipeRefreshLayout = new SwipeRefreshLayout(getContext());
        swipeRefreshLayout = (SwipeRefreshLayout) rootView.findViewById(R.id.swipe);
        swipeRefreshLayout.setOnRefreshListener(this);
//        swipeRefreshLayout.setColorSchemeColors(android.R.color.holo_orange_light,
//                android.R.color.holo_green_light,
//                android.R.color.holo_orange_light,
//                android.R.color.holo_red_light);
        //arguments to send to the openHelpManager
        mom = ff.getArguments().getParcelable("MyOpenHelperManager");
        recyclerModel1(mom, rootView);
        return rootView;
    }

    //recycler view for the favourites list *****
    public void recyclerModel1 (MyOpenHelperManager mom, ViewGroup v ){
        //recycler view declaration
        mRecycler = (RecyclerView) v.findViewById(R.id.listFavourites);
        mRecycler.setLayoutManager(new LinearLayoutManager(getActivity().getApplicationContext()));
        mRecycler.setItemAnimator(new DefaultItemAnimator());

        // adapter set into recycler view
        mAdapter = new FavouriteAdapter(mom, R.layout.favourites_rest_item, getContext());
        mRecycler.setAdapter(mAdapter);
        //mAdapter.setClickListener(this);
    }
    //myOpenHelperManager click method
    @Override
    public void getMyOpenHelperManager(MyOpenHelperManager mom) {

    }
//swipe refresh method
    @Override
    public void onRefresh() {
        getToast("On refresh");
        stopSwipeRefresh();
    }

    //methods
    public void getToast(String message){
        Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
    public void stopSwipeRefresh() {
        if (swipeRefreshLayout.isRefreshing()) {
            swipeRefreshLayout.setRefreshing(false);
        }

    }

}
