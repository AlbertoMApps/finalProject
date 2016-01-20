
package com.example.tae_user0.finalprojectapp1.Model.api2;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class SpanishRestaurantModel implements Parcelable {

    @SerializedName("results_found")
    @Expose
    private Integer resultsFound;
    @SerializedName("results_start")
    @Expose
    private Integer resultsStart;
    @SerializedName("results_shown")
    @Expose
    private Integer resultsShown;
    @SerializedName("restaurants")
    @Expose
    private List<Restaurant> restaurants = new ArrayList<Restaurant>();

    protected SpanishRestaurantModel(Parcel in) {
    }

    public static final Creator<SpanishRestaurantModel> CREATOR = new Creator<SpanishRestaurantModel>() {
        @Override
        public SpanishRestaurantModel createFromParcel(Parcel in) {
            return new SpanishRestaurantModel(in);
        }

        @Override
        public SpanishRestaurantModel[] newArray(int size) {
            return new SpanishRestaurantModel[size];
        }
    };

    /**
     * 
     * @return
     *     The resultsFound
     */
    public Integer getResultsFound() {
        return resultsFound;
    }

    /**
     * 
     * @param resultsFound
     *     The results_found
     */
    public void setResultsFound(Integer resultsFound) {
        this.resultsFound = resultsFound;
    }

    /**
     * 
     * @return
     *     The resultsStart
     */
    public Integer getResultsStart() {
        return resultsStart;
    }

    /**
     * 
     * @param resultsStart
     *     The results_start
     */
    public void setResultsStart(Integer resultsStart) {
        this.resultsStart = resultsStart;
    }

    /**
     * 
     * @return
     *     The resultsShown
     */
    public Integer getResultsShown() {
        return resultsShown;
    }

    /**
     * 
     * @param resultsShown
     *     The results_shown
     */
    public void setResultsShown(Integer resultsShown) {
        this.resultsShown = resultsShown;
    }

    /**
     * 
     * @return
     *     The restaurants
     */
    public List<Restaurant> getRestaurants() {
        return restaurants;
    }

    /**
     * 
     * @param restaurants
     *     The restaurants
     */
    public void setRestaurants(List<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
