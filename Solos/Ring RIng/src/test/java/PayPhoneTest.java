//import org.junit.jupiter.api.*;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.hamcrest.Matchers.*;
//import static org.junit.jupiter.api.Assertions.*;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//
//class PayPhoneTest {
//
//    private static double totalCost;
//    private static double twoMins;
//    private static final double PRECISION = 0.00001;
//
//    @BeforeAll
//    static void init () {
//        totalCost = 0.0;
//        twoMins = 2;
//    }
//
//    @DisplayName("Basin City exactly 2 minutes")
//    @Test
//    void callCost_locationBC_minutes2_correctReturn () {
//        totalCost = PayPhone.callCost(twoMins, 1.47, .45, "555-432-9873");
//        assertEquals(1.47, totalCost, PRECISION);
//    }
//
//    @DisplayName("Ambridge exactly 2 minutes")
//    @Test
//    void callCost_locationA_minutes2_correctReturn () {
//        totalCost = PayPhone.callCost(twoMins, 1.23, .13, "555-432-9873");
//        assertEquals(1.23, totalCost, PRECISION);
//    }
//
//    @DisplayName("Middlemarch exactly 2 minutes")
//    @Test
//    void callCost_locationMM_minutes2_correctReturn () {
//        totalCost = PayPhone.callCost(twoMins, 1.73, .30, "555-432-9873");
//        assertEquals(1.73, totalCost, PRECISION);
//    }
//
//    @DisplayName("Bright Falls exactly 2 minutes")
//    @Test
//    void callCost_locationBF_minutes2_correctReturn () {
//        totalCost = PayPhone.callCost(twoMins, 0.70, 0.94, "555-432-9873");
//        assertEquals(0.70, totalCost, PRECISION);
//    }
//
//    @DisplayName("Basin City 3 minutes and over")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 7, 8, 9, 10, 13})
//    void callCost_locationBC_minutes3AndOver_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.47, .45, "555-432-9873");
//        assertThat(totalCost, anyOf(closeTo(1.92, PRECISION),closeTo(2.82, PRECISION),
//                closeTo(3.72, PRECISION),
//                closeTo(4.17, PRECISION), closeTo(4.62, PRECISION),
//                closeTo(5.07, PRECISION),
//                closeTo(6.42, PRECISION)));
//    }
//
//    @DisplayName("Ambridge 3 minutes and over")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 6, 7, 9, 10, 15})
//    void callCost_locationA_minutes3AndOver_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.23, .13, "555-432-9873");
//        assertThat(totalCost, anyOf(closeTo(1.36, PRECISION), closeTo(1.62, PRECISION),
//                closeTo(1.75, PRECISION),
//                closeTo(1.88, PRECISION), closeTo(2.14, PRECISION),
//                closeTo(2.27, PRECISION),
//                closeTo(2.92, PRECISION)));
//    }
//
//    @DisplayName("Middlemarch 3 minutes and over")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 4, 6, 7, 10, 12, 17})
//    void callCost_locationMM_minutes3AndOver_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.73, .30, "555-432-9873");
//        assertThat(totalCost, anyOf(closeTo(2.03, PRECISION), closeTo(2.33, PRECISION),
//                closeTo(2.93, PRECISION),
//                closeTo(3.23, PRECISION), closeTo(4.13, PRECISION),
//                closeTo(4.73, PRECISION),
//                closeTo(6.23, PRECISION)));
//    }
//
//    @DisplayName("Bright Falls 3 minutes and over")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 6, 7, 9, 11, 14})
//    void callCost_locationBF_minutes3AndOver_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 0.70, 0.94, "555-432-9873");
//        assertThat(totalCost, anyOf(closeTo(1.64, PRECISION), closeTo(3.52, PRECISION),
//                closeTo(4.46, PRECISION),
//                closeTo(5.40, PRECISION), closeTo(7.28, PRECISION),
//                closeTo(9.16, PRECISION),
//                closeTo(11.98, PRECISION)));
//    }
//
//    //Discount tests
//    @DisplayName("Basin City 3 minutes and over with discount")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 7, 8, 9, 10, 13})
//    void callCost_locationBC_minutes3AndOverWithDiscount_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.47, .45, "655-432-9873");
//        assertThat(totalCost, anyOf(closeTo(1.79, PRECISION),closeTo(2.69, PRECISION),
//                closeTo(3.59, PRECISION),
//                closeTo(4.04, PRECISION), closeTo(4.49, PRECISION),
//                closeTo(4.94, PRECISION),
//                closeTo(6.29, PRECISION)));
//    }
//
//    @DisplayName("Ambridge 3 minutes and over with discount")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 6, 7, 9, 10, 15})
//    void callCost_locationA_minutes3AndOverWithDiscount_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.23, .13, "755-432-9873");
//        assertThat(totalCost, anyOf(closeTo(1.23, PRECISION), closeTo(1.49, PRECISION),
//                closeTo(1.62, PRECISION),
//                closeTo(1.75, PRECISION), closeTo(2.01, PRECISION),
//                closeTo(2.14, PRECISION),
//                closeTo(2.79, PRECISION)));
//    }
//
//    @DisplayName("Middlemarch 3 minutes and over with discount")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 4, 6, 7, 10, 12, 17})
//    void callCost_locationMM_minutes3AndOverWithDiscount_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 1.73, .30, "555-432-9870");
//        assertThat(totalCost, anyOf(closeTo(1.90, PRECISION), closeTo(2.20, PRECISION),
//                closeTo(2.80, PRECISION),
//                closeTo(3.10, PRECISION), closeTo(4.00, PRECISION),
//                closeTo(4.60, PRECISION),
//                closeTo(6.10, PRECISION)));
//    }
//
//    @DisplayName("Bright Falls 3 minutes and over with discount")
//    @ParameterizedTest
//    @ValueSource(doubles = {3, 5, 6, 7, 9, 11, 14})
//    void callCost_locationBF_minutes3AndOverWithDiscount_correctReturn (double minutes) {
//        totalCost = PayPhone.callCost(minutes, 0.70, 0.94, "555-432-9871");
//        assertThat(totalCost, anyOf(closeTo(1.51, PRECISION), closeTo(3.39, PRECISION),
//                closeTo(4.33, PRECISION),
//                closeTo(5.27, PRECISION), closeTo(7.15, PRECISION),
//                closeTo(9.03, PRECISION),
//                closeTo(11.85, PRECISION)));
//    }
//
//}
