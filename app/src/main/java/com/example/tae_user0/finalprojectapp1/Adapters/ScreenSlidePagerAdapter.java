package com.example.tae_user0.finalprojectapp1.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;


import com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1.FragmentImages;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;

/**
 * Created by TAE_user0 on 05/01/2016.
 */
public class ScreenSlidePagerAdapter extends FragmentStatePagerAdapter {

    private SpanishRestaurantModel model;
    private String img;

    public ScreenSlidePagerAdapter(FragmentManager fm, SpanishRestaurantModel model) {
        super(fm);
        this.model = model;
    }


    @Override
    public Fragment getItem(int position) {
        img = model.getRestaurants().get(position).getRestaurant().getThumb();
        FragmentImages fi = new FragmentImages();
        fi.setImg(getImg());
        return fi;
    }

    @Override
    public int getCount() {
        return model.getRestaurants().size();
    }

    /**Extra methods**/
    public String getImg(){
            return img;
    }
}
