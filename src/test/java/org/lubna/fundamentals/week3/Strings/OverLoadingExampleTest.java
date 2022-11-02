package org.lubna.fundamentals.week3.Strings;

import org.junit.Assert;
import org.junit.Test;

public class OverLoadingExampleTest {
    final int num1 = 12;
    final int num2 = 15;
    final double d1 = 23.6;
    final double d2 = 12.24;

    @Test
    public void test_add() {
        int expectedNumber = 27;
        int actualNumber = OverLoadingExample.add(num1 , num2);
        Assert.assertEquals(expectedNumber , actualNumber);
    }

    public void test_double_add() {
        double expectedNumber = 35.84;
        double actualNumber = OverLoadingExample.add(d1 , d2);
        Assert.assertEquals(expectedNumber , actualNumber);
    }


}
