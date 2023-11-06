import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ShufflerCheckTest {
    private static String[] testWordsUnscrambled;
    private static String[] testWordsScrambled;
    private static ShufflerCheck shuffler;

    @BeforeAll
    static void setUp () {
        shuffler = new ShufflerCheck();

        testWordsUnscrambled = new String[]{
                "angel", "audit", "buffs", "buffy", "congo", "conic", "dealt", "debar"
        };

        testWordsScrambled = new String[]{
                "legan", "daiut", "usbff", "fufby", "gcono", "iconc", "tdlea", "ebrad"
        };
    }

    private static Stream<Arguments> provideWords_allMatch() {
        return Stream.of(
                Arguments.of(testWordsUnscrambled[0], testWordsScrambled[0]),
                Arguments.of(testWordsUnscrambled[1], testWordsScrambled[1]),
                Arguments.of(testWordsUnscrambled[2], testWordsScrambled[2]),
                Arguments.of(testWordsUnscrambled[3], testWordsScrambled[3])
        );
    }

    @DisplayName("Words matching returning true")
    @ParameterizedTest
    @MethodSource("provideWords_allMatch")
    void isSameWord_wordsMatch_returnTrue (String unscram, String scram) {
        assertTrue(shuffler.isSameWord(unscram, scram));
    }

    @DisplayName("Words matching checking difference number")
    @ParameterizedTest
    @MethodSource("provideWords_allMatch")
    void howDiff_wordsMatch_returnTrue (String unscram, String scram) {
        int diff = shuffler.howDifferent(unscram, scram);
        assertEquals(0, diff);
    }

    private static Stream<Arguments> provideWords_noneMatch() {
        return Stream.of(
                Arguments.of(testWordsUnscrambled[3], testWordsScrambled[7], 4),
                Arguments.of(testWordsUnscrambled[1], testWordsScrambled[7], 3),
                Arguments.of(testWordsUnscrambled[4], testWordsScrambled[6], 5),
                Arguments.of(testWordsUnscrambled[2], testWordsScrambled[3], 1)
        );
    }

    @DisplayName("Words don't match returning false")
    @ParameterizedTest
    @MethodSource("provideWords_noneMatch")
    void isSameWord_wordsNoMatch_returnFalse (String unscram, String scram) {
        assertFalse(shuffler.isSameWord(unscram, scram));
    }

    @DisplayName("Words don't match checking difference number")
    @ParameterizedTest
    @MethodSource("provideWords_noneMatch")
    void howDiff_wordsNoMatch_returnTrue (String unscram, String scram, int diff) {
        int difference = shuffler.howDifferent(unscram, scram);
        assertEquals(diff, difference);
    }

}
