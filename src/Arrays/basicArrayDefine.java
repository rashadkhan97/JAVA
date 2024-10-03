package Arrays;

public class basicArrayDefine {
    public static void main(String[] args) {
        //array define type 1 (type [] arrayName = new type[])
        int[] marks = new int[3];
        marks[0]=98;
        marks[1]=94;
        marks[2]=58;
        System.out.println("Type 1"+marks[1]); //printing only one output

        //array define type 2 (type arrayName [] = new type[])
        int marks2 []= new int[3];
        marks2[0]=58;
        marks2[1]=74;
        marks2[2]=88;
        System.out.println("Type 2"+marks2[1]); //printing only one output

        //array define type 3 (type arrayName [] = {direct value add})
        int marks3 []= {97, 54, 67};
        System.out.println("Type 3"+marks3[1]); //printing only one output
    }
}
