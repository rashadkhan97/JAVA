// Clear 3rd bit (position = 2) of a number n. (n = 0101)
/* Clear Bit
   ---------
    Bit Mask = 1<<i
    Operation = AND with NOT
 */

package Bit_Manipulation;

public class clearBit {
    public static void main(String[] args) {
        int n = 5; //0101 is actually binary of decimal 5
        int position = 2;
        int bitMask = 1<<position;

        int newBitMask = ~(bitMask); // and operation of bitmask or we can say reverse
        int newNumber = newBitMask & n; //not operation performed once and operation done.
        System.out.println(newNumber);
    }
}
