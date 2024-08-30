//Take an array of names as input from the user and print them on the screen.
package arrays;

import java.util.Scanner;

public class demoforday19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index number : ");
        int x = sc.nextInt();
        String[] mx = new String[x];

        //loop for input

        System.out.println("Enter the values here: ");
        for (int i=0; i<x; i++){
            mx[i] = sc.next();
        }

        //loop for output

        for (int i=0;i< mx.length; i++){
            System.out.println("Value of "+(i+1)+" : " +mx[i]);
        }

    }
}
