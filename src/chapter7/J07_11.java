package chapter7;

public class J07_11 {
    static String name [] = {"Tariqul Islam", "Student of", "Bangladesh University"};

    public static void main(String arg[]){

        for (int i = 0; i < 3; i++){
            int l = name[i].length();
            System.out.println("Name["+ i + "] = "+ name[i]+"\t Length = " + l);
        }
    }
}
