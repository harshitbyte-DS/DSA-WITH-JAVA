package com.basiclacture;

public class Chartypecasting {
    public static void main(String[]args){

    

    // typecasting is a proces of converting one data type into another data type.
    char ch = 'A';
    int x = ch; // implicit typecasting
    System.out.println(x);
    char harshit = 'a';
    int y = (int)harshit; // implicit typecasting
    System.out.println(y);
    char harsh = '3';
    System.out.println((int)harsh); // implicit typecasting
    char raj = 'b';
    System.out.println(raj+0); // implicit typecasting

    char rajbhai = 'b';
    System.out.println(rajbhai+rajbhai); // implicit typecasting

    char utkarsh = 'b';
    System.out.println(utkarsh*utkarsh); // implicit typecasting

    // integer to character typecasting
    int a = 65;
    char b = (char)a; 
    System.out.println(b); // explicit typecasting

    //int c = 37;
  //  int c = 39;
    //int c = 43;
    int c = 32;
    char d = (char)c;
    System.out.println(d); // explicit typecasting


    


    }


    
}
