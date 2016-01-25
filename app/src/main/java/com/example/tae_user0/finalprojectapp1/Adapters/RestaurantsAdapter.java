package com.example.tae_user0.finalprojectapp1.Adapters;

import android.content.Context;
import android.media.Image;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tae_user0.finalprojectapp1.Api.ItemClickListener;
import com.example.tae_user0.finalprojectapp1.Api.ItemClickListenerRestModel;
import com.example.tae_user0.finalprojectapp1.Model.api1.CitiesModel;
import com.example.tae_user0.finalprojectapp1.Model.api2.Restaurant;
import com.example.tae_user0.finalprojectapp1.Model.api2.Restaurant_;
import com.example.tae_user0.finalprojectapp1.Model.api2.SpanishRestaurantModel;
import com.example.tae_user0.finalprojectapp1.R;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by TAE_user0 on 19/01/2016.
 */
public class RestaurantsAdapter  extends RecyclerView.Adapter<RestaurantsAdapter.ViewHolder>{
    private SpanishRestaurantModel model;
    private int rowLayout;
    private Context mContext;
    private LayoutInflater inflater;
    private ItemClickListenerRestModel clickRestaurant;

    public RestaurantsAdapter(SpanishRestaurantModel model, int rowLayout, Context context, ItemClickListenerRestModel clickRestaurant) {
        this.model = model;
        this.rowLayout = rowLayout;
        this.mContext = context;
        inflater =  LayoutInflater.from(context);
        this.clickRestaurant = clickRestaurant;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(rowLayout, parent, false);
        return new ViewHolder(view, clickRestaurant, model);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {

        Restaurant_ resta = model.getRestaurants().get(position).getRestaurant();

        holder.txt1.setText(resta.getName());
        holder.txt2.setText(resta.getLocation().getAddress() );
        Picasso.with(mContext)
         .load(resta.getThumb().toString())
         .resize(200, 200)
         .placeholder(R.drawable.bt_loading)
        //.error(R.drawable.bt_error)
        .centerCrop()
        .into(holder.imgBtn);
        //reference to the innerclass

    }

    @Override
    public int getItemCount() {
        return this.model==null?0: model.getRestaurants().size();
    }
    //Methods
    public SpanishRestaurantModel getList (){
        return this.model;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        private TextView txt1, txt2;
        private ImageView imgBtn;
        private ItemClickListenerRestModel clickRestaurants;
        private SpanishRestaurantModel menu;

        public ViewHolder(View itemView, ItemClickListenerRestModel itemClickListener, SpanishRestaurantModel spanishRestaurantModel) {
            super(itemView);
            //img = (ImageView) itemView.findViewById(R.id.img);
            txt1 = (TextView) itemView.findViewById(R.id.restNameText);
            txt2 = (TextView) itemView.findViewById(R.id.restCousines);
            imgBtn = (ImageView)itemView.findViewById(R.id.imageRest);
            itemView.setOnClickListener(this);
            this.clickRestaurants = itemClickListener;
            //get outer class
            this.menu = spanishRestaurantModel;

        }

        @Override
        public void onClick(View v) {
            if (getAdapterPosition()!=-1) {
                List<Restaurant> loc = menu.getRestaurants();
                String restId = loc.get(getAdapterPosition()).getRestaurant().getId();
                clickRestaurants.onClickDetails(v, Integer.parseInt(restId.toString()), getAdapterPosition());
            }
        }
    }
}
