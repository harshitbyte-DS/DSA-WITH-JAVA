package com.ifelselacture;
import java.util.Scanner;

public class integermagnitude {
    public static void main(String[] agrs){
        Scanner har = new Scanner(System.in);
        System.out.println("Enter the magnitude");
        int X = har.nextInt();
        if(Math.abs(X)<69){
            System.out.println(true);
        }
        else{
         System.out.println(false);
        }
        

    }
    
}
