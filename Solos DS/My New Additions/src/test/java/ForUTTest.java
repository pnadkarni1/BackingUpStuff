import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class ForUTTest {

    ForUT utClass;

    @BeforeEach
    void setup () {

        utClass = new ForUT();

    }

    @DisplayName("sum method both positive")
    @Test

    void sum_TwoPos_shouldPass () {

        assertEquals(15, utClass.sum(7, 8));

    }

    @DisplayName("sum method one pos one neg")
    @Test

    void sum_onePosOneNeg_shouldPass () {

        assertEquals(6, utClass.sum(8, -2));

    }

    @DisplayName("sum method two neg")
    @Test

    void sum_twoNeg_shouldPass () {

        assertEquals(-14, utClass.sum(-6, -8));

    }

    @DisplayName("quote method all caps")
    @Test

    void quote_allCaps_shouldPass() {

        String expected = "my phone is broken";

        assertEquals(expected, utClass.quote("MY PHONE IS BROKEN"));

    }

    @DisplayName("quote method all lowercase")
    @Test

    void quote_allLower_shouldPass() {

        String expected = "how is this game going to work";

        assertEquals(expected, utClass.quote("how is this game going to work"));

    }

    @DisplayName("quote method random uppercase")
    @Test

    void quote_randUpperCase_shouldPass() {

        String expected = "why is this stick figure moving";

        assertEquals(expected, utClass.quote("Why iS tHiS sTicK FigUre mOviNg"));

    }

}
