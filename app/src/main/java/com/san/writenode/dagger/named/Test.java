package com.san.writenode.dagger.named;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class Test {

    //@named 是 @qualifier 的一种
    //@Qualifier是限定符，而@Named则是基于String的限定符。
    public static void main (String args[]) {
        TestDagger testDagger = new TestDagger();
        testDagger.dagger();
    }
}
