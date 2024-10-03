//Qsn - Make a function to multiply 2 numbers and return the product.

package Functions_And_Methods;

import java.util.Scanner;

public class multOfProduct {
    public static int calculateProduct(int a, int b){
        return a*b; //can return in many ways its one of them
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd Number: ");
        int b = sc.nextInt();

        int mult = calculateProduct(a,b);
        System.out.println("Product of input number are: "+mult);

    }
}
