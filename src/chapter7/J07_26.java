package chapter7;

public class J07_26 {
    public static void main(String arg[]){
        String s;
        s = new String("Bangla!");
        StringBuffer SB;
        SB = new StringBuffer("Welcome to Java in ");
        s = SB.append(s).toString();
        System.out.println(s);
    }
}
