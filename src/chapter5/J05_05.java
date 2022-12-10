package chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_05 {
    public static void main(String arg[]){

        //Example of switch statement

        int year = 0;
        String s;

        try {
            InputStreamReader in = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(in);
            System.out.print("Enter your academic year (From 1 to 4) : ");
            s = br.readLine();
            year = Integer.parseInt(s);

            switch (year){
                case 1:
                    System.out.println("You are a student of first year.");
                    break;

                case 2:
                    System.out.println("You are a student of second year.");
                    break;

                case 3:
                    System.out.println("You are a student of third year.");
                    break;

                case 4:
                    System.out.println("You are a student of forth year.");
                    break;

                default:
                    System.out.println("You have entered an invalid academic year.");

            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
