package com.san.writenode.dagger.qualifier;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestAB {
    public void changeAB (TestA testA,@HasParm TestB testB) {
        testA.changeA();
        testB.changeB();
    }
}
