package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

/**
 * Created by HappyFresh on 8/20/16.
 */
public interface TypeBinder<T> {

    void setBundle(Bundle bundle, String key, T value);

    T getBundle(Bundle bundle, String key);

    void setField(Field field, Object target, T value) throws IllegalAccessException;

    T getField(Field field, Object target) throws IllegalAccessException;
}
