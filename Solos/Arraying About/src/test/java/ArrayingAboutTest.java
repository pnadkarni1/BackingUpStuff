import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import org.junit.jupiter.api.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ArrayingAboutTest {
    private static double[] testPositiveNumbersOnly;
    private static double[] testNegativeNumberOnly;
    private static double[] testMixNumbers;
    private static double[] testDoubleNumbers;
    private static double[] testExtremes;
    private static final double PRECISION = 0.00000001;

    @BeforeAll
    static void setUp () {
        testPositiveNumbersOnly = new double[]{13, 1, 21, 42.5, 15, 3, 9.9, 43, 43.1};
        testNegativeNumberOnly = new double[]{-3, -19.7, -11, -29, -15, -4, -1, -0.5, -33};
        testMixNumbers = new double[]{17, -1, 0, 21, 5, 3, 44, -67, 7};
        testDoubleNumbers = new double[]{2, -3, -3, 6, 19, 21, 21, 0, 0, 1, 3};
        testExtremes = new double[] {
                -179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368.0000000000000000,
                179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368.0000000000000000,
                0
        };
    }

    private static Stream<Arguments> providedNumbers_allMaximums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 43.1),
                Arguments.of(testNegativeNumberOnly, -0.5),
                Arguments.of(testMixNumbers, 44),
                Arguments.of(testDoubleNumbers, 21),
                Arguments.of(testExtremes,
                        179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368.0000000000000000
                )
        );
    }

    @DisplayName("Maximum number in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allMaximums")
    void max_variousArrays_allValid_returnMaximumNumber (double[] arr, double maxValue) {
        double max = ArrayingAbout.max(arr);
        assertEquals(maxValue, max);

    }

    private static Stream<Arguments> providedNumbers_allMinimums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 1),
                Arguments.of(testNegativeNumberOnly, -33),
                Arguments.of(testMixNumbers, -67),
                Arguments.of(testDoubleNumbers, -3),
                Arguments.of(testExtremes,
                        -179769313486231570814527423731704356798070567525844996598917476803157260780028538760589558632766878171540458953514382464234321326889464182768467546703537516986049910576551282076245490090389328944075868508455133942304583236903222948165808559332123348274797826204144723168738177180919299881250404026184124858368.0000000000000000
                )
        );
    }

    @DisplayName("Minimum number in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allMinimums")
    void max_variousArrays_allValid_returnMinimumNumber (double[] arr, double minValue) {
        double min = ArrayingAbout.min(arr);
        assertEquals(minValue, min);

    }

    private static Stream<Arguments> providedNumbers_allSums() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 191.5),
                Arguments.of(testNegativeNumberOnly, -116.2),
                Arguments.of(testMixNumbers, 29),
                Arguments.of(testDoubleNumbers, 67),
                Arguments.of(testExtremes, 0)
        );
    }

    @DisplayName("Sum of all numbers in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allSums")
    void max_variousArrays_allValid_returnSumNumber (double[] arr, double sumValue) {
        double sum = ArrayingAbout.sum(arr);
        assertEquals(sumValue, sum);

    }

    private static Stream<Arguments> providedNumbers_allAve() {
        return Stream.of(
                Arguments.of(testPositiveNumbersOnly, 21.2777777778),
                Arguments.of(testNegativeNumberOnly, -12.9111111111),
                Arguments.of(testMixNumbers, 3.22222222),
                Arguments.of(testDoubleNumbers, 6.0909090909),
                Arguments.of(testExtremes, 0)
        );
    }

    @DisplayName("Average of all numbers in the array")
    @ParameterizedTest
    @MethodSource ("providedNumbers_allAve")
    void max_variousArrays_allValid_returnAveNumber (double[] arr, double aveValue) {
        double ave = ArrayingAbout.ave(arr);
        assertEquals(aveValue, ave, PRECISION);

    }

}