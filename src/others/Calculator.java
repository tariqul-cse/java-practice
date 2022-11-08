package others;

public class Calculator {
    public static void main(String[] arg){
        System.out.println("value of sum = " + sum(520,159));
        System.out.println("value of subtract = " + subtract(520, 159));
        System.out.println("value of multiply = " + multiply(520, 159));
        System.out.println("value of division = " + division(520, 159));
        System.out.println("value of square = " + square(520));
        System.out.println("value of qulee = " + cube(520));
        System.out.println("value of pow = " + pow(520));

//        sum(520, 159);
//        subtract(520,159);
//        multiply(520,159);
//        division(520,159);

    }


    public static int sum(int x, int y){
        return (x+y);
    }
    public static int subtract(int x, int y){
        return (x-y);
    }
    public static int multiply(int x, int y){
        return (x*y);
    }
    public static double division(int x, int y){
        return (x/y);
    }
    public static int square(int x){
        return (x*x);
    }
    public static int cube(int x){
        return (x*x*x);
    }
    public static int pow(int x){
        return (x*x*x*x);
    }


//    private static void sum(int x, int y) {
//        int sum = x+y;
//        System.out.println("value of sum = " + sum);
//    }
//    private static void subtract(int x, int y){
//        int subtract = x-y;
//        System.out.println("value of subtract = " + subtract);
//    }
//    private static void multiply(int x, int y){
//        int multiply = x*y;
//        System.out.println("value of multiply = " + multiply);
//
//    }
//    private static void division(double x, double y){
//        double division = x/y;
//        System.out.println("value of divison = " + division);
//    }
}
