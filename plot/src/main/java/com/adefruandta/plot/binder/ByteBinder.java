package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class ByteBinder implements TypeBinder<Byte> {

    @Override
    public void setBundle(Bundle bundle, String key, Byte value) {
        bundle.putByte(key, value);
    }

    @Override
    public Byte getBundle(Bundle bundle, String key) {
        return bundle.getByte(key);
    }

    @Override
    public void setField(Field field, Object target, Byte value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public Byte getField(Field field, Object target) throws IllegalAccessException {
        return (Byte) field.get(target);
    }
}
