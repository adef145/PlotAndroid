package com.teslacode.plot.binder;

import android.os.Bundle;
import android.os.Parcelable;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class ParcelableArrayListBinder implements TypeBinder<ArrayList<Parcelable>> {

    @Override
    public void setBundle(Bundle bundle, String key, ArrayList<Parcelable> value) {
        bundle.putParcelableArrayList(key, value);
    }

    @Override
    public ArrayList<Parcelable> getBundle(Bundle bundle, String key) {
        return bundle.getParcelableArrayList(key);
    }

    @Override
    public void setField(Field field, Object target, ArrayList<Parcelable> value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public ArrayList<Parcelable> getField(Field field, Object target) throws IllegalAccessException {
        return (ArrayList<Parcelable>) field.get(target);
    }
}
