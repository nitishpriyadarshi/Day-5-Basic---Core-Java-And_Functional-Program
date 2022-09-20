package com.bridgelab;
import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First numbers: ");
        System.out.println("Enter Second Number: ");
        System.out.println("Enter Third Number: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest number = " + a);
        }
        if (b >= a && b >= c) {
            System.out.println("Largest number = " + b);
        }
        if (c >= a && c >= b) {
            System.out.println("Largest number = " + c);
        }
    }

}
