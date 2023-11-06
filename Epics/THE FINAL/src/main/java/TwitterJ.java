
import twitter4j.*;
import java.util.List;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;
import twitter4j.api.*;
import java.util.*;

public class TwitterJ {
    private Twitter twitter;
    private PrintStream consolePrint;
    private List<Status> statuses;
    public List<String> terms;
    private String popularWord;
    private int frequencyMax;

    public TwitterJ(PrintStream console)
    {
        // Makes an instance of Twitter - this is re-useable and thread safe.
        // Connects to Twitter and performs authorizations.
        twitter = TwitterFactory.getSingleton();
        consolePrint = console;
        statuses = new ArrayList<>();
        terms = new ArrayList<>();
        popularWord = " ";
        frequencyMax = 0;
    }

    /*  Part 1 */
    /*
     * This method tweets a given message.
     * @param String  a message you wish to Tweet out
     */
    public void tweetOut(String message) throws TwitterException, IOException
    {
        twitter.updateStatus(message);
    }


    /*  Part 2 */
    /*
     * This method queries the tweets of a particular user's handle.
     * @param String  the Twitter handle (username) without the @sign
     */
    @SuppressWarnings("unchecked")
    public void queryHandle(String handle) throws TwitterException, IOException
    {
        statuses.clear();
        terms.clear();
        fetchTweets(handle);
        splitIntoWords();
        removeCommonEnglishWords();
        sortAndRemoveEmpties();
    }

    /*
     * This method fetches the most recent 2,000 tweets of a particular user's handle and
     * stores them in an arrayList of Status objects.  Populates statuses.
     * @param String  the Twitter handle (username) without the @sign
     */
    public void fetchTweets(String handle) throws TwitterException, IOException
    {
        // Creates file for dedebugging purposes
        PrintStream fileout = new PrintStream(new FileOutputStream("tweets.txt"));
        Paging page = new Paging (1,200);
        int p = 1;
        while (p <= 10)
        {
            page.setPage(p);
            statuses.addAll(twitter.getUserTimeline(handle,page));
            p++;
        }
        int numberTweets = statuses.size();
        fileout.println("Number of tweets = " + numberTweets + "MADE at 4:40");

        int count=1;
        for (Status j: statuses)
        {
            fileout.println(count+".  "+j.getText());
            count++;
        }
    }

    /*
     * This method takes each status and splits them into individual words.
     * Remove punctuation by calling removePunctuation, then store the word in terms.
     */
    public void splitIntoWords()
    {

     for (int i = 0; i < statuses.size(); i++) {

         String [] arr = statuses.get(i).getText().split(" "); //Splits statuses text into words by a space. Goes to an array

         ArrayList <String> list = new ArrayList <String> ();

         for (int a = 0; a < arr.length; a++) {

             list.add(arr[a]); //Adds each index into an ArrayList

         }

         for (int c = 0; c < list.size(); c++) {

             if (list.get(c).contains("http")) { //Deletes all links

                 list.remove(c);

             }else {

                 String temp = removePunctuation(arr[c]);

                 terms.add(temp);//adds to terms list

             }

         }

     }

    }

    /*
     * This method removes common punctuation from each individual word.
     * Consider reusing code you wrote for a previous lab.
     * Consider if you want to remove the # or @ from your words. Could be interesting to keep (or remove).
     * @ param String  the word you wish to remove punctuation from
     * @ return String the word without any punctuation
     */
    public String removePunctuation( String s )
    {
        //After doing the Design Plan we had thought using .replace instead of substringing because that could cause errors
        //We had used many loops and had realized we could use a regular expression also known as a regex
        //A regex is a bunch of characters in a string that can be matched checked inside of another given string
        //This allowed us to use a single while loop which checks if it does contain anything in the regex if it does
        //then we .replace the Punctuation with an empty string
        //After checking the String methods we had realized their is a .replaceAll method that removes all the given punctuation
        //in the regular expression which eliminates the while loop inside of our design
        //We had essentially written out the code to the .replace Method

        s = s.replaceAll("[\\p{Punct}\\p{IsPunctuation}]", ""); //The Regex or regular expression ("[\\p{Punct}\\p{IsPunctuation}]")
        //contains all the characters to check if the string contains any of the characters if so then it changes it to an empty string
        s = s.replace("\n", ""); //this removes all next line characters, which is not part of the regex
        return s;



    }

