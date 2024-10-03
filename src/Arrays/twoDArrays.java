//Taking a matrix as an input and printing its elements.
package Arrays;

import java.util.Scanner;

public class twoDArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of Rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of Columns: ");
        int columns = sc.nextInt();

        int [][] numbers = new int[rows][columns];

        //Input
        System.out.println("Enter the values (first Row then Column): ");
        //rows input
        for (int i=0; i<rows; i++){
            //columns input
            for (int j=0; j<columns; j++){
                numbers[i][j] = sc.nextInt();
            }
        }

        //Output
        for (int i=0; i<rows; i++) {
            for (int j=0; j<columns; j++) {
                System.out.print(numbers[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
