//Q - Print the table of number input by user

package All_Types_Loops;
import java.util.Scanner;

public class LoopExercise2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number: ");
        int n = sc.nextInt();

        int mult;
        System.out.println("The table of given input is: ");
        for (int i = 1; i <= 10; i++) {
           mult=n*i;
           System.out.println(n + "x" + i + " = " + mult);
        }
    }
}

