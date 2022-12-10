package chapter7;

public class J07_13 {
    public static void main(String arg[]){

        StringBuffer s;
        s = new StringBuffer("Object Oriented");
        System.out.println("The sting is: " + s);
        s.setCharAt(6, '-');
        System.out.println("Now the string is: " + s);
    }
}
