package exerciseOfLec8;

import java.util.Scanner;

public class q3 {
    public static String getGreater(int a, int b) {
        if(a > b) {
            return a + " is greater";
        } else if (a < b) {
            return b + " is greater";
        } else {
            return "Both are same";
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number:");
        int a = sc.nextInt();
        System.out.print("Enter 2nd number:");
        int b = sc.nextInt();

        String greater = getGreater(a,b);
        System.out.println(greater);
    }
}
