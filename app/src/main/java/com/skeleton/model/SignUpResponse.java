package com.skeleton.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 9/5/17.
 */

public class SignUpResponse {


    @SerializedName("statusCode")
    private int statusCode;
    @SerializedName("message")
    private String message;
    @SerializedName("data")
    private com.skeleton.model.Data data;

    /**
     * status code from server
     *
     * @return status code int
     */
    public int getStatusCode() {
        return statusCode;
    }

    /**
     * @param statusCode int
     */
    public void setStatusCode(final int statusCode) {
        this.statusCode = statusCode;
    }

    /**
     * Get message from server
     *
     * @return get message from server
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message set message
     */
    public void setMessage(final String message) {
        this.message = message;
    }

    /**
     * get data from server
     *
     * @return Data Class
     */
    public com.skeleton.model.Data getData() {
        return data;
    }

    /**
     * @param data Data
     */
    public void setData(final com.skeleton.model.Data data) {
        this.data = data;
    }
}
