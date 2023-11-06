import java.util.ArrayList;

public class GenericsPractice {
    public static void main(String[] args) {

        ArrayList <Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        //items.add("school");
        items.add(4);
        items.add(5);

        printDubs(items);

    }

    private static void printDubs(ArrayList <Integer> in) {

        for (int o : in) {

            System.out.println(o + 11);

        }

    }

}
