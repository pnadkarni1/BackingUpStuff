import org.junit.jupiter.api.*;

import java.io.*;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SpottersTeamTest {
    private SpottersTeam testTeam;

    private static ArrayList<HockeyPlayer> testTeamGoodEverything;
    private static ArrayList<HockeyPlayer> testTeamGoodForFile;
    private static ArrayList<HockeyPlayer> testTeamBadOrder;
    private static ArrayList<HockeyPlayer> testTeamBadSalaryTooHigh;
    private static ArrayList<HockeyPlayer> testTeamBadSalaryTooLow;
    private static String correctPositionOrder;

    @BeforeAll
    static void init () {
        testTeamGoodForFile = new ArrayList<>();
        testTeamGoodForFile.add(new HockeyPlayer("Jones", 22, "Center", 43000));
        testTeamGoodForFile.add(new HockeyPlayer("Clark", 26, "Left wing", 57000));
        testTeamGoodForFile.add(new HockeyPlayer("Brown", 20, "Right wing", 54250));
        testTeamGoodForFile.add(new HockeyPlayer("Chase", 27, "Left defense", 64790));
        testTeamGoodForFile.add(new HockeyPlayer("Murphy", 21, "Right defense", 44900));
        testTeamGoodForFile.add(new HockeyPlayer("Gold", 24, "Goalie", 26900));

        testTeamBadOrder = new ArrayList<>();
        testTeamBadOrder.add(new HockeyPlayer("Carr", 22, "Center", 40000));
        testTeamBadOrder.add(new HockeyPlayer("Wheeler", 26, "Left wing", 54000));
        testTeamBadOrder.add(new HockeyPlayer("Bell", 20, "Right wing", 51250));
        testTeamBadOrder.add(new HockeyPlayer("Hart", 27, "Right defense", 61790));
        testTeamBadOrder.add(new HockeyPlayer("Thomas", 21, "Left defense", 41900));
        testTeamBadOrder.add(new HockeyPlayer("Jackson", 24, "Goalie", 23900));

        testTeamBadSalaryTooHigh = new ArrayList<>();
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Carr", 22, "Center", 60000));
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Wheeler", 26, "Left wing", 74000));
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Bell", 20, "Right wing", 51250));
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Hart", 27, "Left defense", 61790));
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Thomas", 21, "Right defense", 61900));
        testTeamBadSalaryTooHigh.add(new HockeyPlayer("Jackson", 24, "Goalie", 63900));

        testTeamBadSalaryTooLow = new ArrayList<>();
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Carr", 22, "Center", 6000));
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Wheeler", 26, "Left wing", 7400));
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Bell", 20, "Right wing", 5125));
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Hart", 27, "Left defense", 6179));
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Thomas", 21, "Right defense", 6190));
        testTeamBadSalaryTooLow.add(new HockeyPlayer("Jackson", 24, "Goalie", 6390));

        correctPositionOrder = "Center, Left wing, Right wing, Left defense, Right defense, Goalie";

    }

    @BeforeEach
    void setUp () {
        testTeam = new SpottersTeam();

        testTeamGoodEverything = new ArrayList<>();
        testTeamGoodEverything.add(new HockeyPlayer("Carr", 22, "Center", 40000));
        testTeamGoodEverything.add(new HockeyPlayer("Wheeler", 26, "Left wing", 65000));
        testTeamGoodEverything.add(new HockeyPlayer("Bell", 20, "Right wing", 51250));
        testTeamGoodEverything.add(new HockeyPlayer("Hart", 27, "Left defense", 61790));
        testTeamGoodEverything.add(new HockeyPlayer("Thomas", 21, "Right defense", 41900));
        testTeamGoodEverything.add(new HockeyPlayer("Jackson", 24, "Goalie", 23900));
    }



    @DisplayName("Printing out the entire team object")
    @Test
    void toString_testTeamGood_returnStringDisplay () {
        testTeam.setTeam(testTeamGoodEverything);
        String correctOutput = "center: carr\n" +
                "left wing: wheeler\n" +
                "right wing: bell\n" +
                "left defense: hart\n" +
                "right defense: thomas\n" +
                "goalie: jackson";

        String receivedOuput = testTeam.toString().trim().toLowerCase();

        assertEquals(correctOutput, receivedOuput);
    }

    @DisplayName("Display a single player on the team")
    @Test
    void displayPlayer_playerOnTeam_returnStringDisplay () {
        testTeam.setTeam(testTeamGoodEverything);
        String receivedOutput = testTeam.displayPlayer("Hart");
        String expectedOutput = "Player: Hart\nPosition: Left defense\nSalary: 61790";

        assertEquals(expectedOutput, receivedOutput);
    }

    @DisplayName("Display a player not on the team")
    @Test
    void displayPlayer_playerNotOnTeam_returnNoNameString () {
        testTeam.setTeam(testTeamGoodEverything);
        String receivedOutput = testTeam.displayPlayer("Ruth");
        String expectedOutput = "No player on team with name Ruth";

        assertEquals(expectedOutput, receivedOutput);
    }

    @DisplayName("Add a player to the team (cheaper salary) and good age")
    @Test
    void addPlayer_replacingLeftWing_returnStringDisplay () {
        testTeam.setTeam(testTeamGoodEverything);
        boolean signed = testTeam.signPlayer(new HockeyPlayer("Franks", 23, "Left wing", 64000));

        assertTrue(signed);
    }

    @DisplayName("Add a player to the team (more expensive salary) shouldn't be added")
    @Test
    void addPlayer_replacingLeftWingMoreExpensive_returnOriginalTeam () {
        testTeam.setTeam(testTeamGoodEverything);
        boolean signed = testTeam.signPlayer(new HockeyPlayer("Franks", 23, "Left wing", 93000));

        assertFalse(signed);
    }

    @DisplayName("Add a player to the team over age limit shouldn't be added")
    @Test
    void addPlayer_replacingLeftWingOlderAge_returnOriginalTeam () {
        testTeam.setTeam(testTeamGoodEverything);
        boolean signed = testTeam.signPlayer(new HockeyPlayer("Franks", 33, "Left wing", 13000));

        assertFalse(signed);
    }

    @DisplayName("Create team checking salary less than $305,000")
    @Test
    void createTeamAndSalary_returnTrue () {
        testTeam.createTeam();
        int salary = testTeam.totalSalary();
        assertTrue(305000 >= salary && 275000 <= salary);
    }

    @DisplayName("Create team checking all positions filled")
    @Test
    void createTeamAndPositions_returnEqual () {
        testTeam.createTeam();
        StringBuilder positions = new StringBuilder();
        for (HockeyPlayer player : testTeam.getTeam()) {
            positions.append(player.getPosition() + ", ");
        }
        String builtOutput = positions.toString().substring(0, positions.length()-2);
        assertEquals(correctPositionOrder, builtOutput);
    }

    @DisplayName("Create team exact salary")
    @Test
    void createTeamExactSalary_returnEqual () {
        testTeam.createTeam();
        int teamSalary = testTeam.totalSalary();
        assertEquals(293150, teamSalary);
    }

    @DisplayName("Create team printed out")
    @Test
    void createTeamPrintedOut_returnEqual () {
        testTeam.createTeam();

        String expectedOutput = "Center: Leila Herman\n" +
                "Left wing: Micky Dominguez\n" +
                "Right wing: Kevin Erdahl\n" +
                "Left defense: Jack Elliot\n" +
                "Right defense: Peter Andersson\n" +
                "Goalie: Amat Davis";

        assertEquals(expectedOutput, testTeam.toString());
    }

    @DisplayName("Correct file gets made")
    @Test
    void sendTeam_fileGetsMade_returnTrue () {
        testTeam.setTeam(testTeamGoodEverything);
        testTeam.sendTeam();
        File file = new File("startinglineup.txt");
        assertTrue(file.exists());
    }

    @DisplayName("File gets filled with correct values")
    @Test
    void sendTeam_fileFilledCorrectly_returnEqual () {
        testTeam.setTeam(testTeamGoodForFile);
        testTeam.sendTeam();

        StringBuilder fromFile = new StringBuilder();
        String builtOutput = "";

        try (FileReader fReader = new FileReader("startinglineup.txt");
             BufferedReader bReader = new BufferedReader(fReader)) {


            String line = bReader.readLine();

            while ((line != null)) {
                fromFile.append(line);
                fromFile.append("\n");
                line = bReader.readLine();
            }

            builtOutput = fromFile.toString().trim();

        } catch (FileNotFoundException noFile) {
            System.out.println("The file was not made, issue with sendTeam method");
        } catch (IOException e) {
            System.out.println("Error reading from file");
        }

        String correctOutput = "Center: Jones 43000\n" +
                "Left wing: Clark 57000\n" +
                "Right wing: Brown 54250\n" +
                "Left defense: Chase 64790\n" +
                "Right defense: Murphy 44900\n" +
                "Goalie: Gold 26900";

        assertEquals(correctOutput, builtOutput);
    }

    @DisplayName("Check toString build order")
    @Test
    void toString_testTeamBad_returnFalse () {
        testTeam.setTeam(testTeamBadOrder);
        String correctOutput = "center: carr\n" +
                "left wing: wheeler\n" +
                "right wing: bell\n" +
                "left defense: hart\n" +
                "right defense: thomas\n" +
                "goalie: jackson";

        String receivedOuput = testTeam.toString().trim().toLowerCase();

        assertNotEquals(correctOutput, receivedOuput);
    }

    @DisplayName("Total Salary too high, testing total salary calculation")
    @Test
    void totalSalary_tooHigh_returnFalse () {
        testTeam.setTeam(testTeamBadSalaryTooHigh);
        int salary = testTeam.totalSalary();
        assertFalse(305000 > salary);
    }

    @DisplayName("Total Salary too low, testing total salary calculation")
    @Test
    void totalSalary_tooLow_returnFalse () {
        testTeam.setTeam(testTeamBadSalaryTooLow);
        int salary = testTeam.totalSalary();
        assertFalse(275000 < salary);
    }

    @DisplayName("Highest Salary player")
    @Test
    void highestSalary_testTeamGood_returnHockeyPlayerHart () {
        testTeam.setTeam(testTeamGoodEverything);
        HockeyPlayer expectedOutput = testTeamGoodEverything.get(1);
        HockeyPlayer receivedPlayer = testTeam.highestSalary();
        assertEquals(expectedOutput, receivedPlayer);
    }

    @DisplayName("Lowest Salary player")
    @Test
    void lowestSalary_testTeamGood_returnHockeyPlayerJackson () {
        testTeam.setTeam(testTeamGoodEverything);
        HockeyPlayer expectedOutput = testTeamGoodEverything.get(5);
        HockeyPlayer receivedPlayer = testTeam.lowestSalary();
        assertEquals(expectedOutput, receivedPlayer);
    }

    @DisplayName("Total salary of the entire team")
    @Test
    void totalSalary_testTeamGood_returnInt () {
        testTeam.setTeam(testTeamGoodEverything);
        assertEquals(283840, testTeam.totalSalary());
    }

    @DisplayName("Average salary per player")
    @Test
    void averageSalary_testTeamGood_returnInt () {
        testTeam.setTeam(testTeamGoodEverything);
        assertEquals(47306, testTeam.averageSalary());
    }

    @AfterEach
    void tearDown () {
        testTeam = null;
    }

}

