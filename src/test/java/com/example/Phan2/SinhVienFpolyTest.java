package com.example.Phan2;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SinhVienFpolyTest {
    SinhVienFpoly listSV =new SinhVienFpoly();
    @Test
    public void testAdd1(){
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd2(){
        SinhVien sv1 = new SinhVien("12", "Nguyen Van A2", "CT12", "CNTT2", "SV0012");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd3(){
        SinhVien sv1 = new SinhVien("13", "Nguyen Van A3", "CT13", "CNTT3", "SV0013");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd4(){
        SinhVien sv1 = new SinhVien("14", "Nguyen Van A4", "CT14", "CNTT4", "SV0014");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd5(){
        SinhVien sv1 = new SinhVien("15", "Nguyen Van A5", "CT15", "CNTT5", "SV0015");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd6(){
        SinhVien sv1 = new SinhVien("16", "Nguyen Van A6", "CT16", "CNTT6", "SV0016");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd7(){
        SinhVien sv1 = new SinhVien("17", "Nguyen Van A7", "CT17", "CNTT7", "SV0017");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd8(){
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT_5", "SV001");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd9(){
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A00", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testAdd10(){
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT00", "SV00100");
        listSV.add(sv1);
        assertEquals(1,listSV.getAll().size());
    }

    @Test
    public void testTimKiemTheoMaSV1() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV001");
        assertNotNull(result);
        assertEquals("SV001", result.getMaSV());
    }

    @Test
    public void testTimKiemTheoMaSV2() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV002");
        assertNotNull(result);
        assertEquals("SV002", result.getMaSV());
    }

    @Test
    public void testTimKiemTheoMaSV3() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("");
        assertNotNull(result);
        assertEquals("", result.getMaSV());
    }
    @Test
    public void testTimKiemTheoMaSV4() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV(null);
        assertNotNull(result);
        assertEquals(null, result.getMaSV());
    }
    @Test
    public void testTimKiemTheoMaSV5() {
        SinhVien sv1 = new SinhVien("1", "Nguyen Van A", "CT1", "CNTT", "SV001");
        listSV.add(sv1);
        SinhVien result = listSV.timKiemTheoMaSV("SV999");
        assertNull(result);
    }

}