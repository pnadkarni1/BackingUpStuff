
import java.util.Scanner;
import java.util.Random;

public class IronRaids {

    public static void main (String [] args ) {

        //Iron 1

        Scanner userInput = new Scanner (System.in);

        System.out.println("Are you choosing even or odd?");
        String userEvenOdd = userInput.nextLine ();

        if (evenOrOdd (userEvenOdd).equals ("Won")) {

            System.out.println("You have won!");

        }else {

            System.out.println("You have lost.");

        }

        Random random = new Random ();


        int rand = random.nextInt (50) + 11;

        //Iron 2

        System.out.println("Guess a number and try to get it greater than the computer number (Max is 50 and Min is 11).");
        int scan = userInput.nextInt ();

        while (scan < rand) {

            System.out.println("You have lost.");
            break;
        }

        while (scan > rand) {

            System.out.println("You have won!");
            break;
        }

        System.out.println("Guess a number, try to get it smaller than the computer number");
        scan = userInput.nextInt ();

        while (scan < rand) {

            System.out.println("You have won!");
            break;
        }

        while (scan > rand) {

            System.out.println("You have lost.");
            break;
        }

        System.out.println("The computer number was " + rand);


    }


    public static String evenOrOdd (String userEvenOdd) {
        
        Scanner userInput = new Scanner (System.in);
        Random random = new Random ();


        int randomNum = random.nextInt (2) + 1;
        String wonLost = "0";

        System.out.println("Enter a number, 1 or 2.");
        int userNum = userInput.nextInt ();

        if (userNum == 1 || userNum == 2){


            randomNum = randomNum + userNum;

            if (randomNum == 2){

                if (userEvenOdd.equals ("Even") || userEvenOdd.equals ("even")){

                    wonLost = "Won";

                }

            }if (randomNum == 3){

                if (userEvenOdd.equals ("Odd") || userEvenOdd.equals ("odd")){

                    wonLost = "Won";

                }

            }if (randomNum == 4){

                if (userEvenOdd.equals ("Even") || userEvenOdd.equals ("even")){

                    wonLost = "Won";

                }

            }

        }


        return wonLost;

    }

}
