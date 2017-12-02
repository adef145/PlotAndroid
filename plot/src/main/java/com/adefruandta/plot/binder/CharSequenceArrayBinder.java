package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class CharSequenceArrayBinder implements TypeBinder<CharSequence[]> {

    @Override
    public void setBundle(Bundle bundle, String key, CharSequence[] value) {
        bundle.putCharSequenceArray(key, value);
    }

    @Override
    public CharSequence[] getBundle(Bundle bundle, String key) {
        return bundle.getCharSequenceArray(key);
    }

    @Override
    public void setField(Field field, Object target, CharSequence[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public CharSequence[] getField(Field field, Object target) throws IllegalAccessException {
        return (CharSequence[]) field.get(target);
    }
}
