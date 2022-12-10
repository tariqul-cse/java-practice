package chapter7;

public class J07_21 {
    public static void main(String arg[]){
        StringBuffer s1, s2;
        s1 = new StringBuffer("I Object Oriented Programming");
        System.out.println("s1 is: " + s1);
        s2 = new StringBuffer("Love ");
        s1 = s1.insert(2,s2);
        System.out.println("Now s1: " + s1);
    }
}
