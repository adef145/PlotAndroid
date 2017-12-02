package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class StringArrayListBinder implements TypeBinder<ArrayList<String>> {

    @Override
    public void setBundle(Bundle bundle, String key, ArrayList<String> value) {
        bundle.putStringArrayList(key, value);
    }

    @Override
    public ArrayList<String> getBundle(Bundle bundle, String key) {
        return bundle.getStringArrayList(key);
    }

    @Override
    public void setField(Field field, Object target, ArrayList<String> value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public ArrayList<String> getField(Field field, Object target) throws IllegalAccessException {
        return (ArrayList<String>) field.get(target);
    }
}
