package others;

public class Pattern_03 {
    public static void main(String arg[]){
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 3; j++){
                if (i>j)
                    System.out.print("  ");
                else
                    System.out.print("* ");
                if (j>i)
                    System.out.print("* ");
            }

            System.out.println();
        }
    }
}
