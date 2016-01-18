package com.example.tae_user0.finalprojectapp1.Fragments;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tae_user0.finalprojectapp1.R;
import com.example.tae_user0.finalprojectapp1.api.onDataPass;

/**
 * Created by TAE_user0 on 16/01/2016.
 */
public class FragmentSearch extends Fragment {

    onDataPass dataPasser;

//    @Override
//    public void onAttach(Activity a) {
//        super.onAttach(a);
//        dataPasser = (onDataPass) a;
//    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        TextView searchText = (TextView) view.findViewById(R.id.txtSearch);
        //Log.i("MAIN", " list of cats " + catsInfo.get(1));
        String search = searchText.getText().toString();
        dataPasser = (onDataPass) getActivity();
        dataPasser.onDataPass(search);
        return view;
    }

    public void passData(String data) {
        dataPasser.onDataPass(data);
    }

}
