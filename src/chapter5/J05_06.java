package chapter5;

import java.io.DataInputStream;

public class J05_06 {
    public static void main(String arg[]) {

        //Another example of switch statement

        DataInputStream in = new DataInputStream(System.in);
        char ch;
        System.out.print("Enter A or a ar B or b: ");

        try {
            switch (ch=(char)System.in.read()) {
                case 'A':
                    System.out.println("You have entered A.");
                    break;

                case 'a':
                    System.out.println("You have entered a.");
                    break;

                case 66:
                    System.out.println("You have entered B.");
                    break;

                case 'b':
                    System.out.println("You have entered b.");
                    break;

                default:
                    System.out.println("You have not entered A, a, B or b.");
            }

        } catch (Exception e) {
            e.printStackTrace();

        }
    }
}
