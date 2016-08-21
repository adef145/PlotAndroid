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
     * Bundle will be imported if true, else not imported.
     *
     * @return Boolean.
     */
    boolean imported() default true;

    /**
     * Bundle will be exported if true, else not exported.
     *
     * @return Boolean.
     */
    boolean exported() default true;

    /**
     * Key for bundle, default will be field name.
     *
     * @return String.
     */
    String key() default "";
}
