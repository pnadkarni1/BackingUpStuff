
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingManip {
    public static void main (String [] args) throws IOException {

        System.out.println("====== Data in File =======");
        System.out.println("This is information about data in the root folder");



        //the root folder is where out project is located
        //we will be using a FileReader to do out reading, this also required us to use a BufferedReader
        //These will require imports

        //FileReader we provide the name or path to the file
        //in the contructor
        //BufferedReader takes the FileReader

        //Below is a try-with-resources
        //we seperate the resources with ;
        //This means that thes resources are automaticlly closed when we leave the try
        //we do not want to keep these streams open and we must close them ourselves.
        //If we don't using try-with-resources

        try (FileReader file = new FileReader("wtm.txt"); BufferedReader reader = new BufferedReader (file)) {

            String line;

            int wLines = 0;


            while ( (line = reader.readLine()) != null ) {

                if (line.contains("w") || line.contains("W")) {

                    wLines++;

                }

            }//end of while loop

            System.out.println("There are " + wLines + " lines that contain a w or W in the song");

        } catch (FileNotFoundException badFile) {

            System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }

        System.out.println("The total ballons in 99 Red Ballons is " + balloonAdder());

    }//end of main

    //If we do not use Try catch then on the method we need to "throw" the correct exception that could occur from our code

    public static int balloonAdder() throws IOException {

        FileReader file = new FileReader("balloons.txt");

        BufferedReader reader = new BufferedReader(file);

        String line;

        int sumOfBallons = 0;

        while ( (line = reader.readLine ()) != null) {

            //when we have a string of text we can easily turn that string into a string array seperated by whatever special value we choose
            //Could be a space, could be double dashes, could be !

            String[] words = line.split(" ");

            //words is an array of text
            //each word up to a space is placed in an index position
            //Once it reaches the end of the line and the while loop starts over
            //Words will reset to be brand new

            for (int i = 0; i < words.length; i++) {

                if (words[i].equals("99")) {

                    //we can convert a string into a number if it is a number
                    //Interger.parseInt takes a string argument coverts it into a int ONLY if the argument is an int otherwise error

                    sumOfBallons = sumOfBallons + Integer.parseInt(words[i]);

                }

            }

        }//end of while

        return sumOfBallons;

    }//end of Ballon Adder

}//end of class
