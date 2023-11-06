
import java.util.Scanner;

public class BronzeRaids {

    public static void main (String [] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a word to see if its first letter has a capital.");
        String userWord = userInput.nextLine ();

        if (firstLetterCapital (userWord) == 1) {

            System.out.println("Word does start with a capital letter in it");

        }else {

            System.out.println("Word does not start with a capital letter in it");

        }

    }

    public static int firstLetterCapital (String userWord) {

        char firstLetter2 = userWord.charAt (0);

        String firstLetter = Character.toString (firstLetter2);

        int correctOrInc = 0;

        int num = firstLetter.compareTo ("A");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }
        num = firstLetter.compareTo ("B");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("C");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("D");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("E");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("F");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("G");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("H");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("I");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("J");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("K");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("L");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("M");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("N");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("O");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("P");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("Q");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("R");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("S");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("T");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("U");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("V");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("W");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("X");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("Y");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }num = firstLetter.compareTo ("Z");

        if (num == 0) {

            correctOrInc = 1;
            return correctOrInc;
        }


        return correctOrInc;
    }

}
