package com.example.Phan1;

public class TinhTong {
    public static int tinhTong(double a, double b){
    if(a%1!=0||b%1!=0){
        throw new IllegalArgumentException("Phải nhập số nguyên");
    }
    return (int) a + (int) b;
    }
}
