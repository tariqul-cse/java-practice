package chapter3;

public class J03_09 {
    public static void main(String arg[]){

        /*Using long type Variable*/

        long Year = 10;
        long LightSpeerd = 186000;
        long Distance = Year*365*24*60*60*LightSpeerd;

        System.out.print("In " + Year + " Years " );
        System.out.print("light will travel about " );
        System.out.println(Distance + " miles " );
    }
}
