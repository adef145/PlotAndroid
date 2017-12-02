package com.adefruandta.plot.binder;

import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;

import java.lang.reflect.Field;

/**
 * Created by HappyFresh on 8/22/16.
 */
public class IBinderBinder implements TypeBinder<IBinder> {

    @Override
    public void setBundle(Bundle bundle, String key, IBinder value) {
        if (Build.VERSION.SDK_INT >= 18) {
            bundle.putBinder(key, value);
        }
    }

    @Override
    public IBinder getBundle(Bundle bundle, String key) {
        if (Build.VERSION.SDK_INT >= 18) {
            return bundle.getBinder(key);
        }
        return null;
    }

    @Override
    public void setField(Field field, Object target, IBinder value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public IBinder getField(Field field, Object target) throws IllegalAccessException {
        return (IBinder) field.get(target);
    }
}
