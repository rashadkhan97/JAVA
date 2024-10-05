//Append a char and print length of String

package String_And_StringBuilder.stringBuilder;

public class appendAndLengthPrint {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello Guys!");

        System.out.println("Before Append: "+sb);
        //append a chart
        sb.append(" This is Rashad");
        System.out.println("After Append: "+sb);

        System.out.println("Total Length of String: "+sb.length());
    }
}
