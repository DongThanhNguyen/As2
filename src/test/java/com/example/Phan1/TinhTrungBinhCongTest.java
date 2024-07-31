package com.example.Phan1;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TinhTrungBinhCongTest {
    @Test
    public void test1(){
        int n []={0};
        double expected = 0;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test2(){
        int n []={42};
        double expected = 42;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test3(){
        int n []={2,2};
        double expected = 2;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test4(){
        int n []={2,-2};
        double expected = 0;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test5(){
        int n []={1,2,3,4,5,6,7,8,9};
        double expected = 5;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test6(){
        int n []={1,2,3,4,5,6,7,8,9,10};
        double expected = 5.5;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test7(){
        int n []={-5,-5,-5};
        double expected = -5;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test8(){
        int n []={0};
        double expected = 0;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test9(){
        int n []={};
        double expected = 0;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }

    @Test
    public void test10(){
        int n []={0};
        double expected = 0;
        double actual = TinhTrungBinhCong.tinhTrungBinhCong(n);
        Assert.assertEquals(expected,actual,0.01);
    }
}