package com.example.Phan1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TinhHieuTest {
    @Test
    public void test1() {
        assertEquals(5,TinhHieu.tinhHieu(10,5));
    }

    @Test
    public void test2() {
        assertEquals(15,TinhHieu.tinhHieu(10,-5));
    }

    @Test
    public void test3() {
        assertEquals(-5,TinhHieu.tinhHieu(-10,-5));
    }

    @Test
    public void test4() {
        assertEquals(99995,TinhHieu.tinhHieu(100000,5));
    }

    @Test
    public void test5() {
        assertEquals(0,TinhHieu.tinhHieu(1000000,1000000));
    }

    @Test
    public void test6() {
        assertEquals(-20000,TinhHieu.tinhHieu(-10000,10000));
    }

    @Test
    public void test7() {
        assertEquals(9.5,TinhHieu.tinhHieu(10.5,5));
    }

    @Test
    public void test8() {
        assertEquals(0,TinhHieu.tinhHieu(0,0));
    }

    @Test
    public void test9() {
        assertEquals(-5,TinhHieu.tinhHieu(0,5));
    }

    @Test
    public void test10() {
        assertEquals(-1000,TinhHieu.tinhHieu(5000,6000));
    }
}