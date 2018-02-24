package com.san.writenode.dagger.inject;

import javax.inject.Inject;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestAB {
    @Inject
    public TestAB(){

    }
    public void changeAB (TestA testA,  TestB testB) {
        testA.changeA();
        testB.changeB();
    }
}
