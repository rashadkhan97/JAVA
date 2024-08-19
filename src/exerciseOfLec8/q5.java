//Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.
package exerciseOfLec8;

import java.util.Scanner;

public class q5 {
    public static String checkAge(int a){
        if(a>18){
            return a+" age is eligible to vote";
        }
            return a+" age  is not eligible to vote";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age to Check Eligibility: ");
        int a = sc.nextInt();

        System.out.println(checkAge(a)); //simply called the function and print
    }
}
