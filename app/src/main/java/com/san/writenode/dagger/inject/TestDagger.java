package com.san.writenode.dagger.inject;


import javax.inject.Inject;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestDagger {
    @Inject
    public TestB testB;

    @Inject
    public TestA testA;
    @Inject
    public TestAB testAB;

    public void dagger() {
        TestComponent testComponent = DaggerTestComponent.builder()
                .testModule(new TestModule())
                .build();
        testComponent.inject(this);
        testB.changeB();
        testA.changeA();

        testAB.changeAB(testA,testB);
    }
}
