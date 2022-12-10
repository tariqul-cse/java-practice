package chapter6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J06_08 {
    public static void main(String arg[]){

        int roll [] = new int[5];
        String s [] = new String[5];

        try {
            for (int i = 0; i < 5; i++){
                System.out.print("Enter Roll["+i+"]: ");
                BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
                s [i] = BR.readLine();
                roll [i] = Integer.parseInt(s[i]);
            }
        }
        catch (Exception E){
            System.out.println("Enter in input! program terminated.");
            System.exit(0);
        }
        for (int i = 0; i < 5; i++){
            System.out.println("Roll["+i+"] = " + roll[i]);
        }
    }
}
