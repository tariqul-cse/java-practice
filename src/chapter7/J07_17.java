package chapter7;

public class J07_17 {
    public static void main(String arg[]){
        StringBuffer s1, s2;
        s1 = new StringBuffer("Computer Science");
        System.out.println("The string is: " + s1);
        s2 = new StringBuffer("Student of Bangladesh University");
        System.out.println("The String is: " + s2);
        s1 = s1.reverse();
        s2 = s2.reverse();
        System.out.println("The String is reverse order is: " + s1);
        System.out.println("The String is reverse order is: " + s2);
    }
}
