import java.util.Scanner;

public class IronAll {

    public static void main(String []args) {

        //iron 1

        String name = "Pranate";
        String song = "Legend by the Score";

        System.out.println("Hello my name is " + name + " and my favorite song is " + song);

        //iron 2

        int favNum = 14;

        System.out.println("My Number is 14");

        if (favNum % 2 == 0) {

            System.out.println("Number is Even");


        }else {

            System.out.println("Number is Odd");
        }//end of if/else

        int numCel = 23;

        double numFah = (numCel * 1.8) + 32;

        int intValue = (int) numFah;


        System.out.println("Did you know that " + numCel + " degrees Celsius is " + intValue + " degrees Fahrenheit");


        //iron 3

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a Number");
        int userNum = userInput.nextInt ();
        System.out.println("Enter another number");
        int userNumb = userInput.nextInt ();

        int numFin = userNum - userNumb;

        System.out.println(numFin + " is your final number.");

    }//end of main
}//end of class
