package com.basiclacture;
import java.util.Scanner;

public class areaofcircleinput {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in); //taking inpit 
        

        System.out.print("Enter the radius of circle");
        double r = sc.nextDouble();
        double a = 3.141592 *r*r;
        System.out.print("Area is:" );
        System.out.print(a);



    }
    
}
