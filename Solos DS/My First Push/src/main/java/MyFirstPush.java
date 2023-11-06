public class MyFirstPush {

    public static void main(String[] args) {

        System.out.println("Just keep swimming.");

        int total = 87;
        int number = 11;
        double doubleAvg;
        int intAvg;

        doubleAvg = ((double) total) / number; //floating point divison will show decimal place
        intAvg = total / number; //integer division will truncate the decimal, will not round

        System.out.println("The double avergae is: " + doubleAvg);
        System.out.println("The interger average is: " + intAvg);

        int value1 = 7 + 8 * 5; //default precedent
        int value2 = (7 + 8) * 5; // cange precendet with parenthesis

        System.out.println("Value1 is " + value1);
        System.out.println("Value2 is " + value2);

        System.out.println("Make your lives extraordinary.");



    }//end of main

}// end of class
