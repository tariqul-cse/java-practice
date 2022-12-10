package chapter7;

public class J07_29 {
    public static void main(String arg[]){
        int n = 34;
        System.out.println("In String   System N: " + Integer.toString(n));
        System.out.println("In Decimal  System N: " + n);
        System.out.println("In Binary   System N: " + Integer.toBinaryString(n));
        System.out.println("In Octal    System N: " + Integer.toOctalString(n));
        System.out.println("In Hex.     System N: " + Integer.toHexString(n));
    }
}
