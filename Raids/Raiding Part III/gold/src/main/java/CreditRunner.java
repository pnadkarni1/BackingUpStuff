public class CreditRunner {
    public static void main (String [] args) {

        CreditCard cc = new CreditCard ("Pranate", "randoEmail@theEmailSourceNoOneUses.com", 20000);

        cc.setBalance (2000);

        System.out.println(cc);

        cc.increaseBalance (2000);

        System.out.println(cc);

        cc.increaseBalance (200);

        System.out.println(cc);

        cc.setName ("Golgi Body");

        cc.setEmail ("justin@google.com");

        System.out.println (cc.getName ());
        System.out.println(cc.getEmail ());


    }
}
