package com.bridgelabz;

public class PowerNumber {
    public static void main(String[] arg) {
        int base = 3, exponent = 4;
        long result = 1;

        while (exponent != 0) {
            result *= base;
            --exponent;
        }
        System.out.println("Answer = " + result);
    }
}
