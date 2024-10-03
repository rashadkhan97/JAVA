package Problem_Solve_From_Lec_5_To_7;

import java.util.Scanner;

public class Lec6_Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++){
            for (int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1; j<=i; j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
