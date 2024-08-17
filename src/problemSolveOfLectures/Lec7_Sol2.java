//Qsn - Make a function to check if a given number n is even or not.

package problemSolveOfLectures;

import java.util.Scanner;

public class Lec7_Sol2 {
    public static void isEven(int n) {
        if (n % 2 == 0) {
            System.out.println(n + " is a Even Number.");
        } else {
            System.out.println(n + " is a Odd Number.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        isEven(n);
    }
}