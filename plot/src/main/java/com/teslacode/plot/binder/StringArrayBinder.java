package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class StringArrayBinder implements TypeBinder<String[]> {

    @Override
    public void setBundle(Bundle bundle, String key, String[] value) {
        bundle.putStringArray(key, value);
    }

    @Override
    public String[] getBundle(Bundle bundle, String key) {
        return bundle.getStringArray(key);
    }

    @Override
    public void setField(Field field, Object target, String[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public String[] getField(Field field, Object target) throws IllegalAccessException {
        return (String[]) field.get(target);
    }
}
