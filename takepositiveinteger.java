package com.ifelselacture;
import java.util.Scanner;

public class takepositiveinteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the positive integer");
        int X = sc.nextInt();
        if(X%5==0 || X%3==0){
            System.out.println("divisible by 3 or 5 ");// it is  divisible by 3 or 5 .
        }
        else{
            System.out.println("not divisible by 5 or 3");
            
        }
    }
    
}
