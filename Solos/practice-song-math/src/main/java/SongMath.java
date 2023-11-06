//remember imports

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.IOException;

public class SongMath {
    public static void main(String[] args) throws IOException {

        //remember FileReader, BufferedReader for reading

        try (FileReader file = new FileReader("twenty.txt"); BufferedReader reader = new BufferedReader(file)) {

            String line;
            int total = 0;

            while ((line = reader.readLine()) != null) {

                if (line.contains("3")) {
                    total += 3;
                } else if (line.contains("'69")) {
                    total += 69;
                } else if (line.contains("skater")) {
                    total += 8;
                } else if (line.contains("seven")) {
                    total += 7;
                } else if (line.contains("eleven")) {
                    total += 11;
                } else if (line.contains("twenty")) {
                    total += 20;
                } else if (line.contains("thirty")) {
                    total += 30;
                } else if (line.contains("sixty")) {
                    total += 60;
                } else if (line.contains("forward")) {
                    total += 1;
                } else if (line.contains("back")) {
                    total -= 3;
                } else if (line.contains("nine")) {
                    total += 9;
                } else if (line.contains("four")) {
                    total += 4;
                } else if (line.contains("fifteen")) {
                    total += 15;
                } else if (line.contains("freshman")) {
                    total -= 9;
                } else if (line.contains("senior")) {
                    total -= 12;
                } else if (line.contains("six")) {
                    total += 6;
                } else if (line.contains("dime")) {
                    total += 10;
                } else if (line.contains("five")) {
                    total += 5;
                }

        }//end of while loop


            try (FileWriter fileN = new FileWriter ("songmath.txt"); BufferedWriter writer = new BufferedWriter(fileN)) {

                writer.write(total + " is an interesting number to get, huh?" );

            }


    } catch(
    FileNotFoundException badFile)

    {

        System.out.println("Cannot Find File");

    } catch(
    IOException e)

    {

        System.out.println("Error reader from file");

    }

    //FileWriter, BufferedWriter for writing



}

    }//end of main//end of class
