package chapter6;

public class J06_16 {
    final static int row = 10;
    final static int col = 10;
    public static void main(String arg[]){

        int r, c, i, j;
        int mul [] [] = new int[row][col];
        System.out.print("\t\t==================================\n");
        System.out.print("\t\t\t   MULTIPLICATION TABLE\t\n");
        System.out.print("\t\t==================================\n");
        for (j = 1; j <= 10; j++){
            System.out.print("\t" +j);
        }
        System.out.print("\n==================================================");
        System.out.println();

        for (i = 0; i < row; i++){
            r = i+1;
            System.out.print("  " +r +" | ");

            for (j = 0; j < col; j++){
                c = j+1;
                mul[i][j] = r*c;
                System.out.print("\t " +mul[i][j]);
            }
            System.out.println();
        }

    }
}
