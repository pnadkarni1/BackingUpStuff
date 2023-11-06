public class StringsFormatting {

    public static void main (String [] args) {

        //we can do special printing numbers with commas
        //print out certain character from a sentence and more
        //this can sometimes be useful if we need to print something with special spacing or alignment
        String lyricLine = "If it's a dream, don't wake me, don't wake me";
        //%s will print out some string where that symbole apper
        String output = String.format("%75s", "Hey look ma, I made it") + "\n" +String.format("%80s", "Everything's up aces, aces") +
                "\n" + String.format("%20s", lyricLine);
        System.out.println(output);

        System.out.printf("%60.23s", "I want to see you smile but");

    }//end of main



}//end of class
