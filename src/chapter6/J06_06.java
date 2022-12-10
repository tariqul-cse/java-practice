package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J06_06 {
    public static void main(String arg[]) throws IOException {

        int roll [] = new int[5];
        String s [] = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.print("\nEnter Roll["+i+"]: ");
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            s [i] = BR.readLine();
            roll [i] = Integer.parseInt(s[i]);
        }
        for (int i = 0; i < 5; i++){
            System.out.print("\nRoll["+i+"]= " +roll[i]);
        }
    }
}
