package com.teslacode.plot.binder;

import android.os.Bundle;

import org.parceler.Parcels;

import java.lang.reflect.Field;

/**
 * Created by HappyFresh on 11/29/16.
 */

public class ParcelerBinder implements TypeBinder<Object> {

    @Override
    public void setBundle(Bundle bundle, String key, Object value) {
        bundle.putParcelable(key, Parcels.wrap(value));
    }

    @Override
    public Object getBundle(Bundle bundle, String key) {
        return Parcels.unwrap(bundle.getParcelable(key));
    }

    @Override
    public void setField(Field field, Object target, Object value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Object getField(Field field, Object target) throws IllegalAccessException {
        return field.get(target);
    }
}
