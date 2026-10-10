package com.ifelselacture;
import java.util.Scanner;

public class positiveinteger {
    public static void main(String[] agrs){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        if(x%5==0 && x%3==0){
            System.out.println("riya");
        }
        else if (x%5 != 0 && x%3 != 0){
            System.out.println("harshit");
        }
            //else if(x%3==0) {
           // System.out.println("harshit");
           // }
            else if(x%5==0){
                System.out.println("aparna");
            
            }
            else{
                System.out.println("pawan");
                sc.close();




                

            

            
        }

    }
    
}
