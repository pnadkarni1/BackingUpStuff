import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WordFinderTest {
    private WordFinder wordFinder;

    private static String[] providedWords;
    private static String[] testWords;

    @BeforeAll
    static void init () {
        testWords = new String[] {"a", "ant", "sit", "ants", "foh", "ae", "tick", "fit"};
        providedWords = new String[] {"assistant", "botanists", "distances", "instantly",
                "resistant", "withstand"};
    }

    private static Stream<Arguments> providedWords_testWords_good () {
        String[] goodValues = {testWords[0], testWords[1], testWords[2], testWords[3]};
        return Stream.of(
                Arguments.of(providedWords[0], goodValues),
                Arguments.of(providedWords[1], goodValues),
                Arguments.of(providedWords[2], goodValues),
                Arguments.of(providedWords[3], goodValues),
                Arguments.of(providedWords[4], goodValues),
                Arguments.of(providedWords[5], goodValues)
        );
    }

    @DisplayName("Check valid words (in dictionary) in each of the provided words")
    @ParameterizedTest
    @MethodSource("providedWords_testWords_good")
    void goodWord_providedWords_allGood_returnTrue (String givenWord, String[] guessedWords) {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord(givenWord);
        for (int i = 0; i < guessedWords.length; i++) {
            assertTrue(wordFinder.goodWord(guessedWords[i]));
        }
    }

    private static Stream<Arguments> providedWords_testWords_notValid () {
        String[] invalidWords = {testWords[4], testWords[5]};
        return Stream.of(
                Arguments.of(providedWords[0], invalidWords),
                Arguments.of(providedWords[1], invalidWords),
                Arguments.of(providedWords[2], invalidWords),
                Arguments.of(providedWords[3], invalidWords),
                Arguments.of(providedWords[4], invalidWords),
                Arguments.of(providedWords[5], invalidWords)
        );
    }

    @DisplayName("Check invalid words (not in dictionary) in each of the provided words")
    @ParameterizedTest
    @MethodSource("providedWords_testWords_notValid")
    void goodWord_providedWords_allInvalid_returnFalse (String givenWord, String[] guessedWords) {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord(givenWord);
        for (int i = 0; i < 2; i++) {
            assertFalse(wordFinder.goodWord(guessedWords[i]));
        }
    }

    private static Stream<Arguments> providedWords_testWords_badGuesses () {
        String[] notInWord = {testWords[6], testWords[7]};
        return Stream.of(
                Arguments.of(providedWords[0], notInWord),
                Arguments.of(providedWords[1], notInWord),
                Arguments.of(providedWords[2], notInWord),
                Arguments.of(providedWords[3], notInWord),
                Arguments.of(providedWords[4], notInWord),
                Arguments.of(providedWords[5], notInWord)
        );
    }

    @DisplayName("Check valid words not in each of the provided words")
    @ParameterizedTest
    @MethodSource("providedWords_testWords_badGuesses")
    void goodWord_providedWords_allBad_returnFalse (String givenWord, String[] guessedWords) {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord(givenWord);
        for (int i = 4; i < guessedWords.length; i++) {
            assertFalse(wordFinder.goodWord(guessedWords[i]));
        }
    }

    @DisplayName ("Specially case double letters word minded")
    @Test
    void goodWord_wordMinders_badGuess_returnFalse () {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord("minded");
        assertFalse(wordFinder.goodWord("dimmed"));
    }

    @DisplayName ("Same word guess as displayed word")
    @Test
    void goodWord_wordTent_badGuessSameWord_returnFalse () {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord("tent");
        assertFalse(wordFinder.goodWord("tent"));
    }

    @DisplayName ("Longer word guess than displayed word")
    @Test
    void goodWord_wordTent_badGuessLongWord_returnFalse () {
        wordFinder = new WordFinder("dictionary.txt");
        wordFinder.setWord("tent");
        assertFalse(wordFinder.goodWord("tents"));
    }

}