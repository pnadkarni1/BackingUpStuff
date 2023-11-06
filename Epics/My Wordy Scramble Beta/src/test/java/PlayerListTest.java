import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class PlayerListTest {
    private static PlayerList defaultPlayers;

    @BeforeAll
    static void init () {
        defaultPlayers = new PlayerList("players.txt");
    }

    @DisplayName("Checking an existing id in the list")
    @Test
    void containsId_existingId_returnTrue () {
        boolean exists = defaultPlayers.containsId("Fezzik");
        assertTrue(exists);
    }

    @DisplayName("Checking an non-existing id in the list")
    @Test
    void containsId_nonExistingId_returnFalse () {
        boolean exists = defaultPlayers.containsId("DustinJohnson");
        assertFalse(exists);
    }

    @DisplayName("Adding an id to the collection")
    @Test
    void addPlayer_validPlayer_returnTrue () {
        Player temp = new Player("larry", "geez", 4, 5, 4);
        boolean added = defaultPlayers.addPlayer(temp);
        assertTrue(added);
    }

    @DisplayName("Adding a null Player to the list")
    @Test
    void addPlayer_nullPlayer_returnFalse () {
        Player temp = null;
        boolean added = defaultPlayers.addPlayer(temp);
        assertFalse(added);
    }

    @DisplayName("Adding a Player to the list checking id when added")
    @Test
    void addPlayer_validPlayerCheckID_returnTrue () {
        Player temp = new Player("Rufus", "harmony", 9, 11, 33);
        defaultPlayers.addPlayer(temp);
        boolean exists = defaultPlayers.containsId("Rufus");
        assertTrue(exists);
    }

    @DisplayName("Authenticate a player who is found")
    @Test
    void authenticate_validPlayer_returnPlayer () {
        Player expectedPlayer = new Player ("Buttercup", "LightningSand", 2, 9, 21);
        defaultPlayers.addPlayer(expectedPlayer);
        Player lookingPlayer = new Player("Buttercup");
        lookingPlayer.setPass("LightningSand");
        Player temp = defaultPlayers.authenticate(lookingPlayer);
        assertEquals(expectedPlayer, temp);
    }

    @DisplayName("Authenticate a player who is not found")
    @Test
    void authenticate_notValidPlayer_returnNull () {
        Player lookingPlayer = new Player("Buttercup");
        lookingPlayer.setPass("Journal");
        Player temp = defaultPlayers.authenticate(lookingPlayer);
        assertEquals(null, temp);
    }

    @AfterAll
    static void tearDown () {
        defaultPlayers = null;
    }
}