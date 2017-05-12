package com.skeleton.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 8/5/17.
 */

public class Post {

    @SerializedName("name")
    private String name;
    @SerializedName("job")
    private String job;
    @SerializedName("id")
    private String id;
    @SerializedName("createdAt")
    private String createdAt;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name string
     */
    public void setName(final String name) {
        this.name = name;
    }

    /**
     * @return job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job string
     */
    public void setJob(final String job) {
        this.job = job;
    }

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id string
     */
    public void setId(final String id) {
        this.id = id;
    }

    /**
     * @return string
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt string
     */
    public void setCreatedAt(final String createdAt) {
        this.createdAt = createdAt;
    }
}
