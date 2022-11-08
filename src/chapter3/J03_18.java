package chapter3;

import java.io.*;

public class J03_18 {
    public static void main(String arg[]){

        /*Reading a Character from Keyboard*/

        DataInputStream in = new DataInputStream(System.in);
        char ch;
        try {
            System.out.print("Enter character: ");
            ch= (char)System.in.read();
            System.out.println("Your have entered: " +ch);
        }
        catch (Exception e){    }

    }
}
