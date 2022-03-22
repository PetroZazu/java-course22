package Lesson2;

import java.util.Scanner;

public class CalcFigure2 {
    static Scanner sc = new Scanner(System.in);

    public static double circleSquare(double rad) {
        return Math.PI * Math.pow(rad, 2);
    }

    public static double rectangleSquare(double a, double b) {
        return a * b;
    }

    public static void main(String[] args) {
        System.out.println("enter the Circle radius");
        System.out.println("Circle square is:" + circleSquare(sc.nextDouble()));

        System.out.println("enter the rectangle left or right side length");
        double a = sc.nextDouble();
        System.out.println("enter the rectangle bottom or up side length");
        double b = sc.nextDouble();
        System.out.println("Rectangle square is:" + rectangleSquare(a, b));

    }
}
