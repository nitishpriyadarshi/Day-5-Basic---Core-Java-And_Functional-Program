package FunctionalProgram.com.bridgelab;

import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Temperature input
        System.out.print("Enter the Temperature in Fahrenheit between -58°F and 41°F: ");
        float t_A = input.nextFloat();
        //Wind Speed
        System.out.print("Enter the Wind Wpeed (>=2) in Miles Per Hour: ");
        float v_c = input.nextFloat();
        //Formulae
        double twc = 35.74 + 0.6215 * t_A - 35.75 * Math.pow(v_c,0.16) + 0.4275 * t_A * Math.pow(v_c,0.16);
        //Display
        System.out.printf("The WindChill index is: %.3f",twc);
    }
}
