package problemSolveOfLectures;

import java.util.Scanner;

public class Lec6_Sol5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        for (int i=1; i<=n; i++) {
            for (int j=n+1-i; j>=1; j--) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
