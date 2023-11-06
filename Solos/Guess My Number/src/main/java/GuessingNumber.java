


//Design Plan:
//        Main Method:
//        1. Import Both Scanner and Random
//        a) Initialize both
//        2. Ask the user if they would like to play the game then get back response
//        3. If the user said “Yes” or “yes” move to if statement, else end
//        a)Make both random numbers using Math.random and the random Object
//        b)Get the sum of both of those numbers
//        c)Ask the user for the Password
//        d)Call the verifyPassword Method, if returns Correct then, else end
//        e)Print the Random Numbers, then ask user for the sum
//        f)Call the correctGuess Method, if it return 3 then
//        g)Print out the user has won
//        h)If correctGuess Method did not return 3 then
//        i)Print out the Computer has won
//        verifyPassword Method:
//        1.  Initialize the Scanner
//        2. Make a variable that hold if the answer is Correct
//        3. If the users Input is the right password
//        a)Print out that the user has the right password
//        b)Make variable Correct
//        4. Else
//        a)Tell the user that the password is incorrect and to give another password
//        b)If the user is then right
//        c)make the variable Correct
//        d)Else
//        e)Print out the user is incorrect and has exceeded the password limit
//        f) Make variable no
//        5. Return variable that holds if the answer is Correct
//        correctGuess Method:
//        1. Make variable holding if the user has the correct guess
//        2. If the users Guess is equal to the right answer
//        a)Make the variable 3
//        b)Return the variable

import java.util.Scanner;
import java.util.Random;

public class GuessingNumber {
    public static void main(String [] args) {

        Scanner userInput = new Scanner (System.in);
        Random random = new Random ();

        System.out.println("Would you like to guss my number");
        String userYes = userInput.nextLine();

        while (userYes.equals ("Yes") || userYes.equals ("yes")) {

            int objectNum = random.nextInt(5) + 1;
            int randomNum = (int) (Math.random () * 7) + 1;
            int numSum = objectNum + randomNum;



            System.out.println("Please, enter the password:");
            String userPassword = userInput.nextLine ();

            if (verifyPassword (userPassword).equals ("Correct")) {

                System.out.println("Please guess the sum of " + objectNum + " and " + randomNum  + " :");
                int userGuess = userInput.nextInt ();

                if (correctGuess (numSum, userGuess) == 3) {

                    System.out.println("You have won!");


                }else {

                    System.out.println("The computer has won");

                }

            }

            System.out.println("Would you like to play again?");
            userYes = userInput.nextLine();

        }

        System.out.println("Have a good day");

    }

public static String verifyPassword (String userPassword) {
        Scanner userInput = new Scanner (System.in);
        String pasCorIn = "no";

        if (userPassword.equals ("floo powder")) {

            System.out.println("That is correct");
            pasCorIn = "Correct";

        }else{

            System.out.println("That is incorrect, please enter again:");
            String userPas = userInput.nextLine ();

            if (userPas.equals ("floo powder")) {

                System.out.println("That is correct");
                pasCorIn = "Correct";

            }else {

                System.out.println("Unfortunately you have used up all of your tries");
                pasCorIn = "no";

            }

        }

        return pasCorIn;

}

public static int correctGuess (int numSum, int userGuess) {

        int guessInCor = 0;

        if (numSum == userGuess) {

            guessInCor = 3;

        }


        return guessInCor;

}

}
