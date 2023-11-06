import java.util.Scanner;

public class MyWordTranslator {

    public void main(String[] args) {

        Scanner userInput = new Scanner (System.in);

        System.out.println("Enter a word to get it translated.");
        String userWord = userInput.nextLine ();

        HawaiianWord wordTrans = new HawaiianWord(userWord);

        System.out.println(wordTrans.toString ());

    }
}
