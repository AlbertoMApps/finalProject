package com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart3;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tae_user0.finalprojectapp1.Constants.Constant;
import com.example.tae_user0.finalprojectapp1.Fragments.FragmentPackages.FragmentPart1.FragmentRestaurants;
import com.example.tae_user0.finalprojectapp1.R;

import retrofit.RestAdapter;

/**
 * Created by TAE_user0 on 25/01/2016.
 */
public class FragmentAbout extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_about, container, false);
        TextView about = (TextView) container.findViewById(R.id.about);
        return v;
    }
}
