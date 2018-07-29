package com.zrr.simpledagger.di.qualifier;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Qualifier;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Qualifies bindings relating to {@link android.os.Build#MODEL}.
 */
@Qualifier
@Retention(RUNTIME)
@Documented
public @interface Model {
}