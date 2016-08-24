package com.teslacode.plot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@Retention(value = RetentionPolicy.CLASS)
@Target(ElementType.FIELD)
public @interface PlotBundle {

    /**
     * Specific bundle value will be unpack if true, else not unpack.
     *
     * @return Boolean.
     */
    boolean unpackable() default true;

    /**
     * Specific bundle will be pack if true, else not pack.
     *
     * @return Boolean.
     */
    boolean packable() default true;

    /**
     * Key for bundle, default will be field name.
     *
     * @return String.
     */
    String key() default "";
}
