package com.san.writenode.dagger.named;

import dagger.Component;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@Component(modules = {TestModule.class})
public interface TestComponent {
    //第三步  写一个方法 绑定Activity /Fragment
    void inject (TestDagger testDagger);
}
