package com.ifelselacture;
import java.util.Scanner;

public class TakeLengthBreadth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length");
        double length = sc.nextDouble();

        System.out.println("Enter the breadth");
        double breadth = sc.nextDouble();

        double area = length * breadth;
        double perimeter = 2 * (length + breadth);

        if (area > perimeter) {
            System.out.println("Area is greater than perimeter");
        } else {
            System.out.println("Area is not greater than perimeter");
        }

        sc.close();
    }
}

