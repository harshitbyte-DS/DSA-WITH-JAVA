package com.ifelselacture;
import java.util.Scanner;

public class greaterThreenumber {
    public static void main(String[] args){
    Scanner hs = new Scanner(System.in);
    System .out.println("Enter the 1st no");
    int a = hs.nextInt();
    System.out.println("Enter the 2nd no");
    int b = hs.nextInt();
    System.out.println("Enter the 3rd no");
    int c = hs.nextInt();

    if(a>=b){
        if(a>c) System.out.println(a);
        else // c > a
            System.out.println(c);

    }

else{ //b > a
    if(b>=c) System.out.println(b);
    else // c > a  
        System.out.println(c);
    
}
    }
    
}
