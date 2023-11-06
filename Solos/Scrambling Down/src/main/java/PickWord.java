//two ArrayLists holding words in either scrambled or unscrambled fashion.
//can randomly receive a word from the unscrambled list
//doing same from the scrambled list will give you a word within 17 index locations
//of the unscrambled word

//DO NOT CHANGE OR MODIFY ANYTHING IN THIS FILE
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class PickWord {
    private ArrayList<String> unscrambleList;
    private ArrayList<String> scrambledList;
    private Random randomIndexNumber;
    private int selectedIndexLocation;

    public PickWord () {
        unscrambleList = new ArrayList<>();
        scrambledList = new ArrayList<>();
        randomIndexNumber = new Random();

        //try/catch block to catch any error with the files when trying to read from them
        //this is a try-with-resources block, which was new as of Java 1.7 and later it will
        //auto close the resources for us so we do not need to close the all the objects
        //after the execution of this try block
        //we are using an InputStream to read the files as they exist in the resources folder
        //BufferedReader allows us to "read" from the text files once we have access to them
        try (InputStream unscrambledFile = getClass().getResourceAsStream("/wordList.txt");
             BufferedReader unscrambledReader = new BufferedReader(new InputStreamReader(unscrambledFile));
             InputStream scrambledFile = getClass().getResourceAsStream("/wordsScrambled.txt");
             BufferedReader scrambledReader = new BufferedReader(new InputStreamReader(scrambledFile))){

            //this will hold the word from the text file
            String line;

            //goes through the wordList.txt file line-by-line
            //reads the word on the current line and stores it into a String variable
            //adds that String variable to the next index in the ArrayList
            //we are checking the line the we just read in the while loop
            //if we have read the "last line" in the file (after all the data) it will be
            //null and we will not go into the while loop
            while ( (line = unscrambledReader.readLine()) != null ) {
                unscrambleList.add(line);
            }

            //does the same as above, but with the wordListScrambled instead
            while ( (line = scrambledReader.readLine()) != null ) {
                scrambledList.add(line);
            }

        } catch (FileNotFoundException badFile) {
            System.out.println("Missing or bad file...");
        } catch (IOException e) {
            System.out.println("Problem reading line...");
        }

    }//end of constructor

    /**
     * Randomly calculates an index number from the ArrayList based on the size of the ArrayList
     *
     * @return A random word from the unscrambled file
     */
    public String getUnscrambledWord () {
        selectedIndexLocation = randomIndexNumber.nextInt(unscrambleList.size());
        return unscrambleList.get(selectedIndexLocation);
    }//end of get unscrambled word

    /**
     * Randomly calculates an index location that is either within 17 forward places of the unscrambled word
     * or before the end of the ArrayList, whichever is shorter.
     *
     * @return A random word from the scrambled file close in location the the selected unscrambled word
     */
    public String getScrambledWord () {
        int start = selectedIndexLocation;
        int end = selectedIndexLocation + 17;
        int index;
        if (end > scrambledList.size()) {
            index = randomIndexNumber.nextInt(scrambledList.size() - start) + start;
        } else {
            index = randomIndexNumber.nextInt(end - start) + start;
        }
        return scrambledList.get(index);
    }//end of getting scrambled word

}//end of class
