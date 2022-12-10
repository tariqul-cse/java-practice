package chapter7;

public class J07_28 {
    public static void main(String arg[]){
        StringBuffer s1;
        String s2;
        s1 = new StringBuffer("Object Oriented Programming");
        s2 = new String(s1.toString());
        System.out.println("The string buffer object is: " + s1);
        System.out.println("Corresponding string object is: " + s2);
    }
}
