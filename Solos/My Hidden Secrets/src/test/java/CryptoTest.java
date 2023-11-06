import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

class CryptoTest {
    Crypto cryptoTest;
    @BeforeEach
    void setup() {

         cryptoTest = new Crypto("hello");

    }

    @DisplayName("Encrypt Method sees if file is already encrypted")
    @Test

    void  encryptMethod_fileAlreadyEncrypted_shouldReturnFalse() {

        assertFalse(cryptoTest.encryptFile("hidden.txt.cyp"));

    }

    @DisplayName("Decrypt Method Wrong File type")
    @Test

    void decryptMethod_wrongFile_shouldReturnFalse () {

        assertFalse(cryptoTest.decryptFile("hidden.txt.cpoy"));

    }

    @DisplayName("ToString Returns proper instance variables")
    @Test

    void toString_sameStringReturn_shouldPass () {

        Crypto test = new Crypto("hello");

        assertEquals(test, cryptoTest);

    }

}