package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J05_15 {
    public static void main(String arg[]) throws IOException {

        //Example of do....while statement

        int number=0, rightdigit=0;
        String s;

        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.print("Enter the number to be reversed: ");
        s= BR.readLine();
        number= Integer.parseInt(s);
        System.out.print("The number in reveres order is:");
        do {
            rightdigit=number % 10;
            System.out.print("" +rightdigit);
            number= number/ 10;
        }while (number !=0);

    }
}
