package FunctionalProgram.com.bridgelab;

import java.util.Scanner;

public class Quadratic {
    public static void main(String[] Strings) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of A: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of B: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of C: ");
        double c = input.nextDouble();
        double d = b * b - 4 * a * c;
        if (d > 0.0) {
            double x1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double x2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("The roots are " + x1 + " and " + x2);
        } else if (d == 0.0) {
            double x1 = -b / (2.0 * a);
            System.out.println("The root is " + x1);
        } else {
            System.out.println("Roots are not Real.");
        }
    }
}
