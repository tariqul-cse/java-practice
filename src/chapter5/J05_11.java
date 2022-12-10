package chapter5;

public class J05_11 {
    public static void main(String arg[]){

        int i = 0, j = 0;
        System.out.println("Serise of prime number upto 25 is:");
        for (i = 5; i>=1; i--){

            for (j = 1; j<= i; j++){
                //System.out.print(j+" ");
                if (j==5){
                    System.out.print("* ");

                }else System.out.print("- ");

            }
            System.out.println(" ");
        }
    }
}
