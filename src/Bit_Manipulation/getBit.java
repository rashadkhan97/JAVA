//Get the 3rd bit (position = 2) of a number n. (n = 0101)
/* Get Bit
   ---------
    Bit Mask = 1<<i
    Operation = AND
 */

package Bit_Manipulation;

public class getBit {
    public static void main(String[] args) {
        int n = 5; //0101 is actually binary of decimal 5
        int position = 2;
        int bitMask = 1<<position;

        if ((bitMask & n) == 0){
            System.out.println("Bit was zero");
        } else {
            System.out.println("Bit was one");
        }

    }
}
