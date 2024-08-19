package exerciseOfLec8;

import java.util.Scanner;

public class q7 {
    public static void main(String[] args) {
        int positive = 0, negative =0, zeros = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 to continue or 0 to stop: ");
        int n = sc.nextInt();

        while (n==1){
            System.out.print("Enter a number: ");
            int a = sc.nextInt();
            if (a>0){
                positive++;
            }   else if (a<0) {
                negative++;
            }   else {
                zeros++;
            }
            System.out.print("Press 1 to continue or 0 to stop: ");
            n = sc.nextInt();
        }
        System.out.println("Positives : "+ positive);
        System.out.println("Negatives : "+ negative);
        System.out.println("Zeros : "+ zeros);
    }
}
