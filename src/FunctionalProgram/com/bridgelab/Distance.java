package FunctionalProgram.com.bridgelab;

import java.util.Scanner;

public class Distance {
    public static void main(String args[]) {

        int x1,x2,y1,y2;

        double dis;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter x1 Point: ");
        x1=sc.nextInt();
        System.out.println("Enter y1 Point:");
        y1=sc.nextInt();
        System.out.println("Enter x2 Point");
        x2=sc.nextInt();
        System.out.println("Enter y2 Point");
        y2=sc.nextInt();
        dis=Distance.calDis(x1,y1,x2,y2);
        System.out.println("Distance :"+"("+x1+","+y1+"),"+"("+x2+","+y2+")==="+dis);
    }static double calDis(int x1,int y1,int x2,int y2)
    {
        return (Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
    }
}
