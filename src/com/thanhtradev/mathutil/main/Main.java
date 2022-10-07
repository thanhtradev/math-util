/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.thanhtradev.mathutil.main;

import com.thanhtradev.mathutil.core.MathUtil;

/**
 *
 * @author thanhtra
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Test case #1: n = 0 -> expected getF(0) = 1;
        long expected = 1;
        long actual = MathUtil.getFactorial(0);
        System.out.println("0! expected = " + expected + "| actual = " + actual);

        // Test case #2: n = 1 -> expected getF(1) = 1;
        System.out.println("1! expected = 1" + "| actual = " + MathUtil.getFactorial(1));

        // Test case #3: n = 5 -> expected getF(1) = 120;
        System.out.println("5! expected = 120" + "| actual = " + MathUtil.getFactorial(5));

        // Test case #4: n = -5 -> expected getF(-5) = Exception;
        // System.out.println("-5! expected = chui" + "| actual = ");
        // MathUtil.getFactorial(-5);

        // // Test case #5: n = 21 -> expected getF(21) = Exception;
        // System.out.println("21! expected = chui" + "| actual = " +
        // MathUtil.getFactorial(21));

    }

}
