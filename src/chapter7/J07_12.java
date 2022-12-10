package chapter7;

public class J07_12 {
    public static void main(String arg[]){

        String name;
        name = new String("Tariqul Islam");
        System.out.println("In the string: " + name);

        int l = name.length();
        for (int i = 0; i < l; i++){
            char ch = name.charAt(i);
            System.out.println("Character at '" + i + "' is : " + ch);
        }
    }
}
