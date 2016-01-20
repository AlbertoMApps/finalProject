package com.example.tae_user0.finalprojectapp1.Adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.tae_user0.finalprojectapp1.Api.ItemClickListener;
import com.example.tae_user0.finalprojectapp1.Model.api1.CitiesModel;
import com.example.tae_user0.finalprojectapp1.Model.api1.LocationSuggestion;
import com.example.tae_user0.finalprojectapp1.R;

import java.util.List;

/**
 * Created by TAE_user0 on 16/01/2016.
 */
public class CityAdapter extends RecyclerView.Adapter<CityAdapter.ViewHolder>{
    private CitiesModel model;
    private int rowLayout;
    private Context mContext;
    private LayoutInflater inflater;
    private ItemClickListener clickLocations;

    public CityAdapter(CitiesModel model, int rowLayout, Context context, ItemClickListener clickLocations) {
        this.model = model;
        this.rowLayout = rowLayout;
        this.mContext = context;
        inflater =  LayoutInflater.from(context);
        this.clickLocations = clickLocations;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(rowLayout, parent, false);
        return new ViewHolder(view, this.clickLocations, this);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.txt1.setText(model.getLocationSuggestions().get(position).getName().toString() + " "+ model.getLocationSuggestions().get(position).getStateName());
        //reference to the innerclass

    }

    @Override
    public int getItemCount() {
        return this.model==null?0: model.getLocationSuggestions().size();
    }
    //Methods
    public CitiesModel getList (){
        return this.model;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView txt1;
        private ItemClickListener clickLocations;
        private CityAdapter menu;

        public ViewHolder(View itemView, ItemClickListener clickLocations, CityAdapter cityAdapter) {
            super(itemView);
            //img = (ImageView) itemView.findViewById(R.id.img);
            txt1 = (TextView) itemView.findViewById(R.id.cityText);
            itemView.setOnClickListener(this);
            this.clickLocations = clickLocations;
            //get outer class
            this.menu = cityAdapter;
        }

        @Override
        public void onClick(View v) {
            if (getAdapterPosition()!=-1) {
                List<LocationSuggestion> loc = menu.getList().getLocationSuggestions();
                int locId = loc.get(getAdapterPosition()).getId();
                clickLocations.onClick(v,locId);
            }
        }
    }
}
