package javaBasic;

import java.util.Scanner;

public class nestedLoopsExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the 1st Number: ");
        int n = sc.nextInt();

        System.out.print("Enter the 2nd Number: ");
        int m = sc.nextInt();

        //outer loop
        for (int i=0; i<n; i++){
            //inner loop
            for (int j=0; j<m; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
