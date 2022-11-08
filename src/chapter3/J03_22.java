package chapter3;

import java.io.*;

public class J03_22 {
    public static void main(String arg[]){

        /*Converting String Object Corresponding Wrapper Class Object Using ValueOf() Method*/

        Integer roll;       //Roll is wrapper class object
        String name;
        Float mark;         //Mark is wrapper class object
        String s1,s2;

        InputStreamReader IN = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(IN);
        try {
            System.out.print("Enter Roll: ");
            s1 = BR.readLine();
            roll = Integer.valueOf(s1);
            System.out.print("Enter Name: ");
            name = BR.readLine();
            System.out.print("Enter Mark: ");
            s2 = BR.readLine();
            mark = Float.valueOf(s2);
            System.out.println("Roll is : " +roll);
            System.out.println("Name is : " +name);
            System.out.println("Mark is : " +mark);

        } catch (IOException e){
            System.out.println("Exception No: " +e);
        }

    }
}
