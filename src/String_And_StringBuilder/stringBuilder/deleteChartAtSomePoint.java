//Delete char at some Index

package String_And_StringBuilder.stringBuilder;

public class deleteChartAtSomePoint {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Rashad Khan");

        System.out.println("Before delete : "+sb);
        sb.delete(0, 4);
        System.out.println("After delete: "+sb);

    }
}
