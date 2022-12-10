package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J05_18 {
    public static void main(String arg[]) throws IOException {

        //Example of labeled continue statement

        int n=0;
        long fact=1;
        String s;

        Loop1:

        for ( ; ; ){
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter a positive integer: ");
            s= BR.readLine();
            n= Integer.parseInt(s);

            Loop2:
            if (n<0){
                System.out.println("Negative Number not allowed! Enter Again");
                continue Loop1;
            }else if (n==0){
                System.out.print("Factorial of " +n+"is" +fact);
                break Loop1;
            }else {
                for (int i=2; i<=n; i++)
                    fact = fact*i;
                System.out.println("Factorial of " +n+ "is:" +fact);
                break Loop1;
            }
        }
    }
}
