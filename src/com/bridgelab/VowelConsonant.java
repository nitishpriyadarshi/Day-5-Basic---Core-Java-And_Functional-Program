package com.bridgelab;
import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        int i=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Alphabet: ");
        char ch=sc.next( ).charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
        {
            System.out.println("Alphabet "+ch+" is  Vowel");
        }
        else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
            System.out.println("Alphabet "+ch+" is Consonant");
        else
            System.out.println("Not an Alphabet");
    }
}
