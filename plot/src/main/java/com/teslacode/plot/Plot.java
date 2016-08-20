package com.teslacode.plot;

import android.os.Bundle;

import com.teslacode.plot.annotation.PlotBundle;
import com.teslacode.plot.binder.PlotTypeBinder;
import com.teslacode.plot.binder.TypeBinder;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/**
 * Created by HappyFresh on 8/19/16.
 */
public class Plot {

    public static void importBundle(Object target, Bundle bundle) {
        Class<?> targetClass = target.getClass();
        for (Field field : targetClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(PlotBundle.class)) {
                PlotBundle plotBundle = field.getAnnotation(PlotBundle.class);

                if (plotBundle.imported()) {
                    String key = getKey(field, plotBundle.key());
                    Type type = field.getType();

                    field.setAccessible(true);
                    try {
                        TypeBinder typeBinder = PlotTypeBinder.mMapTypeBinder.get(type);
                        typeBinder.setField(field, target, typeBinder.getBundle(bundle, key));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    public static Bundle exportBundle(Object target) {
        Bundle bundle = new Bundle();
        Class<?> targetClass = target.getClass();
        for (Field field : targetClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(PlotBundle.class)) {
                PlotBundle plotBundle = field.getAnnotation(PlotBundle.class);

                if (plotBundle.exported()) {
                    String key = getKey(field, plotBundle.key());
                    Type type = field.getType();

                    field.setAccessible(true);
                    try {
                        TypeBinder typeBinder = PlotTypeBinder.mMapTypeBinder.get(type);
                        typeBinder.setBundle(bundle, key, typeBinder.getField(field, target));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return bundle;
    }

    private static String getKey(Field field, String key) {
        if (key.isEmpty()) {
            return field.getName();
        }
        return key;
    }
}
