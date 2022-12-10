package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J07_30 {
    public static void main(String arg[]) throws IOException {
        String s;
        Float f;
        BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a floating point number: ");
        s = BR.readLine();
        f = Float.valueOf(s);
        System.out.println("You have entered: " + f);
    }
}
