import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Decrypter {

    private String message;
    private String password;

    public Decrypter() {

        message = "";
        password = "";
        decrypt();

    }

    private void decrypt () {

        try (FileReader file = new FileReader("commonpasses.txt"); BufferedReader passesReader = new BufferedReader (file);
             FileReader cryptFile = new FileReader("hidden.txt.cyp"); BufferedReader cryptReader = new BufferedReader (cryptFile)) {

            String line;

            int hash = Integer.parseInt(cryptReader.readLine());

            while ( (line = passesReader.readLine()) != null ) {

                if (line.hashCode() == hash) {

                    password = line;

                }

            }//end of while loop

            Crypto decrypterClass = new Crypto(password);
            decrypterClass.decryptFile("hidden.txt.cyp");


            FileReader decryptFile = new FileReader("hidden.txt.cpoy"); BufferedReader decryptReader = new BufferedReader (decryptFile);

            String decryptLine;

            while ((decryptLine = decryptReader.readLine()) != null) {

                message += decryptLine + "\n";

            }

        } catch (FileNotFoundException badFile) {

            badFile.printStackTrace();
                System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }

    }

    public String getMessage() {
        return message;
    }

    public String getPassword() {
        return password;
    }
}
