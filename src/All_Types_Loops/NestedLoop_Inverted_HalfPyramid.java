/* Qsn - print this
*****
****
***
**
*

 */

package All_Types_Loops;

import java.util.Scanner;

public class NestedLoop_Inverted_HalfPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
