
package com.example.tae_user0.finalprojectapp1.Model.api2;


import android.os.Parcel;
import android.os.Parcelable;

public class Restaurant  implements Parcelable {

    private Restaurant_ restaurant;

    protected Restaurant(Parcel in) {
    }

    public static final Creator<Restaurant> CREATOR = new Creator<Restaurant>() {
        @Override
        public Restaurant createFromParcel(Parcel in) {
            return new Restaurant(in);
        }

        @Override
        public Restaurant[] newArray(int size) {
            return new Restaurant[size];
        }
    };

    /**
     * 
     * @return
     *     The restaurant
     */
    public Restaurant_ getRestaurant() {
        return restaurant;
    }

    /**
     * 
     * @param restaurant
     *     The restaurant
     */
    public void setRestaurant(Restaurant_ restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
