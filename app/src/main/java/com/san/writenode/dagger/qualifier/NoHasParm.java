package com.san.writenode.dagger.qualifier;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Qualifier;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface NoHasParm {
}
