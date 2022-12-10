package chapter4;

public class J04_08 {
    public static void main(String arg[]){

        /*Example of Logical Operations*/

        int op1 = 5, op2 = 10;
        int bitwiseOR, bitwiseAND;
        int lsvalue, rsvalue, rszerofile;
        bitwiseOR = op1 | op2;
        bitwiseAND = op1 & op2;
        System.out.println("Bitwise OR of " + op1 + " and " + op2 + " is : " + bitwiseOR);
        System.out.println("Bitwise AND of " + op1 + " and " + op2 + " is : " + bitwiseAND);

        lsvalue = op2 << 2;
        System.out.println("2 times left shift of " + op2 + " is : " + lsvalue);

        rsvalue = op2 >> 2;
        System.out.println("2 times right shift of " + op2 + " is : " + rsvalue);

        rszerofile = op2 >>> 2;
        System.out.println("2 times right shift with zero fill of " + op2 + " is : " + rszerofile);
    }
}
