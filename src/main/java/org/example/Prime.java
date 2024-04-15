package org.example;

public class Prime {

    //given number prime or not???
    //prime number = a natural number divisible only by 1 and itself.
    //1, 2, 3, 5, 7, 11, 13, 17, 19 etc

    static boolean primeBruteCheck(int n) {

        if (n <= 1) {
            return false;
        }
        //till n???, i.e. i < n???
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int divCount = 1;

        if (primeBruteCheck(8)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }

    }

}
