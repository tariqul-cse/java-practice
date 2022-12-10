package chapter6;

public class J06_10 {
    public static void main(String arg[]){

        int i;
        final int max = 10;
        int fibo [] = new int[max];
        fibo [0] = 1;
        fibo [1] = 1;
        System.out.println("First 10 fibonacci number are: ");

        for (i = 2; i < max; i++){
            fibo [i] = fibo [i-2] + fibo [i-1];

            for (i = 0; i < max; i++){
                System.out.print(fibo[i] + " ");
            }
        }
    }
}
