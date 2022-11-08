package chapter3;

import java.io.*;

public class J03_21 {
    public static void main(String arg[]) throws IOException{

        /*Reading an integer and float type value from keyboard*/

        int roll;
        float mark;
        String s1,s2;
        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        System.out.print("Enter Roll: ");
        s1 = BR.readLine();
        roll = Integer.parseInt(s1);
        System.out.print("Enter Mark: ");
        s2 = BR.readLine();
        mark = Float.parseFloat(s2);
        System.out.println("Roll Entered : " +roll);
        System.out.println("Mark Entered :" +mark);
    }
}
