//Take a matrix as input from the user. Search for a given number x and print the indices at which it occurs
package arrays;

import java.util.Scanner;

public class twoDArraysExample01 {
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

        //taking output of x for finding the element
        System.out.print("Enter the input you want to search from the matrix: ");
        int x = sc.nextInt();

        //Output
        for (int i=0; i<rows; i++){
            //columns input
            for (int j=0; j<columns; j++){
                if (numbers[i][j]==x){
                    System.out.println("The value X found at (i,j)= ("+i+","+j+")");
                }
            }
        }
    }
}
