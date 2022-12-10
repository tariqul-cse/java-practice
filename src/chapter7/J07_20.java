package chapter7;

public class J07_20 {
    public static void main(String arg[]){
        String string1, string2;
        string1 = new String("Object Oriented");
        string2 = new String("Programing");
        System.out.println("string1 is: " + string1);
        System.out.println("string2 is: " + string2);
        string1 = string1.concat(" ");
        string1 = string1.concat(string2);
        System.out.println("Now string1: " + string1);
        System.out.println("And string2: " + string2);
    }
}
