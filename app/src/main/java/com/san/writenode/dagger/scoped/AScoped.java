package com.san.writenode.dagger.scoped;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;

import javax.inject.Scope;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by chenlinwei on 2018/2/23.<br/>
 *
 * 此注解 分两种应用场景<br/>
 * 提供 module <br/>
 * 1、修饰 Component 类 和 Module Provides 方法
 * 未提供 module <br/>
 * 1、修饰 实体类。
 * @see {javax.inject.Singleton;}
 */
@Scope
@Documented
@Retention(RUNTIME)
public @interface AScoped {

}
