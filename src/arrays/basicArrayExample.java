// Take number as input from users and show avg, sum, max, min
package arrays;

import java.util.Scanner;

public class basicArrayExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length of array: ");
        int arr = sc.nextInt();

        int [] number = new int[arr];

        //input
        System.out.println("Enter the array numbers: ");
        for (int i=0; i<arr; i++){
            number[i]= sc.nextInt();;
        }

        //Summation
        int sum = 0;
        for (int i=0; i< number.length; i++){
            sum=sum+number[i];
        }

        //Avg er jnno sum / array r jei length ase (number.length) ta div korlei hobe. Kono loop er dorkar nai
        float avg = (float) sum/ number.length; //type casting kora hoise coz sum and number.length 2 tai int
                                                //kintu amr value to dorkar float e tai float dia typecast kora hoise
        //Min and Max
        int min = number[0];
        int max = number[0];
        for (int i=0; i< number.length; i++){
            if (number[i]>max){
                max = number[i];
            }
            if (number[i]<min){
                min = number[i];
            }
        }

        System.out.println("Summation: "+sum);
        System.out.println("Average: "+avg);
        System.out.println("Maximum Number: "+max);
        System.out.println("Minimum Number: "+min);
    }
}
