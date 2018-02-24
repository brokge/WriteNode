package com.san.writenode.dagger.named;

/**
 * Created by chenlinwei on 2018/2/23.
 */

public class TestB {

    private String value = "";

    public TestB (String value) {
        this.value = value;
    }

    public TestB () {

    }

    public void changeB () {
        if(value==null||value.equals("")) {
            System.out.println("changeB");
        } else {
            System.out.println("changeB:" + value);
        }
    }

}
