
package com.example.tae_user0.finalprojectapp1.Model.api2;


import android.os.Parcel;
import android.os.Parcelable;

public class R  implements Parcelable {

    private Integer resId;

    protected R(Parcel in) {
    }

    public static final Creator<R> CREATOR = new Creator<R>() {
        @Override
        public R createFromParcel(Parcel in) {
            return new R(in);
        }

        @Override
        public R[] newArray(int size) {
            return new R[size];
        }
    };

    /**
     * 
     * @return
     *     The resId
     */
    public Integer getResId() {
        return resId;
    }

    /**
     * 
     * @param resId
     *     The res_id
     */
    public void setResId(Integer resId) {
        this.resId = resId;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
    }
}
