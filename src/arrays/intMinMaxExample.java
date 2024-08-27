//Find the maximum & minimum number in an array of integers.
package arrays;

import java.util.Scanner;

public class intMinMaxExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int arr = sc.nextInt();
        int number[] = new int[arr];

        //input
        System.out.println("Enter the numbers: ");
        for (int i=0; i<arr; i++){
            number[i]=sc.nextInt();
        }

        int min = Integer.MIN_VALUE; //Integer.MIN_VALUE - a constant that holds the minimum value
        int max = Integer.MAX_VALUE; //Integer.MAX_VALUE - a constant that holds the maximum value

        //Else we can right this way also
        // int min = number[0];
        // int max = number[0];

        //output
        for (int i=0; i<number.length; i++) {
            if (number[i] > max) {
                max = number[i];
            }
            if (number[i] < min) {      //use if because of 2 condition min and max
                min = number[i];
            }
        }
        System.out.println("Max number: "+max);
        System.out.println("Min number : "+min);
    }

}
