import java.util.Scanner;

public class GoldTwo {

    public static void main (String [] args) {


        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a Year");
        int userYear = userInput.nextInt ();

        if (userYear % 4 == 0) {

            System.out.println(userYear + " is a leap year");

        }else if (userYear % 4 !=0) {

            System.out.println(userYear + " is not a leap year");

        }


    }

}
