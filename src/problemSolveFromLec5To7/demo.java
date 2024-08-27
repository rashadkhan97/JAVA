package problemSolveFromLec5To7;

import java.util.Scanner;

public class demo {
    public static void tableCount(int n){
        for (int i=1; i<=10; i++){
            int sum=n*i;
            System.out.println(n+"x"+ i + " = " +sum);
        }
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        int n = sc.nextInt();

        tableCount(n);


        }
}
