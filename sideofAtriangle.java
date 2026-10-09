package com.ifelselacture;
import java.util.Scanner;
public class sideofAtriangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st side ");
        int a = sc.nextInt();
        System.out.println("Enter the 2nd side");
        int b = sc.nextInt();
        System.out.println("Enter the 3rd side");
        int c = sc.nextInt();

        //if(a+b>c){
        if(a+b>c && c+a>b && b+c>a){
            System.out.println("valid triangle");
        }
        else{
            System.out.println("invalid triangle");
        }


    }
    
}
