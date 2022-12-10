package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J07_10 {
    public static void main(String arg[]) throws IOException {
        String name;
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        name = inData.readLine();
        int l = name.length();
        System.out.println("Your Name is: " + name);
        System.out.println("That Contains: " + l + " Characters");
    }
}
