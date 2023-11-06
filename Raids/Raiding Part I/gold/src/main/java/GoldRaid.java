
import java.util.Scanner;

public class GoldRaid {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number between 1-50");
        double userNum = userInput.nextDouble();

        int add = 0;

        for (int i = 0; i <= userNum; i++) {

            System.out.println("Your sum is " + add);

        }if (userNum > 50) {

            System.out.println("Your number is out of range");

        }


    }
}