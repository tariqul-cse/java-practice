package chapter5;

public class J05_10 {
    public static void main(String arg[]){

        //Example of Labled Loop

        int isprime = 0, j = 0;
        System.out.println("Serise of prime number upto 25 is:");
        Loop1:
        for (int x = 2; ; x ++){

            if (x >= 25)
                break Loop1;
                isprime = 1;

            for (int d = 2; d < x; d++){
                if (x % d == 0)
                    isprime = 0;

                if (isprime != 0)
                    System.out.println(" "+x +" ");

            }

        }
    }
}
