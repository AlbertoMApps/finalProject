
package com.example.tae_user0.finalprojectapp1.model.api2;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LocationSuggestion {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("country_name")
    @Expose
    private String countryName;
    @SerializedName("discovery_enabled")
    @Expose
    private Integer discoveryEnabled;
    @SerializedName("is_state")
    @Expose
    private Integer isState;
    @SerializedName("state_id")
    @Expose
    private Integer stateId;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("state_code")
    @Expose
    private String stateCode;

    /**
     * 
     * @return
     *     The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 
     * @return
     *     The name
     */
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     * 
     * @param countryId
     *     The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     * 
     * @return
     *     The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * 
     * @param countryName
     *     The country_name
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * 
     * @return
     *     The discoveryEnabled
     */
    public Integer getDiscoveryEnabled() {
        return discoveryEnabled;
    }

    /**
     * 
     * @param discoveryEnabled
     *     The discovery_enabled
     */
    public void setDiscoveryEnabled(Integer discoveryEnabled) {
        this.discoveryEnabled = discoveryEnabled;
    }

    /**
     * 
     * @return
     *     The isState
     */
    public Integer getIsState() {
        return isState;
    }

    /**
     * 
     * @param isState
     *     The is_state
     */
    public void setIsState(Integer isState) {
        this.isState = isState;
    }

    /**
     * 
     * @return
     *     The stateId
     */
    public Integer getStateId() {
        return stateId;
    }

    /**
     * 
     * @param stateId
     *     The state_id
     */
    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    /**
     * 
     * @return
     *     The stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * 
     * @param stateName
     *     The state_name
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    /**
     * 
     * @return
     *     The stateCode
     */
    public String getStateCode() {
        return stateCode;
    }

    /**
     * 
     * @param stateCode
     *     The state_code
     */
    public void setStateCode(String stateCode) {
        this.stateCode = stateCode;
    }

}
