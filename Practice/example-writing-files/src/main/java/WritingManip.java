
import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class WritingManip {
    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What file name would you like to create?");
        String fileName = sc.nextLine();
        fileName = fileName.trim();

        //we need a ".txt" in the root so we need to apend the file extenstion onto the name the user gave us.

        fileName += ".txt";

        //try with resources again here, remember using this auto closes our streams so we do not have to

        try (FileWriter file = new FileWriter(fileName); BufferedWriter writer = new BufferedWriter (file)) {
            //we will write some info into our file, we allow the user to decide when they want to stop

            System.out.println("Would you like to enter some info? [y/n]");

            String uC = sc.nextLine ();

            while (uC.equalsIgnoreCase("y")) {

                System.out.println("Enter Name:");
                String name = sc.nextLine ();

                //the write() method will put whatever we want into the file the bufferedWriter is using
                //However it does not put a newLine at the end

                writer.write("Name: " + name + "/n");

                System.out.println("Favorite Animal:");
                String an = sc.nextLine ();
                writer.write("Animal: " + an + "/n");

                System.out.println("Would you like to add more? [y/n]");
                uC = sc.nextLine ();

            }

            //using the ".flush()" mehtod allows data to written into the file before the buffer is closed
            //if we do not use the flush, nothing will be written into the file until ".close()" method is called or the program ends.

            writer.flush();

        }catch (FileNotFoundException noFile) {

            System.out.println("Error creating or finding file");
            noFile.printStackTrace ();

        }catch (IOException bad) {

            System.out.println("Error writing into file");

            bad.printStackTrace ();

        }

        System.out.println("What file name would you like to create?");
        fileName = sc.nextLine();
        fileName = fileName.trim() + ".txt";

        //in the file writer constructor we can append the info into a text file if needed
        //therefore it will not overwirte the textfile each time

        try (FileWriter file = new FileWriter(fileName, true); BufferedWriter writer = new BufferedWriter (file)) {
            //we will write some info into our file, we allow the user to decide when they want to stop

            System.out.println("Would you like to enter some info? [y/n]");

            String uC = sc.nextLine ();

            while (uC.equalsIgnoreCase("y")) {

                System.out.println("Enter Name:");
                String name = sc.nextLine ();

                writer.write("Name: " + name + "/n");

                System.out.println("Favorite Animal:");
                String an = sc.nextLine ();
                writer.write("Animal: " + an + "/n");

                System.out.println("Would you like to add more? [y/n]");
                uC = sc.nextLine ();

            }

            //using the ".flush()" mehtod allows data to written into the file before the buffer is closed
            //if we do not use the flush, nothing will be written into the file until ".close()" method is called or the program ends.

            writer.flush();

        }catch (FileNotFoundException noFile) {

            System.out.println("Error creating or finding file");
            noFile.printStackTrace ();

        }catch (IOException bad) {

            System.out.println("Error writing into file");

            bad.printStackTrace ();

        }


        sc.close();
    }//end of main
}//end of class
