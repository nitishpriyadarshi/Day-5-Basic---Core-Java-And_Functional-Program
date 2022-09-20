package com.bridgelab;
import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        System.out.print("Enter Number : ");
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        double result = 0.0;
        if (N != 0) {
            while (N > 0) {
                result = result + (double) 1 / N;
                N--;
            }
            System.out.println("Total Harmonic Series is " + result);
        } else
            System.out.println("Invalid Number");

    }
}
