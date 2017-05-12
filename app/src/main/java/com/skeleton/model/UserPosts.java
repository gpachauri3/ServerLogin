package com.skeleton.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 4/5/17.
 */

public class UserPosts {


    @SerializedName("userId")
    private int userId;
    @SerializedName("id")
    private int id;
    @SerializedName("title")
    private String title;
    @SerializedName("body")
    private String body;

    /**
     * @return userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId int
     */
    public void setUserId(final int userId) {
        this.userId = userId;
    }

    /**
     * @return id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id int
     */
    public void setId(final int id) {
        this.id = id;
    }

    /**
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title String
     */
    public void setTitle(final String title) {
        this.title = title;
    }

    /**
     * @return body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body String
     */
    public void setBody(final String body) {
        this.body = body;
    }
}
