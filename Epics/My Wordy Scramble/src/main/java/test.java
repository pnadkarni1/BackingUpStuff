import java.util.Scanner;

public class test {
    public static void main (String [] args) {
        Dictionary dict = new Dictionary ();
        MyTimer t = new MyTimer ();
        Scanner scan = new Scanner (System.in);
        WordFinder f = new WordFinder ("dictionary.txt");

        String userWord = "";
        f.nextWord(6);
        String word = f.showWord();

        t.set(20000);
        t.start();
        while (t.check()) {

            System.out.println("Your word is " + word);
            userWord = scan.nextLine();

            if (f.goodWord(userWord) || dict.contains(userWord) == false) {
                System.out.println(userWord + " is a valid word");
                dict.addWord(userWord);


            } else {

                System.out.println(userWord + " is Invalid");

            }


        }


    }

}
