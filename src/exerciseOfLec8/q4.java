// Write a function that takes in the radius as input and returns the circumference of a circle.
package exerciseOfLec8;

import java.util.Scanner;

public class q4 {
    public static double getRadius(double n, double r){
        return 2*r*n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius Value r: ");
        double n = sc.nextDouble();

        System.out.print("Enter Value for pie (ex-3.1416): ");
        double r = sc.nextDouble();

        double total = getRadius(n,r);
        System.out.println("Result: "+total);

    }
}
