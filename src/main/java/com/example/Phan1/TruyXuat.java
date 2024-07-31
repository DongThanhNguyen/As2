package com.example.Phan1;

public class TruyXuat {
    public static int getElementAtIndex(int []array ,int index) {
        if (array == null){
            throw new IllegalArgumentException("Array Null");
        }
        if(index > array.length || index< 0 ){
            throw new IllegalArgumentException("Nhập đúng vị trí");
        }
        return array[index];
    }
}
