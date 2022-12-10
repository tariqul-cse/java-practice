package chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_02 {
    public static void main(String arg[]) {

        //Example of if....else Control

        int year = 0;
        String s;

        try {
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter the year to be tested: ");
            s = BR.readLine();
            year = Integer.parseInt(s);

            if ( ((year % 4) == 0 && (year % 100) !=0) || (year % 400) == 0){
                System.out.println("is a leap year. ");
            }else{
                System.out.println("is not a leap year.");
            }
        } catch (Exception E) {

        }
    }
}
