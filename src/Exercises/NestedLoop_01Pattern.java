/* Qsn - Print 0-1 pattern
User Input: 4
1
0 1
1 0 1
0 1 0 1
*/
package Exercises;

import java.util.Scanner;

public class NestedLoop_01Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j=1; j<=i; j++){
                int sum = i+j;

                if (sum%2==0){
                    System.out.print("1 ");
                }
                else {
                    System.out.print ("0 ");
                }
            }
            System.out.println();
        }
    }
}