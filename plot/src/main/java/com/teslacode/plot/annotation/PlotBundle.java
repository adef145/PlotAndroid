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

    /** bundle will be imported if true, else not imported */
    boolean imported() default true;

    /** bundle will be exported if true, else not exported */
    boolean exported() default true;

    /** key for bundle, default will be field name */
    String key() default "";
}
