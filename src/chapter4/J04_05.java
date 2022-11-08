package chapter4;

public class J04_05 {
    public static void main(String arg[]){

        /*Example of Arithmetic Operation*/

        int a = 10, b = 15, c = 20;
        float d;
        int result;
        d = (float)b/(float)a;
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
        System.out.println("Division: b/a = " +d);

        result = b % a;
        System.out.println("\nModulo: b % a = " + result);
        result = a*b+c;
        System.out.println("\nExpression: a*b+c " +result);
        result = a+b*c;
        System.out.println("\nExpression: a+b*C " +result);

    }
}
