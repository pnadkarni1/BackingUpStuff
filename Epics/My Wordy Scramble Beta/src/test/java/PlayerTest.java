import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerTest {
    private Player defaultPlayer;
    private Player customPlayer;

    @BeforeEach
    void setUp () {
        defaultPlayer = new Player("default");
    }

    @DisplayName("Default player all defaults print")
    @Test
    void toString_defaultPlayer_return0sOnPrints () {
        String expected = "Id: default\n" +
                "Total Rounds Played: 0\n" +
                "Total Words Found: 0\n" +
                "Total Points Earned: 0\n" +
                "Average Words Found: 0.0\n" +
                "Average Points Earned: 0.0";
        String received = defaultPlayer.toString();
        assertEquals(expected, received);
    }

    @DisplayName("Custom player specific prints, simple averages")
    @Test
    void toString_customPlayer_returnCustomPrints () {
        customPlayer = new Player ("Po", "kung", 4, 20, 32);
        String expected = "Id: Po\n" +
                "Total Rounds Played: 4\n" +
                "Total Words Found: 20\n" +
                "Total Points Earned: 32\n" +
                "Average Words Found: 5.0\n" +
                "Average Points Earned: 8.0";
        String received = customPlayer.toString();
        assertEquals(expected, received);
    }

    @DisplayName("Custom player increase stats from original")
    @Test
    void toString_customPlayerIncreaseStats_returnCustomPrints () {
        customPlayer = new Player ("Po", "kung", 4, 20, 32);
        customPlayer.addPoints(28);
        customPlayer.addRounds(1);
        customPlayer.addWords(10);
        String expected = "Id: Po\n" +
                "Total Rounds Played: 5\n" +
                "Total Words Found: 30\n" +
                "Total Points Earned: 60\n" +
                "Average Words Found: 6.0\n" +
                "Average Points Earned: 12.0";
        String received = customPlayer.toString();
        assertEquals(expected, received);
    }

    @AfterEach
    void tearDown () {
        defaultPlayer = null;
        customPlayer = null;
    }

}