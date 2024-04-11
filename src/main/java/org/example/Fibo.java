package org.example;

public class Fibo {

    //fibonacci series, 1, 2, 3, 5, 8, 13, 21, 34, .....
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int s = 0;
        int n = 2;
        while(n <= 7) {
            s = a + b;
            a = b;
            b = s;
            n++;
            System.out.println(s);
        }
    }

}
