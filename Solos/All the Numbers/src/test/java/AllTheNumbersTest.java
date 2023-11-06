//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.*;
//
//import org.junit.jupiter.api.*;
//
//import java.text.DecimalFormat;
//import java.util.stream.Stream;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class AllTheNumbersTest {
//
//    private static double[] testEvenNumbersOnly;
//    private static double[] testOddNumbersOnly;
//    private static double[] testMixNumbers;
//    private static double[] testLargeNumbers;
//    private static double[] testSmallNumbers;
//    private static double[] testPosNegNumbers;
//    private static double[] testRandoNumbers;
//    private static final double PRECISION = 0.00001;
//
//    @BeforeAll
//    static void setUp () {
//        testEvenNumbersOnly = new double[]{50, 2, 96, 488, 26, 74, 980, 36044};
//        testOddNumbersOnly = new double[]{97, 21, 19, 987, 3353, 1, 79453, 11487};
//        testMixNumbers = new double[]{13, 23, 12, 44, 55};
//        testLargeNumbers = new double[]{389044, 9487652, 8974523, 5419872, 554987236};
//        testSmallNumbers = new double[] {2, 8, 12, 14, 20, 36, 4};
//        testPosNegNumbers = new double[] {92, -18, 412, -514, -120, 36, 19};
//        testRandoNumbers = new double[] {-619, 2185, 1159, -375, -114, 2462, 3938};
//    }
//
//    private static Stream<Arguments> providedNumbers_AllVars() {
//        return Stream.of(
//                Arguments.of(testEvenNumbersOnly, 160308450.28571),
//                Arguments.of(testOddNumbersOnly, 759840432.5),
//                Arguments.of(testMixNumbers, 370.3),
//                Arguments.of(testLargeNumbers, 60275718553608216d),
//                Arguments.of(testSmallNumbers, 133.90476)
//        );
//    }
//
//    private static Stream<Arguments> providedNumbers_AllStdDevs() {
//        return Stream.of(
//                Arguments.of(testEvenNumbersOnly, 12661.29734),
//                Arguments.of(testOddNumbersOnly, 27565.20329),
//                Arguments.of(testMixNumbers, 19.24318),
//                Arguments.of(testLargeNumbers, 245511137.3311),
//                Arguments.of(testSmallNumbers, 11.57172)
//        );
//    }
//
//    private static Stream<Arguments> providedNumbers_AllAverages() {
//        return Stream.of(
//                Arguments.of(testPosNegNumbers, -13.285714),
//                Arguments.of(testRandoNumbers, 1233.714285)
//        );
//    }
//
//    @DisplayName("Variance numbers in the array")
//    @ParameterizedTest
//    @MethodSource ("providedNumbers_AllVars")
//    void variance_variousArrays_allValid_returnVariance (double[] arr, double variance) {
//
//        double sum = 0;
//        double sumOfSquares = 0;
//
//        for (double num : arr) {
//            sum += num;
//            sumOfSquares += num * num;
//        }
//
//        double var = AllTheNumbers.variance(sum, arr.length, sumOfSquares);
//
//        DecimalFormat df = new DecimalFormat("#.0000000");
//        var = Double.parseDouble(df.format(var));
//
//        assertEquals(variance, var, PRECISION);
//
//    }
//
//    @DisplayName("Standard deviation numbers in the array")
//    @ParameterizedTest
//    @MethodSource ("providedNumbers_AllStdDevs")
//    void stdDevs_variousArrays_allValid_returnStdDev (double[] arr, double stdDev) {
//
//        double sum = 0;
//        double sumOfSquares = 0;
//
//        for (double num : arr) {
//            sum += num;
//            sumOfSquares += num * num;
//        }
//
//        double standarddev = AllTheNumbers.standarddev(sum, arr.length, sumOfSquares);
//
//        DecimalFormat df = new DecimalFormat("#.0000000");
//        standarddev = Double.parseDouble(df.format(standarddev));
//
//        assertEquals(stdDev, standarddev, PRECISION);
//
//    }
//
//    @DisplayName("Averages numbers in the array")
//    @ParameterizedTest
//    @MethodSource ("providedNumbers_AllAverages")
//    void avgs_variousArrays_allValid_returnAvg (double[] arr, double avg) {
//
//        double sum = 0;
//
//        for (double num : arr) {
//            sum += num;
//        }
//
//        double average = AllTheNumbers.average(sum, arr.length);
//
//        DecimalFormat df = new DecimalFormat("#.0000000");
//        average = Double.parseDouble(df.format(average));
//
//        assertEquals(avg, average, PRECISION);
//
//    }
//
//}