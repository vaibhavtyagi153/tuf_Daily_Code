package org.example;

import java.util.ArrayList;


public class Armstrong {


    public static void main(String[] args) {
        int n = 1634;
        int copy = n;

        int counter = 0;
        ArrayList<Integer> digit = new ArrayList<Integer>();

        for (int i = 10; n != 0; counter++) {
            int r = n % 10;
            digit.add(r);
            n = n / 10;

        }


        int sum = 0;
        int digiPower = 1;
        for (int x : digit ) {
            for (int i = 1; i <= counter; i++) {
                digiPower = digiPower * x;
            }

            sum = sum + digiPower;
            digiPower = 1;
        }


        if (sum == copy) {
            System.out.println("armstrong");
        } else {
            System.out.println("not armstrong");
        }
    }

}