/* Qsn - print this
 *
 **
 ***
 ****
 *****
 Note - its (called half pyramid)
 */



package allLoops;

import java.util.Scanner;

public class NestedLoop_HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=i; j++){
/*note = in every line i increase also will be the no of stars.
                That's why J<=i */
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
