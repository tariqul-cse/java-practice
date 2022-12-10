package chapter7;

public class J07_14 {
    public static void main(String arg[]){
        String string1;
        string1 = new String("Tariqul Islam");
        System.out.println("In the string: " + string1);
        int p1 = string1.indexOf('r');
        System.out.println("First occurance of 'r' is at position: " + p1);
        p1 = string1.indexOf("Tariqul");
        System.out.println("Position of 'Tariqul' is also: " + p1);
        int p2 = string1.indexOf('I', 5);
        System.out.println("After First 5 Characters occurance of 'i' is at position: " + p2);
    }
}
