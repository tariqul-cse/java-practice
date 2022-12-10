package chapter6;

public class J06_13 {
    public static void main(String arg[]){

        float mark [] [] = {{34.5f, 56, 75.5f}, {55.6f, 87, 80}, {57, 60, 70}};
        int i, j;
        System.out.println("Elements of the Matrix is : ");

        for (i = 0; i < 3; i++){
            for (j = 0; j < 3; j++){
                System.out.print(mark [i][j] + " ");
            }
            System.out.println();
        }
    }
}
