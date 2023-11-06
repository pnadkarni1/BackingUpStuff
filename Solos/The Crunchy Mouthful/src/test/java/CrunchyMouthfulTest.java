//import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.*;
//import static org.hamcrest.MatcherAssert.assertThat;
//
//class CrunchyMouthfulTest {
//
//    private static double change;
//    private static final double PRECISION = 0.00001;
//
//    @BeforeAll
//    static void init () {
//        change = 0.0;
//    }
//
//    @DisplayName("User underpays and owes more")
//    @ParameterizedTest
//    @ValueSource(doubles = {29.99, 13.19, 9.00, 0.05, 23.73})
//    void calculateChange_customerUnderpays_returnNegative (double userPay) {
//        change = CrunchyMouthful.calculateChange(userPay, 30.00);
//        assertThat(change, anyOf(closeTo(-0.01, PRECISION), closeTo(-16.81, PRECISION),
//                closeTo(-21.00, PRECISION), closeTo(-29.95, PRECISION), closeTo(-6.27, PRECISION)));
//
//    }
//
//    @DisplayName("User overpays and is owed change")
//    @ParameterizedTest
//    @ValueSource(doubles = {40.00, 33.61, 39.00, 30.05, 53.73})
//    void calculateChange_customerOverpays_returnPositve (double userPay) {
//        change = CrunchyMouthful.calculateChange(userPay, 23.45);
//        assertThat(change, anyOf(closeTo(16.55, PRECISION), closeTo(10.16, PRECISION),
//                closeTo(15.55, PRECISION), closeTo(6.60, PRECISION), closeTo(30.28, PRECISION)));
//
//    }
//
//    @DisplayName("User pays exact amount")
//    @Test
//    void calculateChange_customerPaysExact_return0 () {
//        change = CrunchyMouthful.calculateChange(23.45, 23.45);
//        assertEquals(0.0, change, PRECISION);
//    }
//
//}