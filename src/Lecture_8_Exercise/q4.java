// Write a function that takes in the radius as input and returns the circumference of a circle.
package Lecture_8_Exercise;

import java.util.Scanner;

public class q4 {
    public static double getRadius(double r, double pi){
        return 2*pi*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Value r: ");
        double r = sc.nextDouble();

        System.out.print("Enter Value for pie (ex-3.1416): ");
        double pi = sc.nextDouble();

        double total = getRadius(r,pi);
        System.out.println("Result: "+total);

    }
}
