package com.ifelselacture;
import java.util.Scanner;

public class greatestofThreeno {
    public static void main(String[] args){
        Scanner hs = new Scanner(System.in);
        System.out.print("Enter the first number ");
        int a = hs.nextInt();
        System.out.print("Enter the second number ");
        int b = hs.nextInt();
        System.out.print("Enter the third number ");
        int c = hs.nextInt();

        if(a>b && a>c) System.out.println(a);
       else if(b>a && b>c) System.out.println(b);
        else System.out.println(c);

    }
    
}
