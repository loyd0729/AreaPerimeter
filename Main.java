/* This program calculates
* the area and perimeter that
* the user entered.
*/
package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to the Area and Perimeter Calculator");
        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while (choice.equalsIgnoreCase("y")) {
            System.out.println("Enter width");
            double width = Double.parseDouble(sc.nextLine());

            System.out.println("Enter length");
            double length = Double.parseDouble(sc.nextLine());
            double area = width * length;
            double perimeter = 2 * width + 2 * length;

            System.out.print("Enter Width: " + width + "\n");
            System.out.print("Enter Length: " + length + "\n");
            System.out.print("Area: " + area + "\n");
            System.out.print("Perimeter: " + perimeter + "\n");
            System.out.print("Continue? (y/n)");
            choice = sc.nextLine();
        }

        sc.close();
        System.out.println("Thanks for playing!");
    }
}


