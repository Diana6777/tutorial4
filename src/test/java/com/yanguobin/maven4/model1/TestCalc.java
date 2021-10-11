package com.yanguobin.maven4.model1;

import org.junit.Assert;
import org.junit.Test;

public class TestCalc {
    @Test
    public void addTest(){
        Calc c = new Calc();
        int add = c.add(1, 2);
//        System.out.println(add);
        Assert.assertEquals(3,add);
    }

    @Test
    public void subtractTest(){
        Calc c = new Calc();
        int subtract = c.subtract(3, 2);
//        System.out.println(add);
        Assert.assertEquals(1,subtract);
    }

}
