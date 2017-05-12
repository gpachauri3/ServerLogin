package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 4/5/17.
 */

public class Geo {

    @SerializedName("lat")
    @Expose
    private String lat;
    @SerializedName("lng")
    @Expose
    private String lng;

    /**
     * @return lat
     */

    public String getLat() {
        return lat;
    }

    /**
     * @param lat String
     */

    public void setLat(final String lat) {
        this.lat = lat;
    }

    /**
     * @return lng
     */
    public String getLng() {
        return lng;
    }

    /**
     * @param lng String
     */

    public void setLng(final String lng) {
        this.lng = lng;
    }


}
