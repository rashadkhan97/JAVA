/* Qsn - print this
User Input: 4
*      *
**    **
***  ***
********
********
***  ***
**    **
*      *

 */

package Loops;

import java.util.Scanner;

public class NestedLoop_ButterflyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        //Upper part
        for (int i=1; i<=n; i++){
                //1st half
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                //space print
                for (int j=1; j<=2*(n-i); j++){
                    System.out.print(" ");
                }
                //2nd half
                for (int j=1; j<=i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }

        //lower part
        for (int i=n; i>=1; i--){
            //1st half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            //space print
            for (int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            //2nd half
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
