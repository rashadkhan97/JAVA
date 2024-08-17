/* Qsn - print this
User Input: 3
  *
 ***
*****
*****
 ***
  *
* */

package allLoops;

import java.util.Scanner;

public class NestedLoop_DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        //outer loop for upper part
        for (int i=1; i<=n; i++){

            //for space print
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //for number print
            for (int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //outer loop for lower part
        for (int i=n; i>=1; i--){

            //for space print
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            //for number print
            for (int j=1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
