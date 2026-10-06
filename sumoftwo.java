package com.basiclacture;
import java.util.Scanner;

public class sumoftwo {
    public static void main(String[] args){
       Scanner harshit = new Scanner (System.in);



        System.out.print("Enter the first numbers");
       int a = harshit.nextInt(); //taking input from user
       System.out.print("Enter the second numbers");
       int b = harshit.nextInt(); //taking input from user

       System.out.print("Enter the third numbers");
       int c = harshit.nextInt(); // taking input from user
      

       System.out.println(a+b+c);// print sum of the two numbers

         harshit.close();
      


    }
    
}
