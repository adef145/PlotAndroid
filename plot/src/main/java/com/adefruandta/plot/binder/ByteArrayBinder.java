package com.adefruandta.plot.binder;

import android.os.Bundle;

import java.lang.reflect.Field;

public class ByteArrayBinder implements TypeBinder<byte[]> {

    @Override
    public void setBundle(Bundle bundle, String key, byte[] value) {
        bundle.putByteArray(key, value);
    }

    @Override
    public byte[] getBundle(Bundle bundle, String key) {
        return bundle.getByteArray(key);
    }

    @Override
    public void setField(Field field, Object target, byte[] value) throws IllegalAccessException {
        field.set(target, value);
    }

    @Override
    public byte[] getField(Field field, Object target) throws IllegalAccessException {
        return (byte[]) field.get(target);
    }
}
