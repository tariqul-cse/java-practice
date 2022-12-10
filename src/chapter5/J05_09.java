package chapter5;

public class J05_09 {
    public static void main(String arg[]){

        //Another Example of for Statement

        int i = 0, j = 0;
        System.out.print("Series of prime number upto 25 is:");
        for (i = 2; i <= 25; i++){

            for (j = 2; j <= i; j++){
                if (i % j == 0)
                    break;
            }
            if (i == j)
                System.out.print(" " +i +" ");
        }
    }
}
