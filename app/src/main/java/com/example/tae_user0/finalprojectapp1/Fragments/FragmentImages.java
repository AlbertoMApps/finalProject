package com.example.tae_user0.finalprojectapp1.Fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.tae_user0.finalprojectapp1.R;
import com.squareup.picasso.Picasso;

/**
 * Created by TAE_user0 on 20/01/2016.
 */
public class FragmentImages extends Fragment {

    String imagesURL;

    public FragmentImages() {
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.slides_details, container, false);
        ImageView imageView = (ImageView) view.findViewById(R.id.imgDetails);
        Picasso.with(getActivity()).load(this.getImg()).resize(350,150).centerCrop().into(imageView);
        return view;
    }

    //**Extra methods**/

    public String getImg(){
        return imagesURL;
    }
    public void setImg(String imagesURL){
        this.imagesURL = imagesURL;
    }
}
