import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListMovieTest {

    LinkedListMovie listMovie;

    Movie mi7;
    Movie uncharted;
    Movie kkid;

    @BeforeEach

    void setup () {

        mi7 = new Movie("Mission Impossible 7", "Christopher McQuarrie");
        mi7.setRating("PG-13");
        mi7.setPlot("A submarine AI has gone wrong and is planning to end the world. Spies from other nations attempt to stop it. Part 1 of 2 Part Movie");
        mi7.setReleaseYear(2023);
        mi7.setRuntimeInMinutes(162);

        uncharted = new Movie("Uncharted", "Ruben Fleischer");
        uncharted.setRating("PG-13");
        uncharted.setPlot("Younger brother attempts to find older brother, but gets caught up in a treasure hunt.");
        uncharted.setReleaseYear(2022);
        uncharted.setRuntimeInMinutes(116);

        kkid = new Movie("The Karate Kid", "John G. Avildsen");
        kkid.setRating("PG");
        kkid.setPlot("Kid gets bullied and enters a karate competition. He finds a sensei to win the competition.");
        kkid.setReleaseYear(1983);
        kkid.setRuntimeInMinutes(122);

        listMovie = new LinkedListMovie();

        listMovie.newHeadNode(kkid);
        listMovie.newHeadNode(uncharted);
        listMovie.newHeadNode(mi7);

    }

    @DisplayName("Test isEmpty Method with items in list")
    @Test

    void testIsEmptyMethod_shouldReturnFalse () {

        assertEquals(false, listMovie.isEmpty());

    }

    @DisplayName("Testing getHeadNode Method should return MI7 Node. Testing by toString Method")
    @Test

    void testGetHeadNodeMethod_shouldReturnMI7Movie_testingforToString () {

        Node head = (Node) listMovie.getHeadNode();
        Movie movie = (Movie) head.getData();

        assertEquals(mi7.toString(), movie.toString());

    }

    @DisplayName("Testing setHeadNode Method. Should overwrite all head node. Testing through toString")
    @Test

    void testSetHeadNodeMethod_testingThroughToString () {

        Movie hitman = new Movie("Hitman: Agent 47", "Aleksander Bach");
        hitman.setRating("R");
        hitman.setPlot("A hitman attempts to kill his target, but faces some challenges.");
        hitman.setReleaseYear(2015);
        hitman.setRuntimeInMinutes(96);

        listMovie.setHeadNode(new Node((Movie) hitman, null));

        String expected = hitman.toString() + "\n\n" + uncharted.toString() + "\n\n" + kkid.toString() + "\n\n";

        assertEquals(expected, listMovie.toString());

    }
    @DisplayName("Testing removeHead Method. Should return the first node in list MI7")
    @Test

    void testingRemoveHeadMethod_shouldReturnMI7Node () {

        Movie movie = (Movie) listMovie.removeHead();

        assertEquals(mi7.toString(), movie.toString());

    }
    @DisplayName("Testing removeFromTailMethod. Should Return Fox Movie")
    @Test

    void testingRemoveFromTailMethod_shouldReturnFoxMovie () {

        Movie movie = (Movie) listMovie.removeFromTail();

        assertEquals(kkid.toString(), movie.toString());

    }
    @DisplayName("Testing Sort Method. Should Sort Movies by Title")
    @Test

    void testingSortMethod_shouldReturnInOrderByTitle () {

        String expected = mi7.toString() + "\n\n" + kkid.toString() + "\n\n" + uncharted.toString() + "\n\n";

        assertEquals(expected, listMovie.sortMovies(1));

    }


    @DisplayName("Testing Total Runtime Method: Should Return 6:40:00")
    @Test

    void testingTotalRuntimeMethod_shouldReturnProperRuntime () {

        assertEquals("6:40:00", listMovie.totalRuntime());

    }


    @DisplayName("Testing Movies of Certain Rating Method. Testing PG Movies should return Karate Kid")
    @Test

    void testingMoviesOfCertainRation_shouldReturnKarateKid () {

        assertEquals(kkid.toString() + "\n\n", listMovie.moviesOfRating(2));

    }


    @DisplayName("Testing findPlot Method. Asking for Karate Kid Plot")
    @Test

    void testingFindPlotMethod_shouldReturnKarateKidPlot () {

        assertEquals(kkid.getPlot(), listMovie.findPlot("The Karate Kid"));

    }


    @DisplayName("Get Max and Min Runtimes. Should give MI7 higest, Uncharted lowest")
    @Test

    void testingMaxAndMinRuntime_shouldReturnMI7AndUncharted () {

        assertEquals("\nHighest:\n\n" + mi7.toString() + "\n\nLowest:\n\n" + uncharted.toString()+ "\n\n", listMovie.getMaxAndMinRuntime());

    }

}