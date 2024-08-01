import java.util.Scanner;

public class conditionExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //If condition for age
        System.out.println("Enter Your Age: ");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("Adult");
        } else{
            System.out.println("Not Adult");
        }

        //If condition for even odd
        System.out.println("Enter the number: ");
        int x = sc.nextInt();
        if (x%2 == 0){
            System.out.println("Even");
        } else{
            System.out.println("Odd");
        }
    }

}
