package com.san.writenode.dagger.qualifier;

import javax.inject.Inject;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestDagger {
    @Inject
    @HasParm
    public TestB testB;
    @Inject
    @NoHasParm
    public TestB testB_N;

    @Inject
    public TestA testA;
    @Inject
    public TestAB testAB;

    public void dagger() {
        TestComponent testComponent = DaggerTestComponent.builder()
                .testModule(new TestModule())
                .build();
        testComponent.inject(this);
        testB_N.changeB();
        testA.changeA();
        testAB.changeAB(testA,testB);
    }
}
