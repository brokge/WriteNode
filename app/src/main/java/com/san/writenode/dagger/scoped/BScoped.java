package com.san.writenode.dagger.scoped;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@Scope
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface BScoped {
}
