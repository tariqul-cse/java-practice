package chapter3;

public class J03_10 {
    public static void main(String arg[]){

        /*Program Giving incorrect result*/

        short year = 10;
        int lightSpeed = 186000;
        long distance = year*365*24*60*60*lightSpeed;

        System.out.println("This is incorrect result.....");
        System.out.print("In " + year + " Years " );
        System.out.print("light will travel about " );
        System.out.println(distance + " miles " );


    }
}
