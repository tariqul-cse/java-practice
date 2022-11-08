package chapter3;

import java.io.*;

public class J03_20 {
    public static void main(String arg[])throws IOException{
        String s;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.println("Enter a string (line of characters): " );
        s = BR.readLine();
        System.out.println("You have entered: " +s);
    }
}
