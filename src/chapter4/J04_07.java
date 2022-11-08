package chapter4;

public class J04_07 {
    public static void main(String arg[]){

        /*Example of Logical Operations*/

        boolean a = true, b = true, c = false,result;
        System.out.println("a = " +a + "\t b = " + b + "\t c = "+c);
        result = a && b || c;
        System.out.println("a && b || c = " + result);
        result = a || b && c;
        System.out.println("a || b && c = " + result);
        result = a && !a;
        System.out.println("a && !a = " + result);
        result = a || !a;
        System.out.println("a || !a = " + result);
        result = c && !c;
        System.out.println("a && !c = " + result);
        result = c || !c;
        System.out.println("c || !c = " + result);

    }
}
