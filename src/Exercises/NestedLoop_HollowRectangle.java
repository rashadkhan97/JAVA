/* Qsn - print this
*****
*   *
*   *
*   *
*****

 */

package Exercises;

import java.util.Scanner;

public class NestedLoop_HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st no: ");
        int m = sc.nextInt();

        System.out.print("Enter the 2nd no: ");
        int n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            for (int j=1; j<=n; j++){
                if (i==1 || j==1 || i==m || j==n){
                    System.out.print("*");
                }
                else {
                    System.out.print (" ");
                }
            }
            System.out.println();
        }
    }
}
