package FunctionalProgram.com.bridgelab;
import java.util.Scanner;

public class TwoDarray {
    public static void main(String[] args) {

        int m, n, i, j;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Number of Rows: ");
        m = scan.nextInt();
        System.out.print("Enter Number of Columns: ");
        n = scan.nextInt();
        int array[][] = new int[m][n];
        System.out.println("Enter The Value of Array: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                array[i][j] = scan.nextInt();
            }
        }
        System.out.println("Two D Array is: ");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

}
