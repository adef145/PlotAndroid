package com.teslacode.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public interface TypeBinder<T> {

    /**
     * Set {@code bundle} with {@code key} and {@code value}.
     *
     * @param bundle Bundle to set.
     * @param key    Key for {@code bundle} {@code value}.
     * @param value  Value for bundle.
     */
    void setBundle(Bundle bundle, String key, T value);

    /**
     * Get {@code bundle} value.
     *
     * @param bundle Bundle source value.
     * @param key    Key for {@code bundle} value
     * @return Type.
     */
    T getBundle(Bundle bundle, String key);

    /**
     * Set {@code field} from {@code target} with {@code value}.
     *
     * @param field  Field to set.
     * @param target Target class for {@code field}.
     * @param value  Value for set to {@code field}.
     * @throws IllegalAccessException For Set field.
     */
    void setField(Field field, Object target, T value) throws IllegalAccessException;

    /**
     * Get {@code field} value from {@code target}.
     *
     * @param field  Field to get.
     * @param target Target class for {@code field}.
     * @return Type.
     * @throws IllegalAccessException For Set field.
     */
    T getField(Field field, Object target) throws IllegalAccessException;
}
