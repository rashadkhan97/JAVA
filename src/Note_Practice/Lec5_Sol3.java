/*
User Input: 4
   1
  2 2
 3 3 3
4 4 4 4

* */

package Note_Practice;

import java.util.Scanner;

public class Lec5_Sol3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++){
            //for space print
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }

            //for number print
            for (int j=1; j<=i; j++){
                System.out.print(i+ " ");
            }
            System.out.println();
        }
    }
}
