// You must modify this file so that it works as described in the README
import java.util.Scanner;
import java.io.*;
public class MyGreatExceptions
{
    public static void main(String [] args) {
        Scanner inScan, fScan = null;
        int[] A = new int[5];
        inScan = new Scanner(System.in);
        String nextItem = "";
        int nextInt = 0;
        int i = 0;

        int a = 0;

        while (a == 0) {

            try {

                System.out.println("Please enter the file to read from: ");
                String fName = inScan.nextLine();
                fScan = new Scanner(new File(fName));
                a++;

            } catch (IOException o) {

                System.out.println("File not Found.");

            }

        }



        while (a == 1) {

            try {

                while (fScan.hasNextLine()) {
                    nextItem = fScan.nextLine();
                    nextInt = Integer.parseInt(nextItem);
                    A[i] = nextInt;
                    i++;
                }

                System.out.println("Here are your " + i + " items:");
                for (int j = 0; j < i; j++) {
                    System.out.println(A[j] + " ");
                }

                a++;

            } catch (NumberFormatException e) {


                System.out.println(nextItem + " is not a int.");


            } catch (IndexOutOfBoundsException b) {

                System.out.println("Resizing Array from " + A.length + " to " + A.length * 2);

                int[] newArr = new int[A.length * 2];

                for (int c = 0; c < A.length; c++) {

                    newArr[c] = A[c];

                }

                A = newArr;

                A[i] = nextInt;
                i++;

            }

        }
    }
}