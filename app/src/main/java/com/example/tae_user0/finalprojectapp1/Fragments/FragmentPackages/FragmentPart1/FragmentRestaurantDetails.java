package com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.Adapters.ScreenSlidePagerAdapter;
import com.example.tae_user0.finalprojectapp1.Api.RestaurantDetailsApi;
import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.Model.api3.RestaurantDetailsModel;
import com.example.tae_user0.finalprojectapp1.R;
import com.example.tae_user0.finalprojectapp1.dbModel.Favourites;
import com.example.tae_user0.finalprojectapp1.dbModel.MyOpenHelperManager;
import com.facebook.CallbackManager;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.widget.ShareDialog;

import butterknife.ButterKnife;
import butterknife.OnClick;
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
    private String restName, cityName, restAddress, txtP;
    private CallbackManager callbackManager;
    private ShareDialog shareDialog;
    private Favourites favourites;

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
        ButterKnife.bind(this, rootView);

        //set the imageView for the main content invisible in any of the other fragments
        ImageView im = (ImageView)getActivity().findViewById(R.id.imgLogo);
        im.setVisibility(View.INVISIBLE);
        im.getLayoutParams().height = 0;

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
                    TextView txtPrice = (TextView) rootView.findViewById(R.id.txtRate);
                    //setTexts
                    restName = spModel.getRestaurants().get(pos).getRestaurant().getName();
                    cityName = spModel.getRestaurants().get(pos).getRestaurant().getLocation().getCity();
                    restAddress = spModel.getRestaurants().get(pos).getRestaurant().getLocation().getAddress();
                    txtP = spModel.getRestaurants().get(pos).getRestaurant().getUserRating().getAggregateRating();
                    txtTitle.setText(restName);
                    txtAddress.setText(restAddress);
                    txtCity.setText(cityName);
                    txtPrice.setText(txtP);

                    // Instantiate a ViewPager and a PagerAdapter.
                    ViewPager mPager = (ViewPager)rootView.findViewById(R.id.pager);
                    ScreenSlidePagerAdapter mPagerAdapter = new ScreenSlidePagerAdapter(getActivity().getSupportFragmentManager(), spModel);
                    mPager.setAdapter(mPagerAdapter);

                }

                @Override
                public void failure(RetrofitError error) {
                    getToast("Error charging restaurants");
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
    //different facebook login to integrate the city and restaurant as a comment in your account
    public void setfacebookLogin (){
        //facebook sharedialog integration
        callbackManager = CallbackManager.Factory.create();
        shareDialog = new ShareDialog(this);
        // this part is optional
        //shareDialog.registerCallback(callbackManager, new FacebookCallback<Sharer.Result>() { ... });
        if (ShareDialog.canShow(ShareLinkContent.class)) {
            ShareLinkContent linkContent = new ShareLinkContent.Builder()
                    .setContentTitle("My favourite restaurant in "+getCityName())
                    .setContentDescription(getRestNameSelected())
                    .setContentUrl(Uri.parse("http://developers.facebook.com/android"))
                    .build();

            shareDialog.show(linkContent);
        }
    }

    public String getRestNameSelected(){
        return restName;
    }
    public String getCityName(){
        return cityName;
    }
    public String getRestAddress(){
        return restAddress;
    }


    @Override
    public void onResume() {
        super.onResume();

        // Logs 'install' and 'app activate' App Events.
        AppEventsLogger.activateApp(getActivity());
    }
    @Override
    public void onPause() {
        super.onPause();

        // Logs 'app deactivate' App Event.
        AppEventsLogger.deactivateApp(getActivity());
    }

    @Override
    public void onActivityResult(final int requestCode, final int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        callbackManager.onActivityResult(requestCode, resultCode, data);
    }

    //ButterKnife click integration for facebook
    @OnClick(R.id.btnFb) void fbClick(){
        //different facebook login to integrate the city and restaurant as a comment in your account
        setfacebookLogin();
    }
    //btn add for the favourites
    @OnClick(R.id.btnAdd) void btnAddFavourites(){
        //add to favourites into the database and send the information into fragmentFavourites to display
        //getToast("db");
        MyOpenHelperManager mom = new MyOpenHelperManager(getContext());
        //favourites = new Favourites();
        mom.saveFavourites(getRestNameSelected(), getRestAddress());
        //get and pass the mom to the fragmnet favourites
        Bundle arguments = new Bundle();
        //Model from db to send to the fragment favourites to display
        arguments.putParcelable("MyOpenHelperManager", mom);
        FragmentFavourites fFavourites = FragmentFavourites.newInstance(arguments);
        android.support.v4.app.FragmentTransaction fragmentTransaction = getActivity().getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.main_fragment, fFavourites, "fragment4");
        fragmentTransaction.commit();
    }

}
