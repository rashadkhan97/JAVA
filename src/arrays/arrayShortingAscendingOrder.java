//Take an array of numbers as input and check if it is an array sorted in
//ascending order

package arrays;

import java.util.Scanner;

public class arrayShortingAscendingOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the array index: ");
        int n = sc.nextInt();
        int [] arr = new int[n];

        //loop for input
        System.out.print("Input array of numbers: ");
        for (int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //shorting
        int temp = 0; //assigning a temp value for shorting in if loop
        for (int i=0; i<arr.length; i++){
            for (int j=i+1; j<arr.length; j++){ // 1st value i er sathe 2nd value j check korbo tai j=i+1
                // condition for checking ascending order
                if(arr[j]<arr[i]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        //output
        //loop for input
        System.out.print("After sorting array numbers:  ");
        for (int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
}
