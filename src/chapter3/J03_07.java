package chapter3;

public class J03_07 {
    public static void main(String arg[]){

        /*ERROR IN RUNNING*/

        byte Value1 = 100;     // 1000 Illegal Assigning
        short Value2 = 10000;  //100000 Illegal Assigning
        //short Mul;            //Illegal Assigning
        int Mul;
        Mul = Value1*Value2;

        System.out.println("Value1 : " + Value1);
        System.out.println("Value2 : " + Value2);
        System.out.println("Mul : " + Mul);
    }
}
