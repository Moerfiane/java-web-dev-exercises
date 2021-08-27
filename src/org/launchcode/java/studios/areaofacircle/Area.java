package org.launchcode.java.studios.areaofacircle;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input;
        double radius;
        double area;
        input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        radius = input.nextDouble();
        area = (radius * radius) * 3.14;
        System.out.println("The area of a circle with a radius of " + radius + " = " + area);

    }
}
