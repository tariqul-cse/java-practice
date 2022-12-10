package chapter6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J06_09 {
    public static void main(String arg[]){

        int roll [] = new int[5];
        String s [] = new String[5];

        try {
            for (int i = 0; i < 5; i++){
                System.out.print("Enter Roll["+i+"]: ");
                BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
                s [i] = BR.readLine();
                roll [i] = Integer.parseInt(s[i]);
            }

        } catch (IOException e) {
            e.printStackTrace();
            System.out.print("Enter in input! program terminated.");
            System.exit(0);
        }
        System.out.print("\nGiven List of Roll  is: ");
        for (int i = 0; i < 5; i++){
            System.out.print(""+roll[i] + " ");
        }
        System.out.print("\nSorted List of Roll is: ");
        for (int i = 0; i < 5; i++){
            for (int j = i+1; j < 5; j++){

                if (roll [i] > roll [j]){
                    int temp = roll [i];
                    roll [i] = roll [j];
                    roll [j] = temp;
                }
            }
        }
        for (int i = 0; i < 5; i++){
            System.out.print("" +roll[i] + " ");
        }
    }
}
