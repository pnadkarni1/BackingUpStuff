//
//WordFinder Class:
//        Create the dict (dictionary) and word (random word) variable
//        Initialize both variables in the constructor
//        Make the word the random word by using the .randWord() method
//        If .showWord() return word

//        GoodWord Method:
//        Make a builderWord - Stringbuilder of the randomWord and builderTest - Stringbuilder of the parameter
//        If the builderWord is the same as the random Word return false
//        If the word is a repeated word using .contains()  == false, return false
//        For Loop:
//        Make a string for a single letter in the loop (i, i + 1)
//        See if the single letter is in the builderWord using .indexOf()
//        If the number of the .indexOf is -1 return false
//        Else, .deleteCharAt the index go through the loop
//        If made out of the loop return true
//        WordFinder Class:

//        Set the word
//
//        WordyScramble Class:
//        Ask the user if they want to play the game (Y or N),
//        If Y then show rules and entire while loop

//        While Loop:*
//        Make variables for all the Class(MyTimer,WordFinder,Dictionary)
//        Set the random word size
//        Set round counters to 0
//        When they type a line then set the timer and run

//        While loop (until the timer ends):
//        Show the random Word
//        Wait until user enters the word they think is a word
//        If both the goodWord and .contains() == false (repeat check):
//        Tell them it is a valid word
//        Make word counter ++
//        Make totalPoints add the word length
//        Make roundPoints add the word length
//        Make total number of words ++
//        .addWord() method so they cannot repeat
//        If checks fail then check if it is a repeated word if so tell user
//        Else print the word is invalid

//        After .check() == false
//        Tell user round has ended
//        Show the user the correct words they typed
//        Show how many words they got
//        Show how many points they got
//        Ask if they would like to play again (Y or N)
//        If yes repeat While loop with the *

//        If N:
//        Set a average word to divide totalWords and totalRounds
//        Set a average points to divide totalPoints and totalRounds
//        Show how many rounds they played
//        Show how many words they typed total
//        Show many points they got total
//        Show average words and points from all the rounds
//


import java.util.Scanner;

public class WordyScramble {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);



        System.out.println("Would you like to play a game? (Y or N)");
        String yes = scan.nextLine();
        if (yes.equals("Y")) {
            System.out.println("Here is your game:");
            System.out.println();
            System.out.println("For each word we have 1 minute to guess as many words as we can.");
            System.out.println("The words we guess must come from the letters of the displayed word.");
            System.out.println("Each letter from the original word can only be used once in the guessed word.");
            System.out.println("Each guessed word also must be a valid word (in the dictionary or at least the dictionary file we have)");
        }


        String userWord = "";
        int counter = 0;
        int numOfRounds = 0;
        int totalPoints = 0;
        int roundPoints = 0;
        int totalNumOfWords = 0;

        while (yes.equals("Y")) {
            WordFinder f = new WordFinder("dictionary.txt");
            MyTimer t = new MyTimer();
            Dictionary dict = new Dictionary ();
            f.nextWord(6);
            String word = f.showWord();
            numOfRounds++;
            counter = 0;
            roundPoints = 0;


            System.out.println("Enter anything to start your timer, after you enter a line, your time starts");
            scan.nextLine();
            t.set(60000);
            t.start();
            while (t.check()) {

                System.out.println("Your word is " + word);
                userWord = scan.nextLine();

                if (f.goodWord(userWord) && dict.contains(userWord) == false) {
                    System.out.println(userWord + " is a valid word");
                    counter++;
                    totalPoints = totalPoints + userWord.length ();
                    roundPoints = roundPoints + userWord.length ();
                    totalNumOfWords++;
                    dict.addWord(userWord);


                } else {

                    if (dict.contains(userWord)) {

                        System.out.println("That is a repeated word");

                    }else {

                        System.out.println(userWord + " is Invalid");
                    }

                }


            }

            System.out.println("The Round has ended");
            System.out.println();
            System.out.println("Here are your words:");

            System.out.println(dict.toString ());

            System.out.println("You found " + counter + " Words");
            System.out.println("You earned " + roundPoints + " Points");

            System.out.println("Would you Like to play again? (Y or N)");
            yes = scan.nextLine();


        }//end of while

        double aveWords = (double) totalNumOfWords / (double) numOfRounds;
        double avePoints = (double) totalPoints / (double) numOfRounds;

        System.out.println("Ok, you played " + numOfRounds + " Rounds");
        System.out.println("You found " + totalNumOfWords + " Words");
        System.out.println("You got " + totalPoints + " Points");
        System.out.println("You averaged " + aveWords + " Words");
        System.out.println("You averaged " + avePoints + " Points");


    }//end of main
}
