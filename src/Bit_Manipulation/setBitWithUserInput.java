//Get the 2nd bit (position = take from user input) of a number n. (n = 0101)
/* Set Bit
   ---------
    Bit Mask = 1<<i
    Operation = OR
 */
package Bit_Manipulation;

import java.util.Scanner;

public class setBitWithUserInput {
        public static void main(String[] args) {
            int n = 5; //0101 is actually binary of decimal 5

            System.out.println("Enter the position: ");
            Scanner sc = new Scanner(System.in);
            int position = sc.nextInt();
            int bitMask = 1<<position;

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }
}
