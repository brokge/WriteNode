package com.san.writenode.dagger.scoped;

import javax.inject.Inject;

/**
 * Created by chenlinwei on 2018/2/23.
 */
@AScoped
public class TestA {
    @Inject
    public TestA(){

    }
    public void changeA(){
        System.out.println("change A");
    }
}
