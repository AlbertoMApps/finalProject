package com.example.tae_user0.finalprojectapp1.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tae_user0.finalprojectapp1.Api.ItemClickListener;
import com.example.tae_user0.finalprojectapp1.Model.api1.LocationSuggestion;
import com.example.tae_user0.finalprojectapp1.R;
import com.example.tae_user0.finalprojectapp1.dbModel.Favourites;
import com.example.tae_user0.finalprojectapp1.dbModel.MyOpenHelperManager;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TAE_user0 on 22/01/2016.
 */
public class FavouriteAdapter extends RecyclerView.Adapter<FavouriteAdapter.ViewHolder>{
    private MyOpenHelperManager model;
    private int rowLayout;
    private Context mContext;
    private LayoutInflater inflater;


    public FavouriteAdapter(MyOpenHelperManager model, int rowLayout, Context context) {
        this.model = model;
        this.rowLayout = rowLayout;
        this.mContext = context;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(rowLayout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Favourites fav = (Favourites) model.getFavourites().get(position);
        holder.favNameText.setText( fav.getRestName() );
        holder.favAddressText.setText( fav.getStreet() );
    }


    @Override
    public int getItemCount() {
        return this.model == null ? 0 : model.getFavourites().size();
    }



    //Methods
//    public ArrayList getList() {
//        return this.model;
//    }

    public void removeFavourite(int adapterPosition) {
        Favourites fav = (Favourites) model.getFavourites().get(adapterPosition);
        model.deleteFavourites(fav);
    }


    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        private TextView favNameText;
        private TextView favAddressText;

        public ViewHolder(View itemView) {
            super(itemView);
            favNameText = (TextView) itemView.findViewById(R.id.favNameText);
            favAddressText = (TextView) itemView.findViewById(R.id.favAddressText);
        }

        @Override
        public void onClick(View v) {
            //ItemClickListenerManager implementation
        }
    }
}
