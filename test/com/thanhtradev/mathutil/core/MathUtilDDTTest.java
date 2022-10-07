package com.thanhtradev.mathutil.core;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value = Parameterized.class)
// class nay chuan bi choi tro tach data ra khoi lenh xanh do cho de kiem soat
// cac test-case
// Thu vien JUnit se tu generate them code phia hau truong, luc bien dich de
// giup thu vien thuc hien hoa y tuong DDT
// Vi du no se tu biet lay data o mang 2 chieu nao do nhoi vao ham
// assertEquals()
// ep ta phai viet theo cach nao do dinh truoc moi chay duoc thu vien do goi la
// FRAMEWORK

public class MathUtilDDTTest {

    // Ta tu tao ra 1 ham, ten tuy y, tra ve mang 2 chieu, chua danh sach ta dinh
    // nhoi vao ham test, FRAMEWORK tu lo, coder khong can lo

    @Parameterized.Parameters // Bo data ne
    public static Object[][] initData() {
        return new Integer[][] {
                { 1, 0 },
                { 1, 1 },
                { 2, 2 },
                { 6, 3 },
                { 24, 4 },
                { 120, 5 },
                { 720, 6 },
        };

    }

    @Parameterized.Parameter(value = 0)
    public long expected; // Bien nay se luu gia tri ky vong khi xai ham getFactorial()

    @Parameterized.Parameter(value = 1)
    public int n; // Bien nay se luu gia tri dua cho ham getFactorial de check

    // ta se map 2 bien nay ung voi 2 cot cua tung dong cua mang o tren
    // Ta phai quy uoc bien expected map vao cot nao minh muon
    // Thu tu cot khong quan trong, vi ta se map tuong uong vao

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {
        Assert.assertEquals(expected, MathUtil.getFactorial(n));
    }

}

/**
 * DDT: Data Driven Testing la 1 ky thuat dung Unit Test, dung de viet code test
 * cac ham, cac class 1 cach de doc hon!!!
 * bang cach tach data kiem thu va cau lenh test ham thanh 2 noi khac nhau
 * vi du, no-DDT:
 * assertEquals(0, getF(0));
 * assertEquals(1, getF(1));
 * assertEquals(2, getF(2));
 * assertEquals(6, getF(3));
 * assertEquals(24, getF(4));
 * assertEquals(120, getF(5));
 * assertEquals(720, getF(16);
 * Cach nay de viet nhung kho kiem tra het cac tap test-case can test, tron lan
 * data dua vao, va cau lenh kiem thu
 * 
 * KY THUAT TACH DATA 00, 11, 22, 63, 24, 1205, 7206
 * de rieng ra 1 cho, sau do nhoi fill/feed nap chung vao lenh goi ham
 * 1 | 0
 * 1 | 1
 * 2 | 2
 * 6 | 3
 * 24 | 4
 * 120 | 5
 * 720 | 6
 * AssertEquals(?, getF(?))
 * giup code trong sang de hieu
 * THAM SO HOA DATA - BIEN DATA RA 1 NOI, DAT CHO CHUNG TEN BIEN LAT HOI NHOI
 * VAO LENH SO SANH
 * THAM SO HOA - BIEN DATA THANH BIEN THAM SO - PARAMETERIZED
 */

/**
 * JUNIT se tu tach mang ra thanh cac test case
 * chay so sanh XANH DO cua tung test case va dua ra ket luan chung
 * XANH THI TAT CA CUNG XANH
 * 
 * CHI CO 1 THANG DO - HAM Y DUNG LA PHAI DUNG HET KHI DC TEST
 * 
 * KHI DO, THI CO 2 TINH HUONG
 * 
 * DO: DO CO SU KHAC NHAU GIUA EXPECTED VA ACTUAL
 * 
 * DO VI EXPECTED != ACTUAL, VAY KHONG BANG VI LY DO GI?
 * 
 * 1. EXPECTED DUNG => CODE SAI => BUG
 * 2. EXPECTED SAI => KHONG KET LUAN DUOC BUG HAY KHONG?
 * 
 */

/**
 * BTVN
 * Hay chon 1 UNIT TEST FRAMEWORK nhom thich
 * JAVA: JUnit, TestNG
 * C#: NUnit, xUnit, MSTest
 * search google "unit test framework for NNLT?"" ra ten thu vien
 * T3 tuan T6 demo, moi nhom 30p
 * Se quay Video
 */