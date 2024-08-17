//Qsn - Make a function to add 2 numbers and return the sum.

package functionsAndMethods;

import java.util.Scanner;

public class twoNumberSum {
    public static void sumCalculation(int n1, int n2){

        int sum=n1+n2; //sum calculation
        System.out.println("Output: "+sum);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int n2 = sc.nextInt();

        sumCalculation(n1,n2); //calling function
    }
}
