package com.san.writenode.dagger.inject;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenlinwei on 2018/2/23.
 */
//第一步 添加@Module 注解
@Module
public class TestModule {

    //第二步 使用Provider 注解 实例化对象
    @Provides
    public TestB providerB () {
        return new TestB();
    }

    @Provides
    public TestA providerA () {
        return new TestA();
    }


}
