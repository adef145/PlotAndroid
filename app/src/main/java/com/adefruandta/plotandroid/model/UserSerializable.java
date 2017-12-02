package com.adefruandta.plotandroid.model;

import java.io.Serializable;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class UserSerializable implements Serializable {

    public String name;

    public int age;

    public UserSerializable() {
        name = "Ade";
        age = 27;
    }
}
