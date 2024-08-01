
public class LoopsExample {
    public static void main(String[] args) {

        //for loop example
        System.out.println("For Loop Output: ");
        for (int i=0; i<3;i++){
            System.out.println(i);
        }

        //while loop example
        // ( variable dec outside, condition dec. inside while, print & increment inside loop)
        int x=1;
        System.out.println("while Loop Output: ");
        while (x<10){
            System.out.println(x);
            x++;
        }

        //do while loop example
        // ( variable dec outside, condition dec. inside while loop, print & increment inside do loop)

        int y =1;
        System.out.println("Do While Loop Output: ");
        do {
            System.out.println(y);
            y++;
        }
        while (y<10);
    }
}
