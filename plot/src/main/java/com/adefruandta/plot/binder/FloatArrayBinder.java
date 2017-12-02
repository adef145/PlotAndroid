package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class FloatArrayBinder implements TypeBinder<float[]> {

    @Override
    public void setBundle(Bundle bundle, String key, float[] value) {
        bundle.putFloatArray(key, value);
    }

    @Override
    public float[] getBundle(Bundle bundle, String key) {
        return bundle.getFloatArray(key);
    }

    @Override
    public void setField(Field field, Object target, float[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public float[] getField(Field field, Object target) throws IllegalAccessException {
        return (float[]) field.get(target);
    }
}
