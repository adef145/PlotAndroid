package com.teslacode.plot;

import android.os.Bundle;

import com.teslacode.plot.annotation.PlotBundle;
import com.teslacode.plot.binder.PlotTypeBinder;
import com.teslacode.plot.binder.TypeBinder;

import java.lang.reflect.Field;

/**
 * Field binding for Android Bundle. Use this class for attaching value of bundle.
 */
public class Plot {

    /**
     * Binding bundle to specified {@code target} with {@code bundle} value.
     *
     * @param target Target class for bundle binding.
     * @param bundle Bundle value for binding to target.
     */
    public static void importBundle(Object target, Bundle bundle) {
        Class<?> targetClass = target.getClass();
        for (Field field : targetClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(PlotBundle.class)) {
                PlotBundle plotBundle = field.getAnnotation(PlotBundle.class);
                if (plotBundle.imported()) {
                    String key = getKey(field, plotBundle.key());
                    field.setAccessible(true);
                    try {
                        TypeBinder typeBinder = PlotTypeBinder.getTypeBinder(field);
                        typeBinder.setField(field, target, typeBinder.getBundle(bundle, key));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }

    /**
     * Get bundle from {@code target}.
     *
     * @param target Target class for get bundle.
     * @return
     */
    public static Bundle exportBundle(Object target) {
        Bundle bundle = new Bundle();
        Class<?> targetClass = target.getClass();
        for (Field field : targetClass.getDeclaredFields()) {
            if (field.isAnnotationPresent(PlotBundle.class)) {
                PlotBundle plotBundle = field.getAnnotation(PlotBundle.class);
                if (plotBundle.exported()) {
                    String key = getKey(field, plotBundle.key());
                    field.setAccessible(true);
                    try {
                        TypeBinder typeBinder = PlotTypeBinder.getTypeBinder(field);
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
