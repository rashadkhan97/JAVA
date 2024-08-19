//Enter 3 numbers from the user & make a function to print their average.
package exerciseOfLec8;

import java.util.Scanner;

public class q1 {
    public static float printAvg(float a, float b, float c){
        float avg =(a+b+c) / 3;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        Float a = sc.nextFloat();

        System.out.print("Enter 2nd Number: ");
        Float b = sc.nextFloat();

        System.out.print("Enter 3rd Number: ");
        Float c = sc.nextFloat();

        System.out.println("Avg of 3 number: "+printAvg(a,b,c));
    }
}
