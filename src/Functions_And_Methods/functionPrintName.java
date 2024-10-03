//Qsn - Print Name Using Function

package Functions_And_Methods;

import java.util.Scanner;

public class functionPrintName {
    public static void printMyName(String name){
        System.out.println("Output: "+name);
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("User Input: ");
        String name = sc.next();

        printMyName(name); //calling function
    }
}
