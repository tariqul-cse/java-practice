package chapter5;

public class J05_12 {
    public static void main(String arg[]) {

        //Calculating permutation series

        int i, j;

        for (i = 5; i >= 1; i--) {
            for (j = i; j >= 1; j--) {
                System.out.print(" p(" + i + "," + j + ") = ");
                System.out.print(p(i, j) + " \t");
            }

            System.out.println("");
        }
    }
        static long p(int x, int y){
            return F (x)/F(x-y);
        }

        static long F(int z){
            long f = 1;
            while (z>1) {
                f = f * z;
                z--;
            }
            return f;
        }
}
