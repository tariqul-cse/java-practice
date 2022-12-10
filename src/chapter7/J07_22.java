package chapter7;

public class J07_22 {
    public static void main(String arg[]){
        StringBuffer s1;
        s1 = new StringBuffer("I Object Oriented Programming");
        System.out.println("s1 is: " + s1);
        int pos = s1.indexOf("Object");
        s1 = s1.insert(pos,"Love ");
        System.out.println("Now s1: " + s1);
    }
}
