package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class DoubleArrayBinder implements TypeBinder<double[]> {

    @Override
    public void setBundle(Bundle bundle, String key, double[] value) {
        bundle.putDoubleArray(key, value);
    }

    @Override
    public double[] getBundle(Bundle bundle, String key) {
        return bundle.getDoubleArray(key);
    }

    @Override
    public void setField(Field field, Object target, double[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public double[] getField(Field field, Object target) throws IllegalAccessException {
        return (double[]) field.get(target);
    }
}
