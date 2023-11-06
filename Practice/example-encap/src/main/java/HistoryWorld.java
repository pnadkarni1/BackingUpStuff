public class HistoryWorld {

    public static void main(String [] args) {
        //to make an object we need to provide a class name object name and call a constructor

        Caveman p1 = new Caveman("Bob", 11);
        p1.lightFire ();

        Caveman p2 = new Caveman ("Amy", 3);
        p2.lightFire ();

        p2.increaseAge (8);
        p2.lightFire ();
        p2.increaseAge (8);
        p2.increaseAge (8);
        p2.lightFire ();

    }
}
