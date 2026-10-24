package com.ifelselacture;
import java.util.Scanner;

public class tarnaryinvariable {
    public static void main(String[] args){
        Scanner hs = new Scanner(System.in);
        System.out.print("Enter Number : ");
        int n = hs.nextInt();


        // int harshit; // this is a variable.
        // if(n>=0) harshit = 100;
        // else harshit = 0;
        int harshit = (n>=0) ? 100 : 0; // this is a tarnary operator.
 System.out.println(harshit);
        

    }
    
}
