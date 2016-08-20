package com.teslacode.plot.binder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by HappyFresh on 8/20/16.
 */
public class PlotTypeBinder {

    public static Map<Class<?>, TypeBinder> mMapTypeBinder = new HashMap<>();

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
    }
}
