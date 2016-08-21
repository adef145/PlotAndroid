package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class DoubleBinder implements TypeBinder<Double> {

    @Override
    public void setBundle(Bundle bundle, String key, Double value) {
        bundle.putDouble(key, value);
    }

    @Override
    public Double getBundle(Bundle bundle, String key) {
        return bundle.getDouble(key);
    }

    @Override
    public void setField(Field field, Object target, Double value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Double getField(Field field, Object target) throws IllegalAccessException {
        return (Double) field.get(target);
    }
}
