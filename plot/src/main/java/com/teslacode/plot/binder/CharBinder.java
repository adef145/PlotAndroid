package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class CharBinder implements TypeBinder<Character> {

    @Override
    public void setBundle(Bundle bundle, String key, Character value) {
        bundle.putChar(key, value);
    }

    @Override
    public Character getBundle(Bundle bundle, String key) {
        return bundle.getChar(key);
    }

    @Override
    public void setField(Field field, Object target, Character value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Character getField(Field field, Object target) throws IllegalAccessException {
        return (Character) field.get(target);
    }
}
