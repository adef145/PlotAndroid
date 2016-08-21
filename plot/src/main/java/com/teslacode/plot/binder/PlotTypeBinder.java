package com.teslacode.plot.binder;

import android.os.Parcelable;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class PlotTypeBinder {

    private static Map<Class<?>, TypeBinder> mMapTypeBinder = new HashMap<>();

    static {
        mMapTypeBinder.put(Integer.class, new IntegerBinder());
        mMapTypeBinder.put(int.class, new IntegerBinder());
        mMapTypeBinder.put(Float.class, new FloatBinder());
        mMapTypeBinder.put(float.class, new FloatBinder());
        mMapTypeBinder.put(Double.class, new DoubleBinder());
        mMapTypeBinder.put(double.class, new DoubleBinder());
        mMapTypeBinder.put(Character.class, new CharBinder());
        mMapTypeBinder.put(char.class, new CharBinder());
        mMapTypeBinder.put(Byte.class, new ByteBinder());
        mMapTypeBinder.put(byte.class, new ByteBinder());
        mMapTypeBinder.put(Boolean.class, new BooleanBinder());
        mMapTypeBinder.put(boolean.class, new BooleanBinder());
        mMapTypeBinder.put(String.class, new StringBinder());
        mMapTypeBinder.put(Parcelable.class, new ParcelableBinder());
        mMapTypeBinder.put(Serializable.class, new SerializableBinder());
        mMapTypeBinder.put(int[].class, new IntegerArrayBinder());
        mMapTypeBinder.put(new ArrayList<Integer>().getClass(), new IntegerArrayListBinder());
        mMapTypeBinder.put(float[].class, new FloatArrayBinder());
        mMapTypeBinder.put(double[].class, new DoubleArrayBinder());
        mMapTypeBinder.put(char[].class, new CharArrayBinder());
        mMapTypeBinder.put(byte[].class, new ByteArrayBinder());
        mMapTypeBinder.put(boolean[].class, new BooleanBinder());
        mMapTypeBinder.put(String[].class, new StringArrayBinder());
        mMapTypeBinder.put(new ArrayList<String>().getClass(), new StringArrayListBinder());
        mMapTypeBinder.put(Parcelable[].class, new ParcelableArrayBinder());
        mMapTypeBinder.put(new ArrayList<Parcelable>().getClass(), new ParcelableArrayListBinder());
    }

    public static Map<Class<?>, TypeBinder> getMapTypeBinder() {
        return mMapTypeBinder;
    }

    public static TypeBinder getTypeBinder(Field field) {
        Type type = validateType(field);
        return PlotTypeBinder.getMapTypeBinder().get(type);
    }

    private static Type validateType(Field field) {
        Type type = field.getType();
        if (PlotTypeBinder.getMapTypeBinder().containsKey(type)) {
            return type;
        }
        return validateOtherType(field);
    }

    private static Type validateOtherType(Field field) {
        Type type = field.getType();

        if (Parcelable.class.isAssignableFrom(field.getType())) {
            type = Parcelable.class;
        } else if (Serializable.class.isAssignableFrom(field.getType())) {
            type = Serializable.class;
        } else if (int[].class.isAssignableFrom(field.getType())) {
            type = int[].class;
        } else if (float[].class.isAssignableFrom(field.getType())) {
            type = float[].class;
        } else if (double[].class.isAssignableFrom(field.getType())) {
            type = double[].class;
        } else if (char[].class.isAssignableFrom(field.getType())) {
            type = char[].class;
        } else if (byte[].class.isAssignableFrom(field.getType())) {
            type = byte[].class;
        } else if (boolean[].class.isAssignableFrom(field.getType())) {
            type = boolean[].class;
        } else if (String[].class.isAssignableFrom(field.getType())) {
            type = String[].class;
        } else if (Parcelable[].class.isAssignableFrom(field.getType())) {
            type = Parcelable[].class;
        }

        return type;
    }
}
