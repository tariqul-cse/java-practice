package chapter7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J07_05 {
    public static void main(String arg[]) throws IOException {

        String name;
        BufferedReader inData = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please enter your name: ");
        name = inData.readLine();
        System.out.print("Your name is: ");
        System.out.print(name);
    }
}
