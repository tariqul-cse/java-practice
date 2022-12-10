package chapter7;

public class J07_07 {
    public static void main(String arg[]){

        String s1, s2, s3, s4;

        s1 = new String("Java");
        s2 = new String("Programming");
        s3 = "Welcome to " + s1 +" " + s2;
        System.out.println(s3);
        s4 = s3;
        System.out.println(s4);
    }
}
