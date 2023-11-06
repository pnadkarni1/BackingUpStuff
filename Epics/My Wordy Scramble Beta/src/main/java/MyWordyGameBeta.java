
//Design Plan:
//
//        Player Class:
//
//        Make instance variables ID, password, rounds, points, wordsFound
//        Make Player constructor 1 taking in name parameter
//        Set variables to default except for name
//        Make Player constructor 2 taking in all instance variables parameters
//        Set variables to parameters
//        Make setters and getters for instance variables
//        Add points, add words, and add rounds are set methods
//        To String: if rounds is != 0 do average else make average 0
//
//        PlayerList Class:
//
//        Import List, readers and writers, and exceptions
//        Make ArrayList instance variable
//        Make PlayerList Constructor taking in file name as parameter
//        Initialize List
//        Try-catch:
//        Read in new line while not null
//        Split by “,”
//        Set new made variables to array index
//        Add player to list
//        Add player:
//        Check if player is null; if null then return false
//        Check if name is not in list then return true, else false
//        ContainsID:
//        Make loop that checks playerList names in order if found then return true if made out of loop return false
//        Authenticate:
//        Loop checks if name is there; if there then check password with the parameter the user put in; if not correct move through loop else return player; if made out of loop return null
//        Save List:
//        Try catch- loop through list and call all things and separate with “,”
//        To String:
//        Make string start with list size “\n”
//        For loop get .toString () for each player
//        Add all points, rounds, words
//        Print out total things and all players toString()
//
//        MyWordyScrambleBeta:
//
//        Make instance PlayerList variable
//        Initialize all classes
//        Show game
//        Enter while loop:
//        Ask user for password:
//        If New move to new player method:
//        If quit leave game
//        Ask user for name and then password
//        If authenticate is false ask 2 more times or until they get it right
//        If they get it right before 2 times move to game
//        Else move to new player then game
//        Game: Make variables for all the Class(MyTimer,WordFinder,Dictionary)
////        Set the random word size
////        Set round counters to 0
////        When they type a line then set the timer and run
//
//
////        While loop (until the timer ends):
////        Show the random Word
////        Wait until user enters the word they think is a word
////        If both the goodWord and .contains() == false (repeat check):
////        Tell them it is a valid word
////        Make word counter ++
////        Make totalPoints add the word length
////        Make roundPoints add the word length
////        Make total number of words ++
////        .addWord() method so they cannot repeat
////        If checks fail then check if it is a repeated word if so tell user
////        Else print the word is invalid
//
//
////        After .check() == false
////        Tell user round has ended
////        Show the user the correct words they typed
////        Show how many words they got
////        Show how many points they got
////        Ask if they would like to play again (Y or N)
////        If yes repeat While loop with the *
//
//
////        If N:
////        Set a average word to divide totalWords and totalRounds
////        Set a average points to divide totalPoints and totalRounds
////        Show how many rounds they played
////        Show how many words they typed total
////        Show many points they got total
////        Show average words and points from all the rounds
//        Shows PlayerList toString
//        PlayerList Savelist


import java.util.Scanner;

public class MyWordyGameBeta {

    private static PlayerList list;

