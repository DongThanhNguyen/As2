package com.example.Phan1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TinhTichTest {
    @Test
    public void test(){
        assertEquals(6, TinhTich.tinhTich(3, 2));
        assertEquals(-6, TinhTich.tinhTich(-3, 2));
        assertEquals(25, TinhTich.tinhTich(5, 5));
        assertEquals(0, TinhTich.tinhTich(0, 50));
        assertEquals(900, TinhTich.tinhTich(30, 30));
        //assertEquals(0, TinhTich.tinhTich(30.5, 30));
        assertEquals(0, TinhTich.tinhTich(3, 0));
        assertEquals(6, TinhTich.tinhTich(-3, -2));
        assertEquals(10000, TinhTich.tinhTich(100, 100));
        assertEquals(10000, TinhTich.tinhTich(-100, -100));

    }
}