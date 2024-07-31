package com.example.Phan1;

public class TinhTrungBinhCong {
    public static double tinhTrungBinhCong(int[] n){
        if(n==null || n.length==0){
            throw new IllegalArgumentException("Không thể chia cho 0 - dãy trống");
        }
        double sum =0;
        for (int i:n){
            sum+=i;
        }
        return (double) sum/n.length;
    }
}
