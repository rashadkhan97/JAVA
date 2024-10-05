//insert a character at some index

package String_And_StringBuilder.stringBuilder;

public class insertChartAtSomeIndex {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tashed Khan");

        System.out.println("Before insert: " +sb);

        //insert at some index point
        sb.insert(0, 'R');
        sb.insert(4, 'a');

        System.out.println("After insert: " +sb);
    }

}
