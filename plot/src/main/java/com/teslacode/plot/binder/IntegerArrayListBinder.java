package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class IntegerArrayListBinder implements TypeBinder<ArrayList<Integer>> {

    @Override
    public void setBundle(Bundle bundle, String key, ArrayList<Integer> value) {
        bundle.putIntegerArrayList(key, value);
    }

    @Override
    public ArrayList<Integer> getBundle(Bundle bundle, String key) {
        return bundle.getIntegerArrayList(key);
    }

    @Override
    public void setField(Field field, Object target, ArrayList<Integer> value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public ArrayList<Integer> getField(Field field, Object target) throws IllegalAccessException {
        return (ArrayList<Integer>) field.get(target);
    }
}
