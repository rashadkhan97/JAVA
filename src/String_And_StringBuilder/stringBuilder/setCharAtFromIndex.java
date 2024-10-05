//set character at index

package String_And_StringBuilder.stringBuilder;

public class setCharAtFromIndex {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rashed Khan");
        //chart set
        sb.setCharAt(4, 'a');

        System.out.println(sb);
    }
}
