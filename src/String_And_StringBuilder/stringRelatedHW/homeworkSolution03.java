/* Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
    email = “rashadkhan@gmail.com” ; username = “rashadkhan”
    email = “helloWorld123@gmail.com”; username = “helloWorld123”
  */

package String_And_StringBuilder.stringRelatedHW;
import java.util.Scanner;

public class homeworkSolution03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Input Here: ");
        String input = sc.nextLine();
        String result = "";

       for (int i=0; i<input.length(); i++){
           if (input.charAt(i)== '@'){
                break;
           }else{
               result += input.charAt(i);
           }
       }
        System.out.println("Output: "+result);
    }
}
