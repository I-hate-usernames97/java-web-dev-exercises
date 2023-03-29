package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter radius of a circle:" );
        Double radius = input.nextDouble();
        Double area = Circle.getArea(radius);
        System.out.println(area);

    }

}
