package chapter6;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class J06_15 {
    public static void main(String arg[]){

        int matrix1[][] = new int[3][3];
        int matrix2[][] = new int[3][3];
        int matrix3[][] = new int[3][3];
        int i, j, k;
        String s1[] = new String[9];
        String s2[] = new String[9];
        int temp1[] = new int[9];
        int temp2[] = new int[9];

        try {
            System.out.println("Element of Matrix1 (9 integer element) : ");
            for (i = 0; i < 9; i++){
                BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
                s1 [i] = BR.readLine();
                temp1 [i] = Integer.parseInt(s1[i]);
                for (j = 0; j < 3; j++){
                    for (k = 0; k < 3; k++){
                        matrix1[j][k] = temp1[i];
                    }
                }
            }

            System.out.println("Enter Element of Matrix2 (9 integer elements) : ");
            for (i = 0; i < 9; i++){
                BufferedReader BR = new BufferedReader(new InputStreamReader(System.in));
                s2 [i] = BR.readLine();
                temp2 [i] = Integer.parseInt(s2[i]);
                for (j = 0; j < 3; j++){
                    for (k = 0; k < 3; k++){
                        matrix2 [j][k] = temp2[i];
                    }
                }
            }
        }

        catch (Exception e){
            System.out.print("Error in input! program terminated.");
            System.exit(0);
        }

        System.out.println("Element of the Matrix1 is : ");
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Element of the Matrix2 is : ");
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                matrix3[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Addition of the Matrices is : ");
        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                System.out.print(matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }

}