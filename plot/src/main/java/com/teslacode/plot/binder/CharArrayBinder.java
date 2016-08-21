package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class CharArrayBinder implements TypeBinder<char[]> {

    @Override
    public void setBundle(Bundle bundle, String key, char[] value) {
        bundle.putCharArray(key, value);
    }

    @Override
    public char[] getBundle(Bundle bundle, String key) {
        return bundle.getCharArray(key);
    }

    @Override
    public void setField(Field field, Object target, char[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public char[] getField(Field field, Object target) throws IllegalAccessException {
        return (char[]) field.get(target);
    }
}
