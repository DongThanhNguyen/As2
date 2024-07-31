package com.example.Phan2;

import java.util.ArrayList;
import java.util.List;

public class SinhVienFpoly {
    List<SinhVien> listSV;
    public SinhVienFpoly() {
        listSV = new ArrayList<SinhVien>();
    }
    public List<SinhVien> getAll(){
        return listSV;
    }
    public void add(SinhVien sv){
        if(!sv.getTenLop().matches("^[a-zA-Z0-9]+$")){
            throw new IllegalArgumentException("Tên không chưa kí tự đặc biệt");
        }
        listSV.add(sv);
        System.out.println("Thêm Thành Công");
    }

    public SinhVien timKiemTheoMaSV(String maSV) {
        if (maSV == null || maSV.isEmpty()) {
            throw new IllegalArgumentException("Mã sinh viên không được null hoặc rỗng");
        }
        for (SinhVien sv : listSV) {
            if (sv.getMaSV().equals(maSV)) {
                return sv;
            }
        }
        return null;
    }
}
