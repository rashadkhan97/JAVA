//Take an array of names as input from the user and print them on the screen.
package string;

import java.util.Scanner;

public class concat_length_charAt_FunctionUsingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //String Concatenation
        System.out.print("Enter first Name: ");
        String firstName = sc.next();

        System.out.print("Enter last Name: ");
        String lastName = sc.next();

        String fullName = firstName+lastName; //Concate first and last name
        System.out.println("Your full name: "+fullName);


        //String Length check using ".length()" function
        System.out.println("Full Name String length: "+fullName.length()); //use fullname for length check


        //charAt function - for print each word of the string
        for (int i=0; i<fullName.length(); i++){
            System.out.println("The word of "+i+"th index is :"+fullName.charAt(i));
        }

    }
}
