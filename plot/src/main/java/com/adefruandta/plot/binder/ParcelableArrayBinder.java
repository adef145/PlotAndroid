package com.adefruandta.plot.binder;

import android.os.Bundle;
import android.os.Parcelable;

import java.lang.reflect.Field;

public class ParcelableArrayBinder implements TypeBinder<Parcelable[]> {

    @Override
    public void setBundle(Bundle bundle, String key, Parcelable[] value) {
        bundle.putParcelableArray(key, value);
    }

    @Override
    public Parcelable[] getBundle(Bundle bundle, String key) {
        return bundle.getParcelableArray(key);
    }

    @Override
    public void setField(Field field, Object target, Parcelable[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Parcelable[] getField(Field field, Object target) throws IllegalAccessException {
        return (Parcelable[]) field.get(target);
    }
}
