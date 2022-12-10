package chapter5;

public class J05_13 {
    public static void main(String arg[]) {

        //Displaying pascal'S Triangle Series Using Combination Rules

        for (int i = 0; i <= 8; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print(C(i, j) + "\t");
            System.out.println();
        }
    }

    static long C(int x, int y) {
        return P(x, y) / F(y);
    }
    static long P(int x, int y) {
        long P = 1;
        for (int i = 0; i < y; i++) {
            P = P * x;
            x--;
        }
        return P;
    }

    static long F(int z) {
        long f = 1;
        while (z > 1) {
            f = f * z;
            z--;
        }
        return f;
    }
}
