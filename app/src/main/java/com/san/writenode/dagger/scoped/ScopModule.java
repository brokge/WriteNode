package com.san.writenode.dagger.scoped;

import dagger.Module;
import dagger.Provides;

/**
 * Created by chenlinwei on 2018/2/23.
 */

@Module
public class ScopModule {
   // @AScoped
   // @Provides
   // public TestA provideTestA () {
   //     return new TestA();
   // }

    @AScoped
    @Provides
    public TestB provideTestB () {
        return new TestB("aa");
    }
}
