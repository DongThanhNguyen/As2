package com.example.Phan1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TinhTongTest {
    @Test
    public void test() {
        assertEquals(0,TinhTong.tinhTong(0,0));
        assertEquals(5,TinhTong.tinhTong(0,5));
        assertEquals(5,TinhTong.tinhTong(5,0));
        assertEquals(-10,TinhTong.tinhTong(0,-10));
        assertEquals(-10,TinhTong.tinhTong(-10,0));
        assertEquals(0,TinhTong.tinhTong(5,-5));
        assertEquals(2000,TinhTong.tinhTong(1000,1000));
        assertEquals(-2000,TinhTong.tinhTong(-1000,-1000));
        assertEquals(0,TinhTong.tinhTong(1000,-1000));
    }
    @Test
    public void testFalse(){
        assertEquals(0,TinhTong.tinhTong(-1.5,0));
    }
}