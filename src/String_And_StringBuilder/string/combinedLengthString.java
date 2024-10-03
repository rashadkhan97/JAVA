//Qsn - Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.

package String_And_StringBuilder.string;

import java.util.Scanner;

public class combinedLengthString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int size = sc.nextInt();
        String array[] = new String[size];

        int t_Length = 0;

        //array inputs
        System.out.println("Enter the values: ");
        for (int i=0; i<size; i++){
            array[i] = sc.next();
            t_Length=t_Length+array[i].length(); //total length calculating
        }

        System.out.println("the cumulative (combined) length of all those strings are: "+t_Length);
    }
}
