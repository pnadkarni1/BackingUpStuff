
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BronzeRaids {
    public static void main(String [] args) {

        Scanner input = new Scanner (System.in);

        //Bronze 1

        String [] arr = new String [5];

        arr[0] = "cat";
        arr[1] = "brother";
        arr[2] = "Tom";
        arr[3] = "chair";
        arr[4] = "road";

        System.out.println("Type a word");
        String word = input.nextLine ();

        if (bronze1(arr, word)) {

            System.out.println(true);

        }else {

            System.out.println(false);

        }

        //Bronze 2

        String [] array = new String [9];
        try (FileReader file = new FileReader("bronze2.txt"); BufferedReader reader = new BufferedReader (file)) {

            String line;
            int i = 0;
            while ( (line = reader.readLine()) != null) {

                array[i] = line;
                i++;
            }//end of while loop



        } catch (FileNotFoundException badFile) {

            System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }

        System.out.println();
        System.out.println("Type a word");
        String uW = input.nextLine ();
        arr = bronze2(array, uW);
        System.out.println(arr[0]);


    }

    public static boolean bronze1 (String [] arr, String word) {

        for (int i = 0; i < arr.length; i++) {

            if(word.equalsIgnoreCase (arr[i])) {

                return true;

            }

        }

        return false;

    }

    public static String [] bronze2 (String [] arr, String word) {


        for (int i = 0; i < arr.length; i++) {

        if (word.equalsIgnoreCase (arr[i])) {

            arr[i] = null;

        }

        }

        return arr;

    }

}
