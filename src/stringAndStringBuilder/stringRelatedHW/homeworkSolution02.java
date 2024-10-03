/*Qsn - Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’
in the original string with letter ‘i’.

Example : Original = "eabcdef" ; result = “iabcdif”
          Original = “xyz” ; result = “xyz”  */

package stringAndStringBuilder.stringRelatedHW;
import java.util.Scanner;

public class homeworkSolution02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input Here: ");
        String input = sc.nextLine();
        String result = "";

       for (int i=0; i<input.length(); i++){
           if (input.charAt(i)== 'e'){
                result+= 'i';
           }else{
               result += input.charAt(i);
           }
       }
        System.out.println("Result: "+result);
    }
}
