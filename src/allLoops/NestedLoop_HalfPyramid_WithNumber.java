/* Qsn - print the pattern
User Input: 4
1
12
123
1234
*/

package allLoops;

import java.util.Scanner;

public class NestedLoop_HalfPyramid_WithNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
