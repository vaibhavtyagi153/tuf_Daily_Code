package org.example;

public class GCD_HCF {

    //hcf = highest common factor
    //gcd = greatest common divisor

    //brute force

    public static void main(String[] args) {

        int hcf = 1;

        int n1 = 430;
        int n2 = 0;

        for (int i = 1; i <= Math.min(n1, n2); i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                hcf = i;

            }
        }

        System.out.println("The hcf is : " + hcf);

    }

}