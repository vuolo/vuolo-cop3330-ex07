/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // prompt for room length
        System.out.print("What is the length of the room in feet? ");

        // create new scanner
        Scanner input = new Scanner(System.in);

        // read length
        int length = Integer.parseInt(input.nextLine());

        // prompt for width
        System.out.print("What is the width of the room in feet? ");

        // read width
        int width = Integer.parseInt(input.nextLine());

        // output length and width
        System.out.println("You entered dimensions of " + length + " feet by " + width + " feet.");

        // calculate area
        int area_feet = length * width;
        double area_meters = area_feet * 0.09290304;

        // output results
        System.out.print("The area is" + "\n" + area_feet + " square feet" + "\n" + String.format("%.3f", area_meters) + " square meters");
    }
}
