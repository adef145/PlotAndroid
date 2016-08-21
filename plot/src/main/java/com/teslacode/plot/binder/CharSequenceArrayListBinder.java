package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * Created by HappyFresh on 8/21/16.
 */
public class CharSequenceArrayListBinder implements TypeBinder<ArrayList<CharSequence>> {

    @Override
    public void setBundle(Bundle bundle, String key, ArrayList<CharSequence> value) {
        bundle.putCharSequenceArrayList(key, value);
    }

    @Override
    public ArrayList<CharSequence> getBundle(Bundle bundle, String key) {
        return bundle.getCharSequenceArrayList(key);
    }

    @Override
    public void setField(Field field, Object target, ArrayList<CharSequence> value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public ArrayList<CharSequence> getField(Field field, Object target) throws IllegalAccessException {
        return (ArrayList<CharSequence>) field.get(target);
    }
}
