package exercises;

import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("what is the length of the rectangle");
        Double length = input.nextDouble();
        System.out.println("what is the width of the rectangle");
        Double width = input.nextDouble();
        Double area = length * width;
        System.out.println(area);



    }

}
