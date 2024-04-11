package org.example;

public class CountDigits {

    //count number of digits in an integer:
    static int count_digit_int(int n) {

        int x = n;
        int counter = 0;

        for (int i = 10; x > 0; counter++) {
            x = x / 10;
        }
        return counter;
    }

    static int count_digit_string(int n) {
        String x = String.valueOf(n);
        //String x = Integer.toString(n);
        System.out.println("The vale of x : " + x);

        return x.length();
    }

    //write another method: 3rd way of doing: using logarithms
    static int count_digit_log(int n) {
        int digit = (int) Math.floor(Math.log10(n) + 1);
        return digit;
    }

    public static void main(String[] args) {
        int n = 3131;
        //System.out.println("The number of digits in " + n + " is : " + count_digit_int(n));
        //System.out.println("The number of digits in " + n + " is : " + count_digit_string(n));
        System.out.println("The number of digits in " + n + " is : " + count_digit_log(n));


    }

}
