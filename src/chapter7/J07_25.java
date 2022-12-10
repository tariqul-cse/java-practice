package chapter7;

public class J07_25 {
    public static void main(String arg[]){
        String string1;
        string1 = new String("Tariqul Islam");
        System.out.println("string1 is: " + string1);
        string1 = string1.replace('a', 'u');
        System.out.println("After Replacing 'a' by 'u' ");
        System.out.println("string1 is: " + string1);
    }
}
