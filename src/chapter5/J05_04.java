package chapter5;

import java.io.DataInputStream;

public class J05_04 {
    public static void main(String arg[]){

        //Another Example of else if Statement

        DataInputStream in = new DataInputStream(System.in);

        char ch;
        try {
            System.out.print("Enter the Characterar to be tested: ");
            ch = (char)System.in.read();
            if ((ch >= 'A') && (ch <= 'Z')){
                System.out.println("You entered a capital latter: " + ch);

            }else if ((ch >= 'a') && (ch <= 'z')) {
                System.out.println("You entered a small letter: " + ch);

            }else{
                System.out.println("The latter you entered is not a character.");

            }

        } catch (Exception e){
            System.out.println("Nothing");

        }
    }
}
