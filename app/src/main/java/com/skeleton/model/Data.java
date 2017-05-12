package com.skeleton.model;

import com.google.gson.annotations.SerializedName;

/**
 * data model
 */
public class Data {
    @SerializedName("accessToken")
    private String accessToken;
    @SerializedName("userDetails")
    private UserDetails userDetails;

    /**
     * @return access token of user
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     * @param accessToken access token
     */
    public void setAccessToken(final String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     * @return get user details object
     */
    public UserDetails getUserDetails() {
        return userDetails;
    }

    /**
     * @param userDetails value of user details class
     */
    public void setUserDetails(final UserDetails userDetails) {
        this.userDetails = userDetails;
    }
}
