package Arrays;

import java.util.Scanner;

public class arrayTransposeExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of Rows: ");
        int r = sc.nextInt();
        System.out.print("Enter no of Columns: ");
        int c = sc.nextInt();

        int [] [] matrix = new int[r][c];

        //input
        System.out.println("Enter the values (first Row then Column): ");
        for (int i=0; i<r; i++){
            for (int j=0; j<c; j++){
                matrix [i][j]=sc.nextInt();
            }
        }
        //output
        System.out.println("The Transpose Matrix: ");
        // jehetu  matrix tai inverse tai j dia suru hoise . column hoye gese row and row hoise column
        for (int j=0; j<c; j++){
            for (int i=0; i<r; i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
