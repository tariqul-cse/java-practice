package chapter5;

public class J05_08 {
    public static void main(String arg[]){

        int f0 = 0, f1 = 1,f;
        System.out.println("First 10 Fibonacci Numbers are : \n");

        for (int i = 1; i<=10; i++){
            f = f0 + f1;
            System.out.print(" "+f +" ");
            f1 = f0;
            f0 = f1;
            
        }
    }
}
