package chapter7;

public class J07_18 {
    public static void main(String arg[]){
        String string1, string2;
        string1 = new String("Tariqul Islam");
        string2 = new String("Masud Rana");
        System.out.println("String1 is: " + string1);
        System.out.println("String2 is: " + string2);
        int i = string1.compareTo(string2);
        if (i == 0){
            System.out.println("String2 and String1 are equal");
        }
        else if (i < 0){
            System.out.println("String1 is less then String2");
        }
        else if (i > 0){
        System.out.println("String1 is greater than String2");
        }
    }
}
