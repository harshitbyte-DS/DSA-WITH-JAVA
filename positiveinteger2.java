package com.ifelselacture;
import java.util.Scanner;
public class positiveinteger2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nomber");
        int h = sc.nextInt();
        if(h%5 == 0 && h%3 != 0){
            System.out.println("harshit");

        }
        else if(h%3 == 0 && h%5 != 0){
            System.out.println("mom");
            
        }
        else if(h%3 != 0 && h%5 != 0){
            System.out.println("utkarsh");
        }
        else if (h%5 == 0 && h%3 ==0){
            System.out.println("love both");

        }
    }
    
}
