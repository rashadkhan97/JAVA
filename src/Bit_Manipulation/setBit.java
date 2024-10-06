//Get the 2nd bit (position = 1) of a number n. (n = 0101)
/* Set Bit
   ---------
    Bit Mask = 1<<i
    Operation = OR
 */
package Bit_Manipulation;

public class setBit {
        public static void main(String[] args) {
            int n = 5; //0101 is actually binary of decimal 5
            int position = 1;
            int bitMask = 1<<position;

            int newNumber = bitMask | n;
            System.out.println(newNumber);

        }
}
