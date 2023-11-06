public class SBuilder {

    public static void main(String [] args ) {

        StringBuilder  first = new StringBuilder ("Hope is a good thing, maybe, the best of things, and no good thing ever dies");

        StringBuilder second = first;

        System.out.println("Testing equality ==");
        System.out.printf("Andy first says: %s%n", first);
        System.out.printf("Andy Second says: %s%n", second);
        System.out.printf("first is the same as second: %s%n", first == second);

        System.out.println();
        System.out.println("Testing Equality " + "with .equals()");;

        first = first.replace(4,5, "_");

        System.out.printf("Andy first says: %s%n", first);
        System.out.printf("Andy Second says: %s%n", second);
        System.out.printf("first is the same as second: %s%n", first == second);

        System.out.println("first.equals(second): %s%n" + first.equals(second));

        System.out.println();
        System.out.println("Append Method");

        StringBuilder third = new StringBuilder ("Get busy living");
        System.out.printf("Andy thid says: %s%n", third);

        third = third.append(" or get busy dying");

        System.out.printf("Andy after append third says: %s%n", third);


        System.out.println();
        System.out.println("Delete Char Method");

        //goal is to delete all the o's from the first stringbuilder and see how it impacts the second stringbuilder

        //deleting characters out of a string is more complicated than what we are about to see and do

        for (int i = 0; i <= first.length () -1; i++) {

            String singleL = first.substring(i, i + 1);

            if ("o".equals(singleL)) {

                first.deleteCharAt(i);

            }

        }

        System.out.print("first without o's: %s%n" + first);
        System.out.println();
        second = new StringBuilder ("good");

        for (int i = 0; i < second.length(); i++) {

            String singleL = second.substring (i, i + 1);
            System.out.printf("Grabbing letter from index: %s%n", i);
            System.out.printf("Single Letter grabbed is: %s%n", singleL );
            System.out.printf("Remianing letters in word: %s%n", second.substring (i + 1));

            if ("o".equals (singleL)) {

                second.deleteCharAt(i);
                i--;
                System.out.printf("Removed char word now: %s%n", second);

            }

        }


    }//end of main
}//end of class
