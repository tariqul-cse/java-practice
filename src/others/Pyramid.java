package others;

public class Pyramid {
    public static void main(String arg[]) {
        for (int i = 0; i <= 5; i++) {           //i=0,              1
            for (int j= 0; j<= 5 - i; j++){       //j=0,1,2,3,4       0,1,2,3
                if (j == 5-i)
                    System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
