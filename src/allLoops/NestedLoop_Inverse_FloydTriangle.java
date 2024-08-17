/* Qsn - print this
User Input: 4
1
2 3
4 5 6
7 8 9 10
 */



package allLoops;

import java.util.Scanner;

public class NestedLoop_Inverse_FloydTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();
        System.out.print("Enter the Max limit: ");
        int number = sc.nextInt();
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(number+" ");
                number=number-1;
            }
            System.out.println();
        }

    }
}
