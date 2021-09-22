package org.launchcode.java.studios.areaofacircle;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Math;
public class Area {
    public static void main(String[] args) {
        Scanner scanny = new Scanner(System.in);
        System.out.println("What's your radius: ");
        double radius;
        do
        {
            try
            {
                radius = scanny.nextDouble();
            }
            catch (InputMismatchException e)
            {
                radius = -1;
                scanny.next();
            }
            if (radius <=0)
                System.out.println("Invalid input. Please enter a number greater than 0.");
        }while (radius <= 0);

        double area = Circle.getArea(radius);
        System.out.println("The area of the circle is "+area);
    }
}
