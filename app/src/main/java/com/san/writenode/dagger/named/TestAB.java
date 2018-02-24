package com.san.writenode.dagger.named;


import javax.inject.Named;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestAB {
    public void changeAB (TestA testA, @Named("has") TestB testB) {
        testA.changeA();
        testB.changeB();
    }
}
