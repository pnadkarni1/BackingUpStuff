public class MyFirstPush {
    public static void main(String[] args) {

        System.out.println("You Had me at \"hello\"");

        int total = 87, number = 10;
        double doubleAve;
        int intAve;

        doubleAve = ((double)total)/number; // floating point division
        intAve = total/number;        // integer division

        System.out.println("The double average is" + doubleAve);
        System.out.println("The integer average is" +intAve);

        int value1 = 3 + 4 * 5; // default precedent
        int value2 = (3+4) * 5; // change precedent with parens
        System.out.println("Value is" + value1);
        System.out.println("Value is" + value2);

        System.out.println ("Louis, I think this is the beginning ouf a beautiful friendship");


    }
}//end of class
