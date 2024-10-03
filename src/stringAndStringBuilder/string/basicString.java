//Take an array of names as input from the user and print them on the screen.
package stringAndStringBuilder.string;

import java.util.Scanner;

public class basicString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Name: ");

        String name = sc.nextLine(); //If we can say if we print single word then use it - sc.next()
                                    //But if we want to print spaces/ line  then it is - sc.nextLine()

        System.out.print("Your Name is: "+name);

    }
}
