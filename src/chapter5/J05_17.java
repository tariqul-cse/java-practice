package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J05_17 {
    public static void main(String arg[]) throws IOException {

        //Example of continue control statement

        int number=0;
        String s;

        for ( ; ; ){
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter a positive integer: ");
            s= BR.readLine();
            number= Integer.parseInt(s);

            if (number <= 0)
                continue;
            else break;
        }
        System.out.print("You have entered : " +number);
    }
}
