package com.ifelselacture;
import java.util.Scanner;

public class absolutevalue {
    public static void main(String[] args){
        Scanner Harshit = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = Harshit.nextInt();
        // if(num >= 0){
        //     System.out.println("absolute value of number is " + num); 
        // }
        // else{
        //     System.out.println("not absolute value");

        // }
        if(num < 0) num = -num;
       // System.out.println(num);
       System.out.println(-num)

        

        
    }
    
} 
