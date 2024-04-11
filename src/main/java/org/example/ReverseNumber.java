package org.example;


public class ReverseNumber {

    static int reverseInt(int a) {

        int n = a;
        int r;
        int rev_n = 0;
        while (n != 0) {
            r = n % 10;
            n = n / 10;
            rev_n = rev_n * 10 + r;
        }
        return rev_n;
    }



    public static void main(String[] args) {
        //scenario: when first digit is non zero and rest are zero
        int input = 2;
        int k = reverseInt(input);
        System.out.println("The value of rev int : " + k);
    }

}
