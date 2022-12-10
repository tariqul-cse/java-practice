package chapter5;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J05_07 {
    public static void main(String arg[]){

        //Example of for loop

        int i = 0, n = 0, sum = 0;
        String s;

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter value of N (>=1): ");
            s = br.readLine();
            n = Integer.parseInt(s);
            System.out.print("N     1+2+3+.....+ N");
            System.out.print("--------------------:");

            for (i = 1; i <= n; i++){
                sum = sum + i;
                System.out.print(" "+i +" \t\t" + sum);

            }


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
