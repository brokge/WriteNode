package com.san.writenode.dagger.scoped;

import javax.inject.Inject;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class ScopDagger {

    @Inject
    TestA testA;
    @Inject
    TestA testA1;

    @Inject
    TestB testB;
    @Inject
    TestB testB1;

    public void dagger () {
        ScopComponent scopComponent = DaggerScopComponent.builder()
                .scopModule(new ScopModule())
                .build();
        scopComponent.inject(this);
        System.out.println("TestA hash code:" + testA.hashCode());
        System.out.println("TestA1 hash code:" + testA1.hashCode());
        System.out.println("TestB hash code:" + testB.hashCode());
        System.out.println("TestB1 hash code:" + testB1.hashCode());

        //testA.changeA();
        //testB.changeB();

        //验证单例只在 所属 的Component 声明周期内。
        ScopBComponent scopBComponent = DaggerScopBComponent.builder()
                .scopModule(new ScopModule())
                .build();
        scopBComponent.inject(this);
        System.out.println("TestA hash code:" + testA.hashCode());
        System.out.println("TestA1 hash code:" + testA1.hashCode());
        System.out.println("TestB hash code:" + testB.hashCode());
        System.out.println("TestB1 hash code:" + testB1.hashCode());
    }
}
