package chapter6;

public class J06_12 {
    public static void main(String  arg[]){

        float mark [] [] = new float[3][3];

        mark [0] [0] = 64.5f;
        mark [0] [1] = 75;
        mark [0] [2] = 64;

        mark [1] [0] = 74;
        mark [1] [1] = 74;
        mark [1] [2] = 66;

        mark [2] [0] = 67;
        mark [2] [1] = 85.5f;
        mark [2] [2] = 34;

        System.out.println("Elements of the Matrix is : ");
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(mark [i] [j] + " ");
            }

            System.out.println();
        }
    }
}
