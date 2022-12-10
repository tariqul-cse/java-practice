package others;

public class Pattern_06 {
    public static void main(String arg[]){

        for(int i = 1; i <= 5; i= i+2){

            for(int j = 1; j <= i/2; j++){

                System.out.print("  ");
            }
            for(int k = 5; k >= i; k--){

                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
