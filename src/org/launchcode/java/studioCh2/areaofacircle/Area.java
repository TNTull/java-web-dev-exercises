//Teresa Tull worked on this on 9-11-2022 ch 2 studio
package org.launchcode.java.studioCh2.areaofacircle;

import java.util.Scanner;

public class Area {

    public static void main(String[] args) {
        Scanner input;
        double radius;
        //double pi = 3.14;
        double areaOfCircle;

        input = new Scanner(System.in);
        System.out.println("Enter the radius of your circle: ");
        radius = input.nextDouble();
        input.close();
        //areaOfCircle = pi * radius * radius;
        areaOfCircle = Circle.getArea(radius);
        System.out.println("The area of your circle is " + areaOfCircle);
    }
}
