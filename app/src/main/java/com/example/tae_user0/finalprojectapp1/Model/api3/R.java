
package com.example.tae_user0.finalprojectapp1.Model.api3;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class R {

    @SerializedName("res_id")
    @Expose
    private Integer resId;

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

}
