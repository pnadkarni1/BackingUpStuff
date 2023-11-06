import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MusicOrganizerTest {
    MusicOrganizer musicOrganizer;

    @BeforeEach
    void setup() {

        musicOrganizer = new MusicOrganizer();

    }

    @DisplayName("Print to Console")
    @Test

    void callingPrintToConsole_shouldReturnFalse() {

        assertEquals(false, musicOrganizer.printToConlsole("Could not find file"));

    }

    @DisplayName("Print to New File")
    @Test

    void printToNewFile_printingToMusicLibrary_shouldReturnFalse() {

        assertEquals(false, musicOrganizer.printToNewFile("musiclibrary.txt", "Could Not Find album Pink Tape"));

    }



    @DisplayName("Add new album")
    @Test

    void addingNewAlbum_shouldReturnFalse() {

        assertEquals(false, musicOrganizer.addNewAlbum("Travis Scott", "Utopia", "IDK", "1", "1", "1", "Trash"));

    }
    @DisplayName("Update Review")
    @Test

    void updatingReviewOfAlbumUtopia_shouldReturnDidNotFindAlbum() {

        assertEquals(Color.RED_UNDERLINE + "Did not find album" + Color.RESET, musicOrganizer.updateReview("Utopias", "Very Good Album"));

    }

    @DisplayName("Finding Artist Tyler, the Creator")
    @Test

    void findArtistMethod_tryingToFindTylerTheCreatorAlbum_shouldReturnAlbum() {

        assertEquals("Artist: Tyler, the Creator\n" +
                "Album Title: Igor\n" +
                "Label: Columbia Records\n" +
                "Peak Position: 1\n" +
                "Peak Date: June 1, 2019\n" +
                "Weeks on Chart: 206\n" +
                "Review: \"The album really made me get into rap. Personally one of my favorites.\"", musicOrganizer.findArtist("Tyler, the Creator", ""));

    }

}