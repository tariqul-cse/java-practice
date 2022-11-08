package chapter3;
import java.io.*;

public class J03_19 {
    public static void main(String arg[])throws IOException{

        /*Reading a Character from Keyboard*/


        char ch;
        DataInputStream in = new DataInputStream(System.in);
        System.out.print("Enter a character: ");
        ch = (char)System.in.read();
        System.out.println("You have entered " +ch);
    }
}
