package com.thanhtradev.mathutil.core;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author thanhtra
 */

public class MathUtilTest {

    /**
     * Test thu ham so sanh expected va actual, may tu so sanh, khong nhin bang mat
     * de tu so sanh nhu ben main()
     * Ma fw JUnit tu generate ra code so sanh gia tri, tu dung bang mau Xanh Do
     * mang y nghia, PASSED || FAILED
     */
    @Test
    public void tryAssert() {
        Assert.assertEquals(100, 100);
    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell() {

        // Test case #1: n = 0 -> expected getF(0) = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        Assert.assertEquals(expected, actual);

        // Test case #2: n = 1 -> expected getF(1) = 1;
        Assert.assertEquals(1, MathUtil.getFactorial(1));

        // Test case #3: n = 2 -> expected getF(2) = 2;
        Assert.assertEquals(2, MathUtil.getFactorial(2));

    }

    @Test
    public void testFactorialGivenRightArgumentReturnsWell2() {

        // Test case #4: n = 3 -> expected getF(3) = 6;
        Assert.assertEquals(6, MathUtil.getFactorial(3));

        // Test case #3: n = 4 -> expected getF(4) = 24;
        Assert.assertEquals(24, MathUtil.getFactorial(4));

    }

    // Kiem thu ngoai le khi dua data ca chon

    // n<0, khong tinh gia thua am
    // n>20, khong tinh gia thua tran kieu long
    // Ham duoc thiet ke: nem ra ngoai le ten le IllegalArgumentException
    // Thay vi nhan gia tri long, ban nhan ve 1 cau chui
    // Ta do luong co cau chui xuat hien khong khi n = -5, 21

    // Neu -5 ma nem ra ngoai le, ta phai dung IllegalArgumentException
    // nghia la ham chay on, dung nhu thiet ke, nhu ky vong
    // Vay nghia la ham passed

    @Test(expected = Exception.class)
    public void testFactorialGivenWrongArgumentThrowsException() {

        // Test case #5: n = -5 -> expected getF(-5) = Exception
        // (IllegalArgumentException);

        MathUtil.getFactorial(-5);
    }

}

/**
 * @Test: bieu thuc rang buoc cho ham dung de test code, bao voi JUnit va JVM de
 *        generate tryAssert() thanh main() truyen thong
 *        va gui cho JVM de chay. App chay tu main()
 *        thieu @Test tuong duong app thieu main() no-runable
 */
