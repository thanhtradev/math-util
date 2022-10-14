/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.thanhtradev.mathutil.core;

/**
 *
 * @author thanhtra
 */
public class MathUtil {

    /**
     * This function calculate n! = 1.2.3.4...n
     * Rule: 0! = 1! =1
     * n from 0 to 21, 21! over 18 number
     * 
     * @param n
     * @return the result of n!
     */

    // Viet ham tinh de quy theo phong cach de quy
    // n! = n * (n-1)!

    public static long getFactorial(int n) {
        if (n < 0 || n > 21) {
            throw new IllegalArgumentException("n must be between 0..21");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * getFactorial(n - 1);
    }

    // public static long getFactorial(int n) {

    // if (n < 0 || n > 20)
    // throw new IllegalArgumentException("Invalid number. n must be between
    // 0..20");

    // if (n == 0 || n == 1)
    // return 1;

    // long product = 1; // bien tich luy acc/accumulation
    // for (int i = 2; i <= n; i++)
    // product *= i;

    // return product;
    // }

    /*
     * Test-case:
     * Case #1: n = 0; getFactorial(0) -> Expected value == 1
     * Case #2: n = 1; getFactorial(1) -> Expected value == 1
     * Case #3: n = 5; getFactorial(5) -> Expected value == 120
     * Case #4: n = -5; getFactorial(-5) -> Expected value: Error
     * Case #5: n = 21; getFactorial(21) -> Expected value: Error
     */

}
