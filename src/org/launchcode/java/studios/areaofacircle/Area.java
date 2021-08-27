package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {


    public static void main(String[] args) {
        double area;
        double radius;
        double pi = 3.14;

        Scanner input;

        input = new Scanner(System.in);
        System.out.println("Enter a Radius: ");
        radius = input.nextDouble();
        input.close();


        if (radius >= 0) {
            area =  Circle.getArea(radius);
            System.out.println("The area of a circle of " + radius + " is: " + area);
        } else if(radius <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }



    }


}
