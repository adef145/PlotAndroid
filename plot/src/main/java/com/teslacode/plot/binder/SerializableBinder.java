package com.teslacode.plot.binder;

import android.os.Bundle;

import java.io.Serializable;
import java.lang.reflect.Field;

public class SerializableBinder implements TypeBinder<Serializable> {

    @Override
    public void setBundle(Bundle bundle, String key, Serializable value) {
        bundle.putSerializable(key, value);
    }

    @Override
    public Serializable getBundle(Bundle bundle, String key) {
        return bundle.getSerializable(key);
    }

    @Override
    public void setField(Field field, Object target, Serializable value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Serializable getField(Field field, Object target) throws IllegalAccessException {
        return (Serializable) field.get(target);
    }
}
