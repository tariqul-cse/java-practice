package chapter6;

public class J06_05 {
    public static void main(String arg[]){

        int roll[];
        float mark[];

        roll = new int[5];
        mark = new float[5];

        for (int i = 0; i < 5; i++){

            System.out.println("Roll["+i+"]= " + roll[i]);
            System.out.println("Mark["+i+"]= " + mark[i]);
        }
    }
}
