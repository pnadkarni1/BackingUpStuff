import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class OurZooTest {

    OurZoo ourZooTest;
    OurZoo ourZooLogicalTest;

    @BeforeEach
    void setup() {

        ourZooTest = new OurZoo();

        String[] test = {"test", "life", "is", "good"};

        ourZooLogicalTest = new OurZoo(test);

    }

    @DisplayName("Get Method: Get the animal at -1.")
    @Test
    @Order(1)

    void  gettingValueAtNegativeIndex_shouldReturnNull() {

        assertEquals(Color.RED_UNDERLINE + "Index does not exist within the list of animals" + Color.RESET, ourZooTest.getValue(-1));

    }
    @DisplayName("Get Method at Index: Get the animal at 3")
    @Test
    @Order(2)


    void  gettingValueAt3_shouldReturn_hippocamp() {

        assertEquals(Color.GREEN_UNDERLINE + "jackalope" + Color.RESET, ourZooTest.getValue(3));

    }

    @DisplayName("Get Method at letter: Get the animal with letter 'y'")
    @Test
    @Order(3)


    void  gettingValueWithLetterY_shouldReturn_yuanti() {

        assertEquals(Color.GREEN_UNDERLINE +"yuan-ti"+Color.RESET, ourZooTest.getValue("y"));

    }

    @DisplayName("Get Method at Letter: Get the animal with letter 't'")
    @Test
    @Order(4)


    void  gettingValueWithLetterT_shouldReturnNull() {

        assertEquals(Color.RED_UNDERLINE + "No animal found" + Color.RESET, ourZooTest.getValue("t"));

    }

    @DisplayName("Get Method at Letter nth time: Get the animal with letter d second time")
    @Test
    @Order(5)


    void  addingAnimalDog_gettingValueWithLetterDsecondTime_shoudlReturnNotWorking() {

        assertNotEquals("dog", ourZooTest.getValue("d", 2));

    }

    @DisplayName("Get Method at Letter nth time: Get the animal with letter p second time")
    @Test
    @Order(6)


    void  gettingValueWithLetterPSecondTime_shouldReturnNoAnimalFound() {

        assertEquals(Color.GREEN_UNDERLINE + "panther" + Color.RESET, ourZooTest.getValue("p", 1));

    }

    @DisplayName("Set Method: Setting animal at index 11")
    @Test
    @Order(7)


    void  settingValueAtIndex11_shouldReturnFalse() {

        assertEquals(false, ourZooTest.setValue("dog", 11));

    }

    @DisplayName("Set Method: Setting animal")
    @Test
    @Order(8)


    void  settingValueRoc_shouldReturnTrue() {

        assertEquals(true, ourZooTest.setValue("roc", 3));

    }

    @DisplayName("Delete Value Method with only index: Deleteing Value at index 2")
    @Test
    @Order(9)


    void  deletingValueAtIndexTwo_shouldReturnHippocamp() {

        assertEquals(Color.GREEN_UNDERLINE + "hippocamp" + Color.RESET, ourZooTest.deleteValue(2));

    }

    @DisplayName("Delete Value with only index: Deleting Value at -1")
    @Test
    @Order(10)


    void  deletingValueAtIndexNegative_shouldReturnNull() {

        assertEquals(Color.RED_UNDERLINE + "Index does not exist within the list of animals" + Color.RESET, ourZooTest.deleteValue(-1));

    }

    @DisplayName("Delete Value with only letter: Deleting value with letter d")
    @Test
    @Order(11)


    void  deletingValueWithLetterD_shouldReturnDisplacer() {

        assertEquals(Color.GREEN_UNDERLINE + "displacer" + Color.RESET, ourZooTest.deleteValue("displacer"));

    }

    @DisplayName("Delete Value with only letter: Deleting value with letter a")
    @Test
    @Order(12)


    void  deletingValueWithLetterA_shouldReturnNoAnimalFound() {

        assertEquals(Color.RED_UNDERLINE + "No animal with that name found in the list" + Color.RESET, ourZooTest.deleteValue("a"));

    }

    @DisplayName("Delete value with letter at nth: Deleting value with letter d second time")
    @Test
    @Order(13)


    void  addingAnimalDog_deletingValueWithLetterDSecondTime_shouldReturnDog() {

        assertEquals(Color.GREEN_UNDERLINE + "displacer" + Color.RESET, ourZooTest.deleteValue("d", 1));

    }

    @DisplayName("Delete value with letter nth: Deletive value with letter p second time")
    @Test
    @Order(14)


    void  deletingValueWithLetterPSecondTime_shouldReturnNoAnimalFound() {

        assertEquals(Color.GREEN_UNDERLINE + "panther" + Color.RESET, ourZooTest.deleteValue("p", 1));

    }

    @DisplayName("Animal List Logical Size: Check to see if logical size is 10")
    @Test
    @Order(15)


    void  gettingAnimalListLogical_shouldReturn10() {

        assertEquals(10, ourZooTest.getAnimalsLogical());

    }

    @DisplayName("Animal List Logical Size using different constructor: Check to see if logical size of different animal list is 4")
    @Test
    @Order(16)


    void  gettingAnimalListLogical_usingDifferentConstructor_shouldReturn4() {

        assertEquals(4, ourZooLogicalTest.getAnimalsLogical());

    }

    @DisplayName("New Animal list logical: check to see if logical size is 1")
    @Test
    @Order(17)


    void  addingNewAnimalToList_callingNewAnimalLogical_shouldReturn1() {

        ourZooTest.insertValue("dog", true);

        assertEquals(1, ourZooTest.getNewAnimalsLogical());

    }

    @DisplayName("New Animal List logical: check to see if logical size is 0 without adding new animal")
    @Test
    @Order(18)


    void  callingGetNewAnimalLogicalSize_shouldReturn0() {

        assertEquals(0, ourZooTest.getNewAnimalsLogical());

    }

    @DisplayName("Save list: saving list with no new animals")
    @Test
    @Order(19)


    void savingListWithNoNewAnimals_shouldReturnFalse () {

        assertEquals(false, ourZooTest.saveList());

    }


}