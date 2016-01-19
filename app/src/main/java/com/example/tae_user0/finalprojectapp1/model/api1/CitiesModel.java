
package com.example.tae_user0.finalprojectapp1.Model.api1;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CitiesModel {

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("has_more")
    @Expose
    private Integer hasMore;
    @SerializedName("location_suggestions")
    @Expose
    private List<LocationSuggestion> locationSuggestions = new ArrayList<LocationSuggestion>();

    /**
     * 
     * @return
     *     The status
     */
    public String getStatus() {
        return status;
    }

    /**
     * 
     * @param status
     *     The status
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * 
     * @return
     *     The hasMore
     */
    public Integer getHasMore() {
        return hasMore;
    }

    /**
     * 
     * @param hasMore
     *     The has_more
     */
    public void setHasMore(Integer hasMore) {
        this.hasMore = hasMore;
    }

    /**
     * 
     * @return
     *     The locationSuggestions
     */
    public List<LocationSuggestion> getLocationSuggestions() {
        return locationSuggestions;
    }

    /**
     * 
     * @param locationSuggestions
     *     The location_suggestions
     */
    public void setLocationSuggestions(List<LocationSuggestion> locationSuggestions) {
        this.locationSuggestions = locationSuggestions;
    }

}
