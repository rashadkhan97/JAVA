/* print this -

User Input: 4
   *
  **
 ***
****

 */

package All_Types_Loops;

import java.util.Scanner;

public class NestedLoop_InvertedHalfPyramid_Rotate_By180 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            //inner loop for space print
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

/* Note we can use the same variable once a for loop is close.
Previous for loop is close so that's why we can use j again.  */

            //inner loop for star print
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
