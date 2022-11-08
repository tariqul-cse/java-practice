package chapter3;

public class J03_14 {
    public static void main(String arg[]){

        /*Example of Cast Operator*/

        int x;
        int y;
        x= 11;
        y= 5;

        System.out.println("X = " +x);
        System.out.println("Y = " +y);
        System.out.println("Without Casting- x/y = " + x/y);        //Without Casting
        System.out.println("After Casting- x/(float) " + x/(float)y);   //Casting int type to float type
    }
}
