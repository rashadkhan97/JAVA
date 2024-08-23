package exerciseOfLec8;

import java.util.Scanner;

public class q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNum=0,SecondNum=1, nextNum;
        System.out.print("Enter nth term for Fibonacci series: ");
        int n = sc.nextInt();

        if (n>1){ //no doubt the series has to be at least 2 value
            System.out.println("Fibonacci series: ");
            for (int i=1; i<=n; i++){
                System.out.print(firstNum+" ");
                // we use swapping method
                nextNum = firstNum+SecondNum; // 0+1=1
                firstNum = SecondNum; // 1 already declared initially for 2nd number
                SecondNum = nextNum; // the result of next number
            }
        }else
            System.out.println("Invalid Input");
    }




}