    /*
     * This method removes common English words from the list of terms.
     * Remove all words found in commonWords.txt  from the argument list.
     * The count will not be given in commonWords.txt. You must count the number of words in this method.
     * This method should NOT throw an exception.  Use try/catch.
     */
    @SuppressWarnings("unchecked")
    private void removeCommonEnglishWords()
    {
        try (FileReader file = new FileReader("commonWords.txt"); BufferedReader reader = new BufferedReader (file)) { //Try catches from text file

            String line = "";

            while ( (line = reader.readLine()) != null ) { //CHecks to see if the next line is null if not then goes inside loop

                for (int i = 0; i < terms.size(); i++) {

                    if (terms.get(i).equalsIgnoreCase(line)) { //Checks if the term is in the text, if so then it removes from list

                        terms.remove(i);

                        i--;

                    }

                }

            }//end of while loop



        } catch (FileNotFoundException badFile) {

            System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }

    }

    /*
     * This method sorts the words in terms in alphabetically (and lexicographic) order.
     * You should use your sorting code you wrote earlier this year.
     * Remove all empty strings while you are at it.
     */
    @SuppressWarnings("unchecked")
    public void sortAndRemoveEmpties()
    {
        terms.removeAll(Arrays.asList("", null));
         //This method loops through an array list, but terms is not an array list so we must call the Arrays method
        //As list that returns as arraylist. The remove all method loops throught the entire array list and removes all null and empty strings in the array

        String [] array = new String[terms.size()];

        for (int i = 0; i < terms.size(); i++) { //Our sort requires a array so we transfer all strings from terms to array

            array[i] = terms.get(i);

        }


        for (int i = 0; i < array.length; i++){

            for(int c = i + 1;c < array.length; c++){

                if(array[i].compareTo(array[c]) > 0){

                    String temp = array[i];

                    array[i] = array[c];

                    array[c] = temp;

                }

            }

        }

        terms.clear(); //Clears the entire list so be readded

        for (int i = 0; i < array.length; i ++) {

            terms.add(array[i]);

            //Readds word from array to terms

        }
    }

    /*
     * This method returns the most common word from terms.
     * Consider case - should it be case sensitive?  The choice is yours.
     * @return String the word that appears the most times
     * @post will populate the frequencyMax variable with the frequency of the most common word
     */
    @SuppressWarnings("unchecked")
    public String mostPopularWord()
    {
        int index = 0;

        for (int i = 0; i < terms.size(); i++) {

            int count = 0;

            for (int c = 0; c < terms.size(); c++) {

                if (terms.get(i).equals(terms.get(c))) {

                    count++;

                }

            }

            if (count > frequencyMax) {

                frequencyMax = count;
                popularWord = terms.get(i);

                index = i;

            }

        }



        return popularWord;

    }

    /*
     * This method returns the number of times the most common word appears.
     * Note:  variable is populated in mostPopularWord()
     * @return int frequency of most common word
     */
    public int getFrequencyMax()
    {
        return frequencyMax;
    }


    /*  Part 3 */
    public void investigate (String message) throws TwitterException {

        boolean whileHolder = false;
        Date date = null;
        User randFriend = null;

        while (whileHolder == false) {

            long curs = 20;

            FriendsFollowersResources f = twitter.friendsFollowers(); //Gets the interface for the friends followers

            PagableResponseList list = f.getFriendsList(twitter.getId(), curs); //Makes list of the friends

            int randNum = (int) (Math.random() * list.size()); //Produces random num from 0 to list size

            randFriend = (User) list.get(randNum); //Gets the friend from the random num

            date = randFriend.getCreatedAt(); //Makes the date object the object from the friend

            if (date.getYear() < 2020) { //Checks if the account was made before 2020

                whileHolder = true;

            }

        }

        twitter.sendDirectMessage(randFriend.getId(), message); //Sends message

        System.out.println("We sent " + randFriend.getName() + ", also known as " + randFriend.getScreenName() + " the message: " + message);

    }

    /*
     * This method determines how many people near Churchill Downs
     * tweet about the Kentucky Derby.
     */
    public void sampleInvestigate ()
    {
        Query query = new Query("Kentucky Derby");
        query.setCount(100);
        query.setGeoCode(new GeoLocation(38.2018,-85.7687), 5, Query.MILES);
        query.setSince("2021-5-1");
        try {
            QueryResult result = twitter.search(query);
            System.out.println("Count : " + result.getTweets().size()) ;
            for (Status tweet : result.getTweets()) {
                System.out.println("@"+tweet.getUser().getName()+ ": " + tweet.getText());
            }
        }
        catch (TwitterException e) {
            e.printStackTrace();
        }
        System.out.println();
    }
}
