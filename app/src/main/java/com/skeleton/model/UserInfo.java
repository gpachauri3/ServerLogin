package com.skeleton.model;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by mark-42 on 4/5/17.
 */

public class UserInfo implements Parcelable {

    public static final Creator<UserInfo> CREATOR = new Creator<UserInfo>() {
        @Override
        public UserInfo createFromParcel(final Parcel in) {
            return new UserInfo(in);
        }

        @Override
        public UserInfo[] newArray(final int size) {
            return new UserInfo[size];
        }
    };
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("username")
    @Expose
    private String username;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("address")
    @Expose
    private Address address;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("website")
    @Expose
    private String website;
    @SerializedName("company")
    @Expose
    private Company company;

    /**
     * @param in write
     */
    protected UserInfo(final Parcel in) {
        name = in.readString();
        username = in.readString();
        email = in.readString();
        phone = in.readString();
        website = in.readString();
    }

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id Integer
     */
    public void setId(final Integer id) {
        this.id = id;
    }

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
     * @return username
     */

    public String getUsername() {

        return username;
    }

    /**
     * @param username String
     */

    public void setUsername(final String username) {
        this.username = username;
    }

    /**
     * @return email
     */

    public String getEmail() {
        return email;
    }

    /**
     * @param email String
     */

    public void setEmail(final String email) {
        this.email = email;
    }

    /**
     * @return address
     */

    public Address getAddress() {
        return address;
    }

    /**
     * @param address address
     */
    public void setAddress(final Address address) {
        this.address = address;
    }

    /**
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    /**
     * @param phone String
     */

    public void setPhone(final String phone) {
        this.phone = phone;
    }

    /**
     * @return website
     */

    public String getWebsite() {
        return website;
    }

    /**
     * @param website String
     */

    public void setWebsite(final String website) {
        this.website = website;
    }

    /**
     * @return company
     */
    public Company getCompany() {
        return company;
    }

    /**
     * @param company company
     */

    public void setCompany(final Company company) {
        this.company = company;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(final Parcel dest, final int flags) {
        dest.writeString(name);
        dest.writeString(username);
        dest.writeString(email);
        dest.writeString(phone);
        dest.writeString(website);
    }
}
