// Clear 2nd bit (position = 1) of a number n. (n = 0101).
// Take operation input from user
/* Update Bit
   -----------
   1. Operation 1 (set) - For 1:
   Bit Mask = 1<<i
   Operation = AND with NOT

   2. Operation 0 (clear) For 0:
   Bit Mask = 1<<i
   Operation = OR
*/

package Bit_Manipulation;

import java.util.Scanner;

public class updateBit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press Operation 1/0? : ");
        int operation = sc.nextInt();

        int n = 5; //0101 is actually binary of decimal 5
        int position = 2;
        int bitMask = 1<<position;

        //if user give input 1 then set operation will execute and if 0 then Clear
        if(operation == 1) {
            //set
            int newNumber = bitMask | n;
            System.out.println("You have choose Operation "+operation+" and result is "+newNumber);
        } else {
            //clear
            int newBitMask = ~(bitMask);
            int newNumber = newBitMask & n;
            System.out.println("You have choose Operation "+operation+" and result is "+newNumber);
        }
    }
}
