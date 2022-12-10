package chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_01 {
    public static void main(String arg []){

        //Example of if Control

        int age = 0;
        String s;

        try {
            InputStreamReader IN = new InputStreamReader(System.in);
            BufferedReader BR = new BufferedReader(IN);
            System.out.print("Enter Your Age: ");
            s = BR.readLine();
            age = Integer.parseInt(s);

            if (age<=0){
                System.out.println("You have not borned yet!");
            }

            if (age>0 && age<=12){
                System.out.println("You are a child");
            }

            if (age>12 && age<=19){
                System.out.println("You are a teen ager.");
            }

            if (age>19 && age<=40){
                System.out.println("You are young.");
            }

            if (age>40 && age<=60){
                System.out.println("Wish your long life.");
            }

            else{
                System.out.println("Old Man");
            }

        }catch (Exception E){

        }
    }
}
