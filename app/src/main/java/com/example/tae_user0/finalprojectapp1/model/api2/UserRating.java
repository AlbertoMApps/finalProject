
package com.example.tae_user0.finalprojectapp1.Model.api2;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserRating  implements Parcelable {

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

    protected UserRating(Parcel in) {
        aggregateRating = in.readString();
        ratingText = in.readString();
        ratingColor = in.readString();
    }

    public static final Creator<UserRating> CREATOR = new Creator<UserRating>() {
        @Override
        public UserRating createFromParcel(Parcel in) {
            return new UserRating(in);
        }

        @Override
        public UserRating[] newArray(int size) {
            return new UserRating[size];
        }
    };

    /**
     * 
     * @return
     *     The aggregateRating
     */
    public String getAggregateRating() {
        return aggregateRating;
    }

    /**
     * 
     * @param aggregateRating
     *     The aggregate_rating
     */
    public void setAggregateRating(String aggregateRating) {
        this.aggregateRating = aggregateRating;
    }

    /**
     * 
     * @return
     *     The ratingText
     */
    public String getRatingText() {
        return ratingText;
    }

    /**
     * 
     * @param ratingText
     *     The rating_text
     */
    public void setRatingText(String ratingText) {
        this.ratingText = ratingText;
    }

    /**
     * 
     * @return
     *     The ratingColor
     */
    public String getRatingColor() {
        return ratingColor;
    }

    /**
     * 
     * @param ratingColor
     *     The rating_color
     */
    public void setRatingColor(String ratingColor) {
        this.ratingColor = ratingColor;
    }

    /**
     * 
     * @return
     *     The votes
     */
    public Integer getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    public void setVotes(Integer votes) {
        this.votes = votes;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(aggregateRating);
        dest.writeString(ratingText);
        dest.writeString(ratingColor);
    }
}
