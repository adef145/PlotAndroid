package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class BooleanBinder implements TypeBinder<Boolean> {

    @Override
    public void setBundle(Bundle bundle, String key, Boolean value) {
        bundle.putBoolean(key, value);
    }

    @Override
    public Boolean getBundle(Bundle bundle, String key) {
        return bundle.getBoolean(key);
    }

    @Override
    public void setField(Field field, Object target, Boolean value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Boolean getField(Field field, Object target) throws IllegalAccessException {
        return (Boolean) field.get(target);
    }
}
