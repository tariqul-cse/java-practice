package others;

public class Result {
    public static void main(String arg[]) {
        System.out.println(grade(4.00));
        System.out.println(grade(3.75));
        System.out.println(grade(3.50));
        System.out.println(grade(3.25));
        System.out.println(grade(3.00));
        System.out.println(grade(2.75));
        System.out.println(grade(2.50));
        System.out.println(grade(2.00));

    }

    private static String grade(double x) {

        if (x >= 4.00) {
            return "A+";
        }
        if (x >= 3.75) {
            return "A";
        }
        if (x >= 3.50) {
            return "A-";
        }
        if (x >= 3.25) {
            return "B+";
        }
        if (x >= 3.00) {
            return "B";
        }
        if (x >= 2.75) {
            return "B-";
        }
        if (x >= 2.25) {
            return "C+";
        }
        if (x >= 2.00) {
            return "D";
        } else {
            return "F";
        }

    }

}
