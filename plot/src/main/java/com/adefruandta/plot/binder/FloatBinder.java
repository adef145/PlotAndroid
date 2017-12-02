package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class FloatBinder implements TypeBinder<Float> {

    @Override
    public void setBundle(Bundle bundle, String key, Float value) {
        bundle.putFloat(key, value);
    }

    @Override
    public Float getBundle(Bundle bundle, String key) {
        return bundle.getFloat(key);
    }

    @Override
    public void setField(Field field, Object target, Float value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Float getField(Field field, Object target) throws IllegalAccessException {
        return (Float) field.get(target);
    }
}
