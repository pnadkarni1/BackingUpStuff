
//Design Plan:
//        Main:
//        1.Ask user for a word
//        2.Put word into the HawaiianWord Class
//        3.Print out toString ()
//        HawaiianWord Class:
//        1.Make “word” instance variable
//        2.Make a phoneWord StringBuilder instance variable
//        Create 2 methods:
//        First:
//        1.Set word variable to default type (constructor)
//        Second:
//        1.Set word variable to userWord
//        2.Move to createPhoneticVersion Method
//        createPhoneticVersion:
//        1.Set default type to fullPhoneWord, currentLetter, pastLetter, afterLetter
//        2.Make for loop for until the length of the word is done
//        3.For Loop:
//        4.Set currentLetter to the counter of the character for for-loop
//        5.Set pastLetter to counter - 1 of the character for for-loop
//        6.Set AfterLetter to counter + 1 of the character for for-loop
//        C7.heck which letter it is with ifs
//        8.If special letter, check condition then determine, else normal
//        End of For
//        9.Check if the last character is a “-” if is, charAtDelete, else leave
//        CountSyllables Method:
//        1.Go through each character of the phonetic word, if the it has a “-”, ++
//        2.If word has no “-” then set syllables to 1
//        toString Method:
//        1.Make string for word and phonetic
//        2.Return string


public class HawaiianWord {

    private String word;
    private StringBuilder phoneWord = new StringBuilder ();

    public HawaiianWord() {

        word = "";

    }

    public HawaiianWord(String hWord) {

        word = hWord;

    }

    public void setWord(String hWord) {

        word = hWord;

    }

    public void getWord(String hWord) {

        word = hWord;

    }

    public String createPhoneticVersion() {

        String hPhoneWord = "";
        String curPhoneLetter;
        String pastLetter;
        String afterLetter;

        for (int i = 0; word.length() -1 > i; i++) {

            String singleLetter = word.substring(i);
            pastLetter = word.substring (i - 1);
            afterLetter = word.substring (i + 1);

            if (singleLetter.equalsIgnoreCase("A")) {

                if (afterLetter.equalsIgnoreCase ("W")) {

                    curPhoneLetter = "w";

                }else {

                    curPhoneLetter = "ah-";

                }

                if (afterLetter.equalsIgnoreCase ("i")) {

                    curPhoneLetter = "eye-";

                }

                if (afterLetter.equalsIgnoreCase ("e")) {

                    curPhoneLetter = "eye-";

                }
                if (afterLetter.equalsIgnoreCase ("o")) {

                    curPhoneLetter = "ow-";

                }
                if (afterLetter.equalsIgnoreCase ("u")) {

                    curPhoneLetter = "ow-";

                }

                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("B")) {

                curPhoneLetter = "b";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("C")) {

                curPhoneLetter = "c";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("D")) {

                curPhoneLetter = "d";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("E")) {

                if (afterLetter.equalsIgnoreCase ("W")) {

                    curPhoneLetter = "v";

                }else {
                    curPhoneLetter = "eh-";

                }

                if (afterLetter.equalsIgnoreCase ("i")) {

                    curPhoneLetter = "ay";

                }

                if (afterLetter.equalsIgnoreCase ("e")) {

                    curPhoneLetter = "eh-oh";

                }

                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("F")) {

                curPhoneLetter = "f";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("G")) {

                curPhoneLetter = "g";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("H")) {

                curPhoneLetter = "h";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("I")) {

                if (afterLetter.equalsIgnoreCase ("w")) {

                    curPhoneLetter = "v";

                }else {

                    curPhoneLetter = "ee-";

                }

                if (afterLetter.equalsIgnoreCase ("u")) {

                    curPhoneLetter = "ew";

                }

                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();
            }
            if (singleLetter.equalsIgnoreCase("J")) {

                curPhoneLetter = "j";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("K")) {

                curPhoneLetter = "k";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("L")) {

                curPhoneLetter = "l";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("M")) {

                curPhoneLetter = "m";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("N")) {

                curPhoneLetter = "m";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("O")) {

                if (afterLetter.equalsIgnoreCase ("w")) {

                    curPhoneLetter = "w";

                }else {

                    curPhoneLetter = "oh-";

                }

                if (afterLetter.equalsIgnoreCase ("i")) {

                    curPhoneLetter = "oy";

                }
                if (afterLetter.equalsIgnoreCase ("u")) {

                    curPhoneLetter = "ow";

                }
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("P")) {

                curPhoneLetter = "Papa";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("Q")) {

                curPhoneLetter = "Quebec";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("R")) {

                curPhoneLetter = "Romeo";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("S")) {

                curPhoneLetter = "Sierra";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("T")) {

                curPhoneLetter = "Tango";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("U")) {

                if (afterLetter.equalsIgnoreCase ("w")) {

                    curPhoneLetter = "w";

                }else {

                    curPhoneLetter = "-oo-";

                }
                if (afterLetter.equalsIgnoreCase ("i")) {

                    curPhoneLetter = "ooey";

                }

                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();
            }
            if (singleLetter.equalsIgnoreCase("V")) {

                curPhoneLetter = "v";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("W")) {

                curPhoneLetter = "w";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("X")) {

                curPhoneLetter = "s";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("Y")) {

                curPhoneLetter = "y";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }
            if (singleLetter.equalsIgnoreCase("Z")) {

                curPhoneLetter = "z";
                hPhoneWord = new StringBuilder(hPhoneWord + curPhoneLetter).toString ();

            }


        }

        phoneWord = new StringBuilder(hPhoneWord);

        String hWord = word;

        if (phoneWord.substring(phoneWord.length() - 1).equals ("-")) {

           phoneWord = phoneWord.deleteCharAt(phoneWord.length () - 1);

        }


        return hPhoneWord;
    }

    public int countSyllables () {

        int syllNum = 0;
        String singleLetter = "";

        for (int i = 0; i < phoneWord.length (); i++) {

            singleLetter = phoneWord.substring (i, i++);

            if (singleLetter.equals ("-")) {

                syllNum++;

            }



        }

        syllNum++;

        return syllNum;

    }

    public String toString() {

        String hWords = "Word: " + word + " has a phonetic spelling of: " + phoneWord;

        return hWords;

    }


}