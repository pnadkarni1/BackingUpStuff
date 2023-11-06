//
//ShufflerCheck Class:
//        - make instance variable for PickWord Class
//        - make getter for pickWord object
//        - make setter for pickWord object
//        howDifferent Method:
//        - make variables for the number of different letters and a holder int
//        - make a variable for scramWord as StringBuilder
//        - for loop, while i is less than the unscrambled Word length i++
//        - make single letter from the unscrambled word
//        - inside for loop
//        - make single letter from scrambled word
//        - compare both letters to each other
//        - if true then delete both letters and break from inside loop
//        - if false make holder ++
//        - end of inside loop
//        - if holder > 0 then number of different letters++
//        - end of for loop
//        - return number of different letters
//        isSameWord Method:
//        - put both scram word and unscram word into howDifferent Method
//        - if output is 0, return true
//        - else return false
//        ShufflerRunner Class:
//        - Make shufflerCheck variable
//        - Make pickWord variable
//        - Ask user how many word pairs they would like to compare
//        - while loop
//        - get both scram and unscram word
//        - Print out to the user the 2 words
//        - Tell the user how many letters are different
//        - if isSameWord is true
//        - print out the word is same
//        - else print out the word is different
//        - Print out the sum Of the same Words, sum of different letters, the average
//
//



import java.util.Scanner;

public class ShufflerRunner {

    public static void main(String [] args) {

        ShufflerCheck shuffler = new ShufflerCheck ();
        PickWord pickWord = new PickWord ();
        Scanner userInput = new Scanner (System.in);


        System.out.println("How many word do you wish to compare");
        int numOfWord = userInput.nextInt ();
        int counter = 0;
        int sumOfSameWord = 0;
        int sumOfDifLetters = 0;

        while (numOfWord > counter){

            String unscramWord = pickWord.getUnscrambledWord ();
            String scramWord = pickWord.getScrambledWord ();
            System.out.println();
            System.out.println("The 2 Word chosen are:");
            System.out.println("Unscrambled Word: " + unscramWord);
            System.out.println("Scrambled Word: " + scramWord);
            System.out.println("The Number of different letters are " + shuffler.howDifferent (unscramWord, scramWord));

            sumOfDifLetters = sumOfDifLetters + shuffler.howDifferent (unscramWord, scramWord);

            if (shuffler.isSameWord (unscramWord, scramWord) == true) {

                System.out.println("The 2 words are the same");
                sumOfSameWord++;

            }else {

                System.out.println("The 2 words are different");

            }

            counter++;

        }

        int averageDif = sumOfDifLetters / numOfWord;

        System.out.println();
        System.out.println("There were " + sumOfSameWord + " same Words");
        System.out.println("There was " + sumOfDifLetters + " total different letters");
        System.out.println("The average letter difference was " + averageDif);

    }//end of main
}//end of class
