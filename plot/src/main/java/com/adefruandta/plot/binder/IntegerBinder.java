package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class IntegerBinder implements TypeBinder<Integer> {

    @Override
    public void setBundle(Bundle bundle, String key, Integer value) {
        bundle.putInt(key, value);
    }

    @Override
    public Integer getBundle(Bundle bundle, String key) {
        return bundle.getInt(key);
    }

    @Override
    public void setField(Field field, Object target, Integer value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Integer getField(Field field, Object target) throws IllegalAccessException {
        return (Integer) field.get(target);
    }
}
