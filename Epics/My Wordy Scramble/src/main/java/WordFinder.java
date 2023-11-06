// You must complete the implementation of this class.  You will need
// to use an instance of the Dictionary class within this class.  See
// Dictionary.java for details on the Dictionary class.

public class WordFinder
{
    // Think about the instance variables that you will need for this class.
    // Minimally you will need a Dictionary object and a String.

    private Dictionary dict;

    private String word;

    // Initialize a WordFinder object.  String fileName is the name of a
    // Dictionary file from which the Dictionary instance variable will be
    // initialized.
    public WordFinder(String fileName)
    {

        dict = new Dictionary (fileName);

        word = "";

    }

    // Obtain and store a random word from the Dictionary of "size" or more
    // letters.
    public void nextWord(int size)
    {

        word = dict.randWord (size);

    }

    // Return the word that was obtained. This is necessary since the word itself
    // will be stored in a private instance variable.
    public String showWord()
    {

        return word;

    }

    // This is the most challenging method in this class.  The "test" argument is
    // a String that will be checked for validity within the current word that was
    // obtained from the Dictionary.  This method should return true only if all of
    // the characters in "test" are found within the word (such that each letter in
    // the word is used at most one time) and if "test" is also a valid word in the
    // Dictionary.
    public boolean goodWord(String test)
    {


//        System.out.println(word);
//        System.out.println(test);

        StringBuilder builderWord = new StringBuilder (word);
        StringBuilder builderTest = new StringBuilder (test);



        if (test.equals (word)) {

//            System.out.println(false);
            return false;

        }

        if (dict.contains (test) == false) {

            return false;

        }

        for (int i = 0; i < test.length (); i++) {
//            System.out.println(builderWord);
            String d = builderTest.substring (i, i + 1);
//            System.out.println(d);
            int wLet = builderWord.indexOf (d);
//            System.out.println(wLet);


            if (wLet == -1) {

//                System.out.println("false");

                return false;

            }else {

                builderWord = builderWord.deleteCharAt (wLet);
            }


        }

//        System.out.println(builderWord);

//        System.out.println("true");
        return true;
    }

    //this method
    //is strictly made for the unit tests
    //it should not be used outside of the unit test file
    //if your String instance variable is something else replace the "word" on "this.word"
    //with whatever name you come up with
    public void setWord (String word) {
        this.word = word;
    }
}
