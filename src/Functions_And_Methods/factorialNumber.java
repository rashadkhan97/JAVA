//Qsn - Find the factorial of a number

package Functions_And_Methods;

import java.util.Scanner;

public class factorialNumber {
    public static void printFactorial(int n){
        int fact=1;
        if(n<0){
            System.out.println("Invalid Number");
            return;
        }
        for (int i=n;i>=1;i--){
            fact=fact*i;
        }
        System.out.println("Factorial of given input is: "+fact);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n=sc.nextInt();

        printFactorial(n); //calling function
    }
}
