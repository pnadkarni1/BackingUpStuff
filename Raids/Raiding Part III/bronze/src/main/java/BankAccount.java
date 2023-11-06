public class BankAccount {

    private String name;
    private double balance;

    public BankAccount () {

        name = "";
        balance = 0;

    }

    public BankAccount (String bName, double bBalance) {

        name = bName;
        balance = bBalance;

    }

    public String getName () {

        return name;

    }

    public double getBalance () {

        return balance;

    }

    public void setName (String bName) {

        name = bName;

    }

    public void setBalance (double bBalance) {

        balance = bBalance;

    }

    public double withdraw (double withdrawAmount) {



        if (balance - withdrawAmount < 0) {


            return balance;
        }else {

            balance = balance - withdrawAmount;
            return balance;

        }

    }

    public double deposit (double depositAmount) {

        if (depositAmount < 0) {

            return balance;

        }else {

            balance = balance + depositAmount;

            return balance;

        }

    }

    @Override

    public String toString () {

        return "Your name is " + name + " and your current balance is " + balance + ".";

    }

}
