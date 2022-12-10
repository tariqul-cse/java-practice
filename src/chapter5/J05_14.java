package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J05_14 {
    public static void main(String arg[]) throws IOException {

        //Example of while statement

        int n1=0,n2=0,gcd=0;
        String s1,s2;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR =  new BufferedReader(IN);
        System.out.print("Enter tow non negative integers :");
        s1= BR.readLine();
        s2= BR.readLine();
        n1= Integer.parseInt(s1);
        n2= Integer.parseInt(s2);

        while (n2 !=0){
            gcd= n1 % n2;
            n1= n2;
            n2= gcd;
        }
        System.out.println("The Greatest common divisor is : " +n1);
    }
}
