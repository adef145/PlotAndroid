package com.adefruandta.plotandroid.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class UserParcelable implements Parcelable {

    public static final Creator<UserParcelable> CREATOR = new Creator<UserParcelable>() {
        @Override
        public UserParcelable createFromParcel(Parcel in) {
            return new UserParcelable(in);
        }

        @Override
        public UserParcelable[] newArray(int size) {
            return new UserParcelable[size];
        }
    };

    public String name;

    public Integer age;

    public UserParcelable() {
        name = "Ade";
        age = 27;
    }

    protected UserParcelable(Parcel in) {
        name = in.readString();
        age = in.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeInt(age);
    }
}
