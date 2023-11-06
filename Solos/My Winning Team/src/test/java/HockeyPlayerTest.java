import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class HockeyPlayerTest {
    private HockeyPlayer player;

    @DisplayName("toString for a normal player")
    @Test
    void toString_normalPlayer_returnStringDisplay () {
        player = new HockeyPlayer("Homer Simpson", 40, "Center", 140000);
        assertEquals("Player: Homer Simpson\nPosition: Center\nSalary: 140000",
                player.toString());
    }

    @DisplayName("Getting the salary amount of a player")
    @Test
    void getSalary_normalPlayer_returnInt () {
        player = new HockeyPlayer("Eric Cartman", 11, "Left Wing", 71908);
        assertEquals(71908, player.getSalary());
    }

    @DisplayName("Setting the salary amount of a player")
    @Test
    void setSalary_normalPlayer () {
        player = new HockeyPlayer("James Murphy", 27, "Left Defense", 8);
        player.setSalary(43900);
        assertEquals(43900, player.getSalary());
    }

    @DisplayName("Setting the position of a player")
    @Test
    void setPosition_normalPlayer () {
        player = new HockeyPlayer("Devin Chase", 29, "Center", 71908);
        player.setPosition("Right Wing");
        assertEquals("Right Wing", player.getPosition());
    }

}