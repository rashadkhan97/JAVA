//Take an array of names as input from the user and print them on the screen.
package Arrays;

import java.util.Scanner;

public class arrayAsInputShowOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int name = sc.nextInt();
        String[] marks = new String[name];

        //loop for input
        System.out.println("Enter the values: ");
        for (int i=0; i<name; i++){
            marks[i] = sc.next();
        }

        //loop for output

        for (int i=0;i< marks.length; i++){
            System.out.println("Value of "+(i+1)+" is: " +marks[i]);
        }

    }
}
