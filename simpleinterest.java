package com.basiclacture;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount: ");
        double p = sc.nextInt();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextInt();
        System.out.print("Enter the time period: ");
        double t = sc.nextInt();

        double si = (p*r*t)/100;
        System.out.print(si);
        sc.close();
   
   
   
   
   
    }




        

       
}
