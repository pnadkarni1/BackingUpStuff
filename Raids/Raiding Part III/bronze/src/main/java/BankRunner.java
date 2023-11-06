
import java.util.Scanner;

public class BankRunner {
    public static void main(String [] args) {

        Scanner userInput = new Scanner (System.in);

    System.out.println("What is your name?");
    String userName = userInput.nextLine ();

    System.out.println("What is your balance");
    double userBalance = userInput.nextDouble ();

    BankAccount account = new BankAccount (userName, userBalance);

    System.out.println(account);

    System.out.println("How much would you like to withdraw?");
    double userWithdraw = userInput.nextDouble ();

    userBalance = account.withdraw (userWithdraw);

    System.out.println(account);

    System.out.println("How much would you like to deposit?");
    double userDeposit = userInput.nextDouble ();

    userBalance = account.deposit (userDeposit);

    System.out.println(account);


    }

}
