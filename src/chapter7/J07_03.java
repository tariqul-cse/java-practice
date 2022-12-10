package chapter7;

import java.io.DataInputStream;
import java.io.IOException;

public class J07_03 {
    public static void main(String arg[]) throws IOException {

        DataInputStream inData = new DataInputStream(System.in);
        System.out.print("Please enter your name: ");
        String name;
        name = inData.readLine();
        System.out.print("Your name is: ");
        System.out.print(name);
    }
}
