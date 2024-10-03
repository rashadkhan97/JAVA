//Take an array of names as input from the user and print them on the screen.
package String_And_StringBuilder.string;

import java.util.Scanner;

public class string_compareTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //compare between two string
        System.out.print("Enter Your First Input: ");
        String first = sc.nextLine();

        System.out.print("Enter Your Second Input: ");
        String second = sc.nextLine();

        //condition
        //1. first > second = +ve value
        //2. first = second = 0 (for now we use this condition)
        //3. first < second = -ve value

        if (first.compareTo(second)==0){
            System.out.println("Strings are equal");
        }else
            System.out.println("Strings are not equal");
    }
}
