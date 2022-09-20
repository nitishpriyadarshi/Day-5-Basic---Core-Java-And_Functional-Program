package com.bridgelab;
import java.util.Scanner;

public class FlipCoin {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Coin Flip Time :");
        int totalFlip=scan.nextInt();
        int headFlip=0;
        int tailFlip=0;
        if (totalFlip>0) {
            for (int i=1; i<=totalFlip;i++) {
                double flip=Math.floor(Math.random()*10)%2;
                if (flip<0.5) {
                    headFlip++;

                }
                else {
                    tailFlip++;
                }
            }

        }
        else {
            System.out.println("Invalied Value");
            System.exit(0);
        }
        double headPercent=(headFlip*100)/totalFlip;
        double tailPercent=(tailFlip*100)/totalFlip;
        System.out.println("Head percentage : "+headPercent);
        System.out.println("Tail  percentage: "+tailPercent);
    }

}
