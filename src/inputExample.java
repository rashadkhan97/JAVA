//Question - take input a and b. Do the summation of this .

import java.util.Scanner;

public class inputExample {
    public static void main(String[] args) {
        //Input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a = sc.nextInt();

        System.out.println("Enter Second number: ");
        int b = sc.nextInt();

        int sum = a+b;

        System.out.print("Result: ");
        System.out.println(sum);
    }
}
