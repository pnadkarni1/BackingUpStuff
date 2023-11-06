//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class GuessingNumberTest {
//    private static boolean isCorrectPassword;
//    private static boolean isCorrectSum;
//
//    @BeforeAll
//    static void init () {
//        isCorrectPassword = false;
//        isCorrectSum = false;
//    }
//
//    @DisplayName("Incorrect password guessed")
//    @Test
//    void verifyPassword_badGuess_returnFalse () {
//        isCorrectPassword = GuessingNumber.verifyPassword("wrong");
//        assertFalse(isCorrectPassword);
//    }
//
//    @DisplayName("Correct password guessed")
//    @Test
//    void verifyPassword_goodGuess_returnTrue () {
//        isCorrectPassword = GuessingNumber.verifyPassword("floo powder");
//        assertTrue(isCorrectPassword);
//    }
//
//    @DisplayName("Incorrect sum guessed")
//    @Test
//    void correctGuess_badSum_returnFalse () {
//        isCorrectSum = GuessingNumber.correctGuess(11, 13);
//        assertFalse(isCorrectSum);
//    }
//
//    @DisplayName("Correct sum guessed")
//    @Test
//    void correctGuess_goodSum_returnTrue () {
//        isCorrectSum = GuessingNumber.correctGuess(9, 9);
//        assertTrue(isCorrectSum);
//    }
//
//}