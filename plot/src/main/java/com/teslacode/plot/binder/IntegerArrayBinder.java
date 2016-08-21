package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class IntegerArrayBinder implements TypeBinder<int[]> {

    @Override
    public void setBundle(Bundle bundle, String key, int[] value) {
        bundle.putIntArray(key, value);
    }

    @Override
    public int[] getBundle(Bundle bundle, String key) {
        return bundle.getIntArray(key);
    }

    @Override
    public void setField(Field field, Object target, int[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public int[] getField(Field field, Object target) throws IllegalAccessException {
        return (int[]) field.get(target);
    }
}
