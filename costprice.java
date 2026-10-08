package com.ifelselacture;
import java.util.Scanner;

public class costprice {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println( "Enter the  cost price" );
        int cp = sc.nextInt();
        System.out.println("Enter the selling price");
        int sp = sc.nextInt();
        // if(sp>cp){
        //     System.out.println("profit" +(sp - cp));}
        // if(cp>sp){
        // System.out.println("loss" +(cp - sp));}
        // else{
        // System.out.println("no loss no profit");
        // }
        // sc.close();
        
       // else{
            //System.out.println("loss");
        
if(sp>cp) System.out.println("profit is "+(sp - cp));



else if(cp > sp) System.out.println("loss is "+(cp - sp));
else System.out.println("no profit no loss");


    }

    
}
