package com.teslacode.plot.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by HappyFresh on 8/19/16.
 */
@Documented
@Retention(value = RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface PlotBundle {

    boolean imported() default true;

    boolean exported() default true;

    String key() default "";
}
