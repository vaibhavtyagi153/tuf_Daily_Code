package org.example;

public class Palindrome {

    static void palindromeCheck(int n) {
        int x = n;
        int r;
        int rNum = 0;
        while (x != 0) {
            r = x % 10;
            x = x / 10;
            rNum = rNum * 10 + r;
        }
        if (rNum == n) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        //scenario: 200, etc.
        int n = 9293;
        palindromeCheck(n);

    }

}
