//Take an array of names as input from the user and print them on the screen.
package arrays;

import java.util.Scanner;

public class demoforday17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int n = sc.nextInt();
        String[] m = new String[n];

        //loop for input

        System.out.println("Enter the values: ");
        for (int i=0; i<n; i++){
            m[i] = sc.next();
        }

        //loop for output

        for (int i=0;i< m.length; i++){
            System.out.println("Value of "+(i+1)+" is: " +m[i]);
        }

    }
}
