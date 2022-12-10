package chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_03 {
    public static void main(String args[]) {

        //Example of else if Statement

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

            else if (age>0 && age<=12){
                System.out.println("You are a child");
            }

            else if (age>12 && age<=19){
                System.out.println("You are a teen ager.");
            }

            else if (age>19 && age<=40){
                System.out.println("You are young.");
            }

            else if (age>40 && age<=60){
                System.out.println("Wish your long life.");
            }

            else{
                System.out.println("Old Man");
            }
        }catch (Exception E){

        }
    }
}
