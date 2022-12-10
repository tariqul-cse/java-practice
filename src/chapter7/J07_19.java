package chapter7;

public class J07_19 {
    public static void main(String arg[]){
        String string1, string2;
        string1 = new String("Tariqul Islam");
        string2 = new String("tariqul islam");
        System.out.println("string1 is:" + string1);
        System.out.println("string2 is:" + string2);
        boolean i = string1.equalsIgnoreCase(string2);
        if (i = true){
            System.out.println("string2 and string2 are equal");
        }else {
            System.out.println("string2 and string2 are not equal");
        }

    }
}
