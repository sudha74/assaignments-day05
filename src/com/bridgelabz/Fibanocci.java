package com.bridgelabz;

public class Fibanocci {
    public static void main(String[] args) {
        int n = 10, firstTerm = 0, secondTerm = 1;

        for (int i = 1; i <= n; ++i) {
            System.out.println(firstTerm);

            // compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }

    }
}