/* Qsn - print this
User Input: 4
1234
123
12
1
 */

package allLoops;

import java.util.Scanner;

public class NestedLoop_Inverted_HalfPyramid_WithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){ //if we want j =<n-i+1 in place of j<=1 is also  correct
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
