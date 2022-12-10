package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J06_11 {
    public static void main(String arg[]){

        char base16[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        int numtoconvert = 0;
        int convertednum [] = new int[64];
        int originalnum, index, base = 0, nextdigit;
        index = 0;
        String s1,s2;

        try {
            System.out.print("Enter a Decimal Number to be Converted: ");
            BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
            s1 = BR.readLine();
            numtoconvert = Integer.parseInt(s1);
            originalnum = numtoconvert;
            BB:
            for ( ; ; ){
                System.out.print("Enter Base for Conversion (2 or 8 or 10 or 16): ");
                s2 = BR.readLine();
                base = Integer.parseInt(s2);

                /*if ((base! = 2) && (base! = 8) && (base! = 10) && (base! = 16))
                    continue BB;
                else
                    break BB;*/
            }
        }

        catch (IOException e) {
            e.printStackTrace();
            System.out.print("\nError in input! program terminated");
            System.exit(0);
        }
        /*while (numtoconvert! = 0){
            convertednum[index] = numtoconvert % base;
            ++index;
            numtoconvert = numtoconvert/base;
        }*/
        index = index - 1;
        System.out.print("\nThe Equivalent Number in Base "+ base +" is:" );
        /*while (index > = 0){
            nextdigit = convertednum[index];
            System.out.print("Base16 [NextDigit]");
            --index;
        }*/
        System.out.println();
    }
}
