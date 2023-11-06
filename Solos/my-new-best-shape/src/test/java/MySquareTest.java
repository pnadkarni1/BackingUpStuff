import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class MySquareTest {
    private MySquare defaultSquare;
    private MySquare builtSquare;
    private static MySquare[] testSquares;

    @BeforeAll
    static void init () {
        testSquares = new MySquare[] {new MySquare(75, 63, 25),
                new MySquare(90, 90, 50), new MySquare(415, 555, 144)};
    }

    @BeforeEach
    void eachInit () {
        defaultSquare = new MySquare();
    }

    @DisplayName("Area for custom square")
    @Test
    void area_customValues100Width75Height_return7500 () {
        builtSquare = new MySquare(30, 50, 32);
        int area = builtSquare.area();
        assertEquals(1024, area);
    }

    @DisplayName("Area for default square")
    @Test
    void area_defaultRectangle_return0 () {
        int area = defaultSquare.area();
        assertEquals(0, area);
    }

    @DisplayName("toString custom rectangle")
    @Test
    void toString_customRectangle () {
        builtSquare = new MySquare(57, 62, 60);
        String display = builtSquare.toString();
        assertEquals("Side: 60 X: 57 Y: 62", display);
    }

    @DisplayName("toString default rectangle")
    @Test
    void toString_defaultRectangle () {
        String display = defaultSquare.toString();
        assertEquals("Side: 0 X: 0 Y: 0", display);
    }

    @DisplayName("Testing size set with same w and h")
    @Test
    void setSize_sameValues_SidesAreSet () {
        builtSquare = testSquares[0];
        builtSquare.setSize(40, 40);
        int side = builtSquare.getWidth();
        assertEquals(40, side);
    }

    @DisplayName("Testing size set with different w and h")
    @Test
    void setSize_differentValues_SidesAreNot () {
        builtSquare = testSquares[1];
        builtSquare.setSize(23, 33);
        int side = builtSquare.getWidth();
        assertEquals(50, side);
    }

    @DisplayName("Testing setSide with single value")
    @Test
    void setSide_singleValue_SidesAreSet () {
        builtSquare = testSquares[2];
        builtSquare.setSide(67);
        int side = builtSquare.getHeight();
        assertEquals(67, side);
    }

    @AfterEach
    void tearDown () {
        defaultSquare = null;
    }

}