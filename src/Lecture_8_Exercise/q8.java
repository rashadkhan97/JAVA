package Lecture_8_Exercise;

import java.util.Scanner;

public class q8 {
    public static void main(String args[]) {
        System.out.print("Enter Base value for x: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the power value: ");
        int n = sc.nextInt();

        int result = 1;
        //Please see that n is not too large or else result will exceed the size of int
        for(int i=0; i<n; i++) {
            result = result * x;
            System.out.println(x+" to the power " +i+ " is : "+ result);
        }
        System.out.println();
        System.out.println("Final Result of "+x+" power " +n+ " : "+ result);
    }
}
