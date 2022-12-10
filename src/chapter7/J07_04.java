package chapter7;

import java.io.DataInputStream;

public class J07_04 {
    public static void main(String arg[]){

        DataInputStream inData = new DataInputStream(System.in);
        String name;
        name = new String("");

        try {
            System.out.print("Please enter your name: ");
            name = inData.readLine();
        }catch (Exception e){        }

        System.out.print("Your Name is: ");
        System.out.print(name);
    }
}
