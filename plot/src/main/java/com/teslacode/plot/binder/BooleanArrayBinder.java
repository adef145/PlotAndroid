package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class BooleanArrayBinder implements TypeBinder<boolean[]> {

    @Override
    public void setBundle(Bundle bundle, String key, boolean[] value) {
        bundle.putBooleanArray(key, value);
    }

    @Override
    public boolean[] getBundle(Bundle bundle, String key) {
        return bundle.getBooleanArray(key);
    }

    @Override
    public void setField(Field field, Object target, boolean[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public boolean[] getField(Field field, Object target) throws IllegalAccessException {
        return (boolean[]) field.get(target);
    }
}
