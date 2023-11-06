public class ShufflerCheck {

    private static PickWord pickWord;

    public ShufflerCheck () {

        PickWord pickWord = new PickWord();

    }

    public PickWord getPickWordObj() {


        return pickWord;

    }

    public void setPickWordObj (PickWord sPickWord) {

        pickWord = sPickWord;

    }

    public static int howDifferent(String unscramWord, String scramWord) {

        int numDifLetters = 0;
        int holder = 0;
        StringBuilder bScramWord = new StringBuilder (scramWord);
        StringBuilder bUnscramWord = new StringBuilder (unscramWord);


        for (int i = 0; i < unscramWord.length () ; i++) {

            String singleLetter = unscramWord.substring (i);

            for (int counter = 0; counter < unscramWord.length (); counter++) {

                String singleLetter2 = scramWord.substring (counter);

                if (singleLetter2.equals (singleLetter)) {

                    bScramWord = bScramWord.deleteCharAt (counter);
                    bUnscramWord = bUnscramWord.deleteCharAt (i);
                    break;

                }else {

                    holder++;

                }

            }

            if (holder > 0) {

                numDifLetters++;

            }
        }//end of for

        return numDifLetters;

    }//end of howDifferent

    public boolean isSameWord (String unscram, String scram) {

        if (howDifferent (unscram, scram) == 0 ) {

            return true;

        }else {

            return false;

        }

    }

}//end of class
