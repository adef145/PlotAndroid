package com.adefruandta.plotandroid.model;

import org.parceler.Parcel;

/**
 * Created by HappyFresh on 11/29/16.
 */

@Parcel(analyze = UserParceler.class)
public class UserParceler {

    String name;

    public UserParceler() {

    }

    public UserParceler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
