
import java.util.Scanner;

public class MyFancyAccounts {
    public static void main(String []args) {

Scanner userInput = new Scanner (System.in);
System.out.println("Enter A Starting Deposit");
int userNum = userInput.nextInt ();
System.out.println("Your Deposit is " + userNum);
System.out.println("Enter an interest rate");
double userInt = userInput.nextDouble ();
System.out.println("Your interest rate " + userInt);
double FV = userNum * (1 + userInt) * 10;
System.out.println("Your Future Deposit is " + FV);

    }


}
