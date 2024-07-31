package com.example.Phan1;

import junit.framework.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TruyXuatTest {
    @Test
    public void test1() {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(1,TruyXuat.getElementAtIndex(array,0));
    }

    @Test
    public void test2() {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(9,TruyXuat.getElementAtIndex(array,8));
    }

    @Test
    public void test3() {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(1,TruyXuat.getElementAtIndex(array,-1));
    }

    @Test
    public void test4() {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(2,TruyXuat.getElementAtIndex(array,1));
    }

    @Test
    public void test5() {
        int [] array = {1,2,3,4,5,6,7,8,9};
        Assert.assertEquals(6,TruyXuat.getElementAtIndex(array,5));
    }

    @Test
    public void test6() {
        int [] array = {1,2};
        Assert.assertEquals(6,TruyXuat.getElementAtIndex(array,0));
    }

    @Test
    public void test7() {
        int [] array = {};
        Assert.assertEquals(6,TruyXuat.getElementAtIndex(null,5));
    }

    @Test
    public void test8() {
        int [] array = {-5,0,5};
        Assert.assertEquals(0,TruyXuat.getElementAtIndex(null,1));
    }

    @Test
    public void test9() {
        int [] array = {-5,0,5};
        Assert.assertEquals(-5,TruyXuat.getElementAtIndex(null,0));
    }

    @Test
    public void test10() {
        int [] array = {-5,0,5};
        Assert.assertEquals(5,TruyXuat.getElementAtIndex(null,2));
    }
}