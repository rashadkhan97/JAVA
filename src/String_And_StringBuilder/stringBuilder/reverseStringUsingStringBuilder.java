//Reverse a String (using StringBuilder class)

package String_And_StringBuilder.stringBuilder;

public class reverseStringUsingStringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rashad");
        System.out.println("Before Reversing string: "+sb);

        for (int i=0; i<=sb.length()/2; i++){
            int frontString = i;
            int backString = sb.length() - i - 1; //if length 5 = 5-0-1 = 4

            //let say 'hello' is the string - h which index is 0 will go to 4th index which is
            //no of length -1-i = (5-1-0) = 4

            //in this example 'Rashad' is the string - R's index is at 0, and it will go to
            // 6-1-0 =5th index which means in place of d, R will replace it

            char frontChar = sb.charAt(frontString);
            char backChar = sb.charAt(backString);

            sb.setCharAt(frontString, backChar);
            sb.setCharAt(backString, frontChar);
        }
        System.out.println("After Reversing string: "+sb);
    }
}
