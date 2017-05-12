package com.skeleton.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 4/5/17.
 */

public class Company {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("catchPhrase")
    @Expose
    private String catchPhrase;
    @SerializedName("bs")
    @Expose
    private String bs;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name String
     */

    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return catchPhrase
     */

    public String getCatchPhrase() {
        return catchPhrase;
    }

    /**
     * @param catchPhrase String
     */

    public void setCatchPhrase(final String catchPhrase) {
        this.catchPhrase = catchPhrase;
    }

    /**
     * @return bs
     */

    public String getBs() {
        return bs;
    }

    /**
     * @param bs String
     */

    public void setBs(final String bs) {
        this.bs = bs;
    }
}
