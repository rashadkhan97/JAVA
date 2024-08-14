/*
User Input: 4
   1
  2 1 2
 3 2 1 2 3
4 3 2 1 2 3 4

* */

package Note_Practice;

import java.util.Scanner;

public class Lec5_Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i =1; i<=n; i++){
            //for space print
            for (int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            //for 1st part
            for (int j=i; j>=1; j--){
                System.out.print(j+ " ");
            }

            //for 2nd part
            for (int j=2; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
