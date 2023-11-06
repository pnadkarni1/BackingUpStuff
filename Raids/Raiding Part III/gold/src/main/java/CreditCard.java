public class CreditCard {

    private String name;
    private String email;
    private int balance;
    private int creditLimit;

    public CreditCard () {

        name = "";
        email = "";
        balance = 0;
        creditLimit = 0;

    }

    public CreditCard (String name, int creditLimit) {

        this.name = name;
        this.creditLimit = creditLimit;

    }

    public CreditCard (String name, String email, int creditLimit) {

        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;

    }

    public String getName () {

        return name;

    }

    public String getEmail () {

        return email;

    }

    public int getBalance () {

        return balance;

    }

    public int getCreditLimit () {

        return creditLimit;

    }

    public void setName (String name) {

        this.name = name;

    }

    public void setEmail (String email) {

        this.email = email;

    }

    public void setBalance (int balance) {

        this.balance = balance;

    }

    public void setCreditLimit (int creditLimit) {

        this.creditLimit = creditLimit;

    }

    public void increaseBalance (int balance) {

        if (balance + this.balance > creditLimit) {



        }else {

            this.balance = balance + balance;

        }

    }

    @Override

    public String toString () {

        return "Your name is " + name + ". Your email is " + email + ". Your current balance is $" + balance;

    }

}
