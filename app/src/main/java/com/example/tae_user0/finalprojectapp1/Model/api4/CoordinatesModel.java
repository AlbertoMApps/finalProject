package com.example.tae_user0.finalprojectapp1.Model.api4;

/**
 * Created by TAE_user0 on 25/01/2016.
 */

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class CoordinatesModel {

    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("popularity")
    @Expose
    private Popularity popularity;
    @SerializedName("link")
    @Expose
    private String link;
    @SerializedName("nearby_restaurants")
    @Expose
    private NearbyRestaurants nearbyRestaurants;

    /**
     *
     * @return
     * The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The popularity
     */
    public Popularity getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     * The popularity
     */
    public void setPopularity(Popularity popularity) {
        this.popularity = popularity;
    }

    /**
     *
     * @return
     * The link
     */
    public String getLink() {
        return link;
    }

    /**
     *
     * @param link
     * The link
     */
    public void setLink(String link) {
        this.link = link;
    }

    /**
     *
     * @return
     * The nearbyRestaurants
     */
    public NearbyRestaurants getNearbyRestaurants() {
        return nearbyRestaurants;
    }

    /**
     *
     * @param nearbyRestaurants
     * The nearby_restaurants
     */
    public void setNearbyRestaurants(NearbyRestaurants nearbyRestaurants) {
        this.nearbyRestaurants = nearbyRestaurants;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location.java-----------------------------------



class Location {

    @SerializedName("entity_type")
    @Expose
    private String entityType;
    @SerializedName("entity_id")
    @Expose
    private Integer entityId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("city_name")
    @Expose
    private String cityName;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;
    @SerializedName("country_name")
    @Expose
    private String countryName;

    /**
     *
     * @return
     * The entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     *
     * @param entityType
     * The entity_type
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

    /**
     *
     * @return
     * The entityId
     */
    public Integer getEntityId() {
        return entityId;
    }

    /**
     *
     * @param entityId
     * The entity_id
     */
    public void setEntityId(Integer entityId) {
        this.entityId = entityId;
    }

    /**
     *
     * @return
     * The title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title
     * The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     *
     * @param cityName
     * The city_name
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    /**
     *
     * @return
     * The countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     *
     * @param countryName
     * The country_name
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location_.java-----------------------------------

//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location_ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location__.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location__ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location___.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;


 class Location___ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location____ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//                -----------------------------------com.example.tae_user0.finalprojectapp1.Location_____.java-----------------------------------
//
//                package com.example.tae_user0.finalprojectapp1;
//
//                import javax.annotation.Generated;
//                import com.google.gson.annotations.Expose;
//                import com.google.gson.annotations.SerializedName;

 class Location_____ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;


 class Location______ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location_______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location_______ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location________.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location________ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Location_________.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Location_________ {

    @SerializedName("address")
    @Expose
    private String address;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("city_id")
    @Expose
    private Integer cityId;
    @SerializedName("latitude")
    @Expose
    private String latitude;
    @SerializedName("longitude")
    @Expose
    private String longitude;
    @SerializedName("zipcode")
    @Expose
    private String zipcode;
    @SerializedName("country_id")
    @Expose
    private Integer countryId;

    /**
     *
     * @return
     * The address
     */
    public String getAddress() {
        return address;
    }

    /**
     *
     * @param address
     * The address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     *
     * @return
     * The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     *
     * @param locality
     * The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     *
     * @return
     * The cityId
     */
    public Integer getCityId() {
        return cityId;
    }

    /**
     *
     * @param cityId
     * The city_id
     */
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    /**
     *
     * @return
     * The latitude
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     *
     * @param latitude
     * The latitude
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     *
     * @return
     * The longitude
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     *
     * @param longitude
     * The longitude
     */
    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     *
     * @return
     * The zipcode
     */
    public String getZipcode() {
        return zipcode;
    }

    /**
     *
     * @param zipcode
     * The zipcode
     */
    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    /**
     *
     * @return
     * The countryId
     */
    public Integer getCountryId() {
        return countryId;
    }

    /**
     *
     * @param countryId
     * The country_id
     */
    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.NearbyRestaurants.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class NearbyRestaurants {

    @SerializedName("1")
    @Expose
    private _1 _1;
    @SerializedName("2")
    @Expose
    private _2 _2;
    @SerializedName("3")
    @Expose
    private _3 _3;
    @SerializedName("4")
    @Expose
    private _4 _4;
    @SerializedName("5")
    @Expose
    private _5 _5;
    @SerializedName("6")
    @Expose
    private _6 _6;
    @SerializedName("7")
    @Expose
    private _7 _7;
    @SerializedName("8")
    @Expose
    private _8 _8;
    @SerializedName("9")
    @Expose
    private _9 _9;

    /**
     *
     * @return
     * The _1
     */
    public _1 get1() {
        return _1;
    }

    /**
     *
     * @param _1
     * The 1
     */
    public void set1(_1 _1) {
        this._1 = _1;
    }

    /**
     *
     * @return
     * The _2
     */
    public _2 get2() {
        return _2;
    }

    /**
     *
     * @param _2
     * The 2
     */
    public void set2(_2 _2) {
        this._2 = _2;
    }

    /**
     *
     * @return
     * The _3
     */
    public _3 get3() {
        return _3;
    }

    /**
     *
     * @param _3
     * The 3
     */
    public void set3(_3 _3) {
        this._3 = _3;
    }

    /**
     *
     * @return
     * The _4
     */
    public _4 get4() {
        return _4;
    }

    /**
     *
     */
    public void set4(_4 _4) {
        this._4 = _4;
    }

    /**
     *
     * @return
     * The _5
     */
    public _5 get5() {
        return _5;
    }

    /**
     *
     * @param _5
     * The 5
     */
    public void set5(_5 _5) {
        this._5 = _5;
    }

    /**
     *
     * @return
     * The _6
     */
    public _6 get6() {
        return _6;
    }

    /**
     *
     * @param _6
     * The 6
     */
    public void set6(_6 _6) {
        this._6 = _6;
    }

    /**
     *
     * @return
     * The _7
     */
    public _7 get7() {
        return _7;
    }

    /**
     *
     * @param _7
     * The 7
     */
    public void set7(_7 _7) {
        this._7 = _7;
    }

    /**
     *
     * @return
     * The _8
     */
    public _8 get8() {
        return _8;
    }

    /**
     *
     * @param _8
     * The 8
     */
    public void set8(_8 _8) {
        this._8 = _8;
    }

    /**
     *
     * @return
     * The _9
     */
    public _9 get9() {
        return _9;
    }

    /**
     *
     * @param _9
     * The 9
     */
    public void set9(_9 _9) {
        this._9 = _9;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Popularity.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class Popularity {

    @SerializedName("popularity")
    @Expose
    private String popularity;
    @SerializedName("nightlife_index")
    @Expose
    private String nightlifeIndex;
    @SerializedName("nearby_res")
    @Expose
    private List<String> nearbyRes = new ArrayList<String>();
    @SerializedName("top_cuisines")
    @Expose
    private List<String> topCuisines = new ArrayList<String>();
    @SerializedName("popularity_res")
    @Expose
    private String popularityRes;
    @SerializedName("nightlife_res")
    @Expose
    private String nightlifeRes;
    @SerializedName("subzone")
    @Expose
    private String subzone;
    @SerializedName("subzone_id")
    @Expose
    private Integer subzoneId;
    @SerializedName("city")
    @Expose
    private String city;

    /**
     *
     * @return
     * The popularity
     */
    public String getPopularity() {
        return popularity;
    }

    /**
     *
     * @param popularity
     * The popularity
     */
    public void setPopularity(String popularity) {
        this.popularity = popularity;
    }

    /**
     *
     * @return
     * The nightlifeIndex
     */
    public String getNightlifeIndex() {
        return nightlifeIndex;
    }

    /**
     *
     * @param nightlifeIndex
     * The nightlife_index
     */
    public void setNightlifeIndex(String nightlifeIndex) {
        this.nightlifeIndex = nightlifeIndex;
    }

    /**
     *
     * @return
     * The nearbyRes
     */
    public List<String> getNearbyRes() {
        return nearbyRes;
    }

    /**
     *
     * @param nearbyRes
     * The nearby_res
     */
    public void setNearbyRes(List<String> nearbyRes) {
        this.nearbyRes = nearbyRes;
    }

    /**
     *
     * @return
     * The topCuisines
     */
    public List<String> getTopCuisines() {
        return topCuisines;
    }

    /**
     *
     * @param topCuisines
     * The top_cuisines
     */
    public void setTopCuisines(List<String> topCuisines) {
        this.topCuisines = topCuisines;
    }

    /**
     *
     * @return
     * The popularityRes
     */
    public String getPopularityRes() {
        return popularityRes;
    }

    /**
     *
     * @param popularityRes
     * The popularity_res
     */
    public void setPopularityRes(String popularityRes) {
        this.popularityRes = popularityRes;
    }

    /**
     *
     * @return
     * The nightlifeRes
     */
    public String getNightlifeRes() {
        return nightlifeRes;
    }

    /**
     *
     * @param nightlifeRes
     * The nightlife_res
     */
    public void setNightlifeRes(String nightlifeRes) {
        this.nightlifeRes = nightlifeRes;
    }

    /**
     *
     * @return
     * The subzone
     */
    public String getSubzone() {
        return subzone;
    }

    /**
     *
     * @param subzone
     * The subzone
     */
    public void setSubzone(String subzone) {
        this.subzone = subzone;
    }

    /**
     *
     * @return
     * The subzoneId
     */
    public Integer getSubzoneId() {
        return subzoneId;
    }

    /**
     *
     * @param subzoneId
     * The subzone_id
     */
    public void setSubzoneId(Integer subzoneId) {
        this.subzoneId = subzoneId;
    }

    /**
     *
     * @return
     * The city
     */
    public String getCity() {
        return city;
    }

    /**
     *
     * @param city
     * The city
     */
    public void setCity(String city) {
        this.city = city;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;


 class R {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R_.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class R_ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R__.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class R__ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R___.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class R___ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class R____ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R_____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class R_____ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class R______ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R_______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class R_______ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.R________.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class R________ {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

    /**
     *
     * @return
     * The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     *
     * @param resId
     * The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant {

    @SerializedName("R")
    @Expose
    private com.example.tae_user0.finalprojectapp1.R R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location_ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public com.example.tae_user0.finalprojectapp1.R getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
//    public void setR( R re) {
//        this.R = re;
//    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location_ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location_ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant_.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant_ {

    @SerializedName("R")
    @Expose
    private R_ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location__ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating_ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R_ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R_ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location__ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location__ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating_ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating_ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant__.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant__ {

    @SerializedName("R")
    @Expose
    private R__ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location___ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating__ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R__ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R__ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location___ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location___ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating__ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating__ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant___.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant___ {

    @SerializedName("R")
    @Expose
    private R___ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location____ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating___ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R___ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R___ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location____ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location____ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating___ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating___ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant____ {

    @SerializedName("R")
    @Expose
    private R____ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location_____ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating____ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R____ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R____ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location_____ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location_____ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating____ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating____ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant_____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant_____ {

    @SerializedName("R")
    @Expose
    private R_____ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location______ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating_____ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R_____ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R_____ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location______ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location______ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating_____ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating_____ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant______ {

    @SerializedName("R")
    @Expose
    private R______ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location_______ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating______ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R______ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R______ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location_______ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location_______ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating______ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating______ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant_______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant_______ {

    @SerializedName("R")
    @Expose
    private R_______ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location________ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating_______ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R_______ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R_______ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location________ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location________ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating_______ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating_______ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.Restaurant________.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import java.util.ArrayList;
//        import java.util.List;
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class Restaurant________ {

    @SerializedName("R")
    @Expose
    private R________ R;
    @SerializedName("apikey")
    @Expose
    private String apikey;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("location")
    @Expose
    private Location_________ location;
    @SerializedName("cuisines")
    @Expose
    private String cuisines;
    @SerializedName("average_cost_for_two")
    @Expose
    private Integer averageCostForTwo;
    @SerializedName("price_range")
    @Expose
    private Integer priceRange;
    @SerializedName("currency")
    @Expose
    private String currency;
    @SerializedName("offers")
    @Expose
    private List<Object> offers = new ArrayList<Object>();
    @SerializedName("thumb")
    @Expose
    private String thumb;
    @SerializedName("user_rating")
    @Expose
    private UserRating________ userRating;
    @SerializedName("photos_url")
    @Expose
    private String photosUrl;
    @SerializedName("menu_url")
    @Expose
    private String menuUrl;
    @SerializedName("featured_image")
    @Expose
    private String featuredImage;
    @SerializedName("has_online_delivery")
    @Expose
    private Integer hasOnlineDelivery;
    @SerializedName("is_delivering_now")
    @Expose
    private Integer isDeliveringNow;
    @SerializedName("deeplink")
    @Expose
    private String deeplink;
    @SerializedName("events_url")
    @Expose
    private String eventsUrl;

    /**
     *
     * @return
     * The R
     */
    public R________ getR() {
        return R;
    }

    /**
     *
     * @param R
     * The R
     */
    public void setR(R________ R) {
        this.R = R;
    }

    /**
     *
     * @return
     * The apikey
     */
    public String getApikey() {
        return apikey;
    }

    /**
     *
     * @param apikey
     * The apikey
     */
    public void setApikey(String apikey) {
        this.apikey = apikey;
    }

    /**
     *
     * @return
     * The id
     */
    public String getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The url
     */
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url
     * The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     *
     * @return
     * The location
     */
    public Location_________ getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(Location_________ location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The cuisines
     */
    public String getCuisines() {
        return cuisines;
    }

    /**
     *
     * @param cuisines
     * The cuisines
     */
    public void setCuisines(String cuisines) {
        this.cuisines = cuisines;
    }

    /**
     *
     * @return
     * The averageCostForTwo
     */
    public Integer getAverageCostForTwo() {
        return averageCostForTwo;
    }

    /**
     *
     * @param averageCostForTwo
     * The average_cost_for_two
     */
    public void setAverageCostForTwo(Integer averageCostForTwo) {
        this.averageCostForTwo = averageCostForTwo;
    }

    /**
     *
     * @return
     * The priceRange
     */
    public Integer getPriceRange() {
        return priceRange;
    }

    /**
     *
     * @param priceRange
     * The price_range
     */
    public void setPriceRange(Integer priceRange) {
        this.priceRange = priceRange;
    }

    /**
     *
     * @return
     * The currency
     */
    public String getCurrency() {
        return currency;
    }

    /**
     *
     * @param currency
     * The currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     *
     * @return
     * The offers
     */
    public List<Object> getOffers() {
        return offers;
    }

    /**
     *
     * @param offers
     * The offers
     */
    public void setOffers(List<Object> offers) {
        this.offers = offers;
    }

    /**
     *
     * @return
     * The thumb
     */
    public String getThumb() {
        return thumb;
    }

    /**
     *
     * @param thumb
     * The thumb
     */
    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    /**
     *
     * @return
     * The userRating
     */
    public UserRating________ getUserRating() {
        return userRating;
    }

    /**
     *
     * @param userRating
     * The user_rating
     */
    public void setUserRating(UserRating________ userRating) {
        this.userRating = userRating;
    }

    /**
     *
     * @return
     * The photosUrl
     */
    public String getPhotosUrl() {
        return photosUrl;
    }

    /**
     *
     * @param photosUrl
     * The photos_url
     */
    public void setPhotosUrl(String photosUrl) {
        this.photosUrl = photosUrl;
    }

    /**
     *
     * @return
     * The menuUrl
     */
    public String getMenuUrl() {
        return menuUrl;
    }

    /**
     *
     * @param menuUrl
     * The menu_url
     */
    public void setMenuUrl(String menuUrl) {
        this.menuUrl = menuUrl;
    }

    /**
     *
     * @return
     * The featuredImage
     */
    public String getFeaturedImage() {
        return featuredImage;
    }

    /**
     *
     * @param featuredImage
     * The featured_image
     */
    public void setFeaturedImage(String featuredImage) {
        this.featuredImage = featuredImage;
    }

    /**
     *
     * @return
     * The hasOnlineDelivery
     */
    public Integer getHasOnlineDelivery() {
        return hasOnlineDelivery;
    }

    /**
     *
     * @param hasOnlineDelivery
     * The has_online_delivery
     */
    public void setHasOnlineDelivery(Integer hasOnlineDelivery) {
        this.hasOnlineDelivery = hasOnlineDelivery;
    }

    /**
     *
     * @return
     * The isDeliveringNow
     */
    public Integer getIsDeliveringNow() {
        return isDeliveringNow;
    }

    /**
     *
     * @param isDeliveringNow
     * The is_delivering_now
     */
    public void setIsDeliveringNow(Integer isDeliveringNow) {
        this.isDeliveringNow = isDeliveringNow;
    }

    /**
     *
     * @return
     * The deeplink
     */
    public String getDeeplink() {
        return deeplink;
    }

    /**
     *
     * @param deeplink
     * The deeplink
     */
    public void setDeeplink(String deeplink) {
        this.deeplink = deeplink;
    }

    /**
     *
     * @return
     * The eventsUrl
     */
    public String getEventsUrl() {
        return eventsUrl;
    }

    /**
     *
     * @param eventsUrl
     * The events_url
     */
    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating_.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating_ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating__.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating__ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating___.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating___ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating____ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating_____.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating_____ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating______ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating_______.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating_______ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1.UserRating________.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class UserRating________ {

    @SerializedName("aggregate_rating")
    @Expose
    private String aggregateRating;
    @SerializedName("rating_text")
    @Expose
    private String ratingText;
    @SerializedName("rating_color")
    @Expose
    private String ratingColor;
    @SerializedName("votes")
    @Expose
    private Integer votes;

    /**
     *
     * @return
     * The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     *
     * @param aggregateRating
     * The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     *
     * @return
     * The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     *
     * @param ratingText
     * The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     *
     * @return
     * The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     *
     * @param ratingColor
     * The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     *
     * @return
     * The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     *
     * @param votes
     * The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._1.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _1 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._2.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _2 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant_ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant_ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant_ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._3.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _3 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant__ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant__ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant__ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._4.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _4 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant___ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant___ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant___ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._5.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _5 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant____ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant____ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant____ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._6.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _6 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant_____ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant_____ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant_____ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._7.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;
//
//@Generated("org.jsonschema2pojo")
 class _7 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant______ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant______ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant______ restaurant) {
        this.restaurant = restaurant;
    }

}
//-----------------------------------com.example.tae_user0.finalprojectapp1._8.java-----------------------------------

//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class _8 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant_______ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant_______ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant_______ restaurant) {
        this.restaurant = restaurant;
    }

}
////-----------------------------------com.example.tae_user0.finalprojectapp1._9.java-----------------------------------
//
//        package com.example.tae_user0.finalprojectapp1;
//
//        import javax.annotation.Generated;
//        import com.google.gson.annotations.Expose;
//        import com.google.gson.annotations.SerializedName;

 class _9 {

    @SerializedName("restaurant")
    @Expose
    private Restaurant________ restaurant;

    /**
     *
     * @return
     * The restaurant
     */
    public Restaurant________ getRestaurant() {
        return restaurant;
    }

    /**
     *
     * @param restaurant
     * The restaurant
     */
    public void setRestaurant(Restaurant________ restaurant) {
        this.restaurant = restaurant;
    }

}