    public static void main (String [] args) {

        Scanner scan = new Scanner (System.in);
        WordFinder f = new WordFinder("dictionary.txt");
        MyTimer t = new MyTimer();
        list = new PlayerList("players.txt");

        String userWord = "";
        int counter = 0;
        int numOfRounds = 0;
        int totalPoints = 0;
        int roundPoints = 0;
        int totalNumOfWords = 0;
        String yes = "y";
        Player player = new Player ("start");

                System.out.println("Here is your game:");
        System.out.println();
        System.out.println("For each word we have 1 minute to guess as many words as we can.");
        System.out.println("The words we guess must come from the letters of the displayed word.");
        System.out.println("Each letter from the original word can only be used once in the guessed word.");
        System.out.println("Each guessed word also must be a valid word (in the dictionary or at least the dictionary file we have)\n");

        while (!yes.equals("Quit")) {

            System.out.println("Please sign in with your ID and password");
            System.out.println("If you are a new player, say 'new'\n" +
                    "and we will set up with a new account for you");
            System.out.println("If you would like to leave the game say 'Quit'");

            String input = scan.nextLine();

            if (input.equals ("Quit")) {

                yes = "Quit";


            }else if (!input.equals ("Quit")) {

                System.out.println("ID: " + input);

                if (list.containsId(input)) {

                    player = new Player (input);

                    System.out.println("Password: ");
                    String pass = scan.nextLine();

                    player.setPass(pass);

                    int counter1 = 0;

                    while (counter1 < 2 && list.authenticate(player) == null) {

                        System.out.println("That is incorrect.");
                        System.out.println("Please enter your password again");
                        pass = scan.nextLine();
                        player.setPass(pass);
                        counter1++;

                    }

                    if (list.authenticate(player) == null) {

                        System.out.println("You have failed too many times, we are getting you a new account");
                        player = newPlayer();
                        yes = "y";

                    }else {

                        player = list.authenticate(player);
                        yes = "y";

                    }

                }else {

                    player = newPlayer ();
                    yes = "y";
                }


            }else if (input.equals("new")){

                player = newPlayer ();
                yes = "y";

            }

            while (yes.equalsIgnoreCase("y")) {

                Dictionary dict = new Dictionary();
                f.nextWord(6);
                String word = f.showWord();
                numOfRounds++;
                counter = 0;
                roundPoints = 0;
                player.addRounds(1);



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
                        totalPoints = totalPoints + userWord.length();
                        roundPoints = roundPoints + userWord.length();
                        totalNumOfWords++;
                        dict.addWord(userWord);


                    } else {

                        if (dict.contains(userWord)) {

                            System.out.println("That is a repeated word");

                        } else {

                            System.out.println(userWord + " is Invalid");
                        }

                    }


                }

                System.out.println("The Round has ended");
                System.out.println();
                System.out.println("Here are your words:");

                System.out.println(dict.toString());

                System.out.println("You found " + counter + " Words");
                player.addWords(counter);
                System.out.println("You earned " + roundPoints + " Points");
                player.addPoints(roundPoints);
                System.out.println("Would you Like to play again? (Y or N)");
                yes = scan.nextLine();



            }//end of while

            if (yes.equalsIgnoreCase ("N")) {

                double avWords = totalNumOfWords / numOfRounds;
                double avPoints = totalPoints / numOfRounds;

                System.out.println("Ok, you played " + numOfRounds + " Rounds");
                System.out.println("You found " + totalNumOfWords + " Words");
                System.out.println("You got " + totalPoints + " Points");
                System.out.println("You averaged " + avWords + " Words");
                System.out.println("You averaged " + avPoints + " Points");
                System.out.println();

            }

        }//end of big while

        list.saveList();
        System.out.println("The Game is Over");
        System.out.println("Here are the Overall Stats:");
        System.out.println(list.toString());

    }

    public static Player newPlayer() {

        Scanner scan = new Scanner (System.in);


        String input = "";

        System.out.println("We are setting you up with a new account");
        System.out.println();
        System.out.println("Please enter an ID (No Spaces Please)");
        input = scan.nextLine();

        while (list.containsId(input) != false) {

            System.out.println("Sorry, that name already exists, please enter a new ID");
            input = scan.nextLine();

        }

        Player player = new Player (input);

        System.out.println();
        System.out.println("Enter a password (This will be case sensitive)");

        String pass = scan.nextLine();

        System.out.println("Please confirm your password (Case sensitive)");
        input = scan.nextLine();
        while (!input.equals (pass)) {

            System.out.println("That is not correct");
            System.out.println("Please enter your password again to confirm (Case Sensitive)");
            input = scan.nextLine();

        }

        player.setPass(pass);

        list.addPlayer(player);

        input = "new";

        return player;

    }

}
