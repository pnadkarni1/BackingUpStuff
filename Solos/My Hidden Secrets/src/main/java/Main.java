import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Decrypter userTest = new Decrypter();


        System.out.println(Color.CYAN_BRIGHT_BOLD + "Welcome to the Encrypting and Decrypting Software! Please enter a password before we begin. \n");

        System.out.println(Color.BLUE_BRIGHT_BOLD + "To give you a test before we begin look at the message of a decrypted file, and the password that goes with that\n");

        System.out.println(Color.BLUE_BRIGHT_BOLD + "Message: " + userTest.getMessage());
        System.out.println(Color.BLUE_BRIGHT_BOLD + "Password: " + userTest.getPassword() + "\n");

        String userAnswer = "";



        while (!userAnswer.equals ("3")) {

            System.out.println(Color.CYAN_BRIGHT_BOLD + "What would you like to do: \n" + Color.YELLOW_BRIGHT_BOLD + "1. Encrypt a File \n" + Color.MAGENTA_BRIGHT_BOLD + "2. Decrypt a File \n" + Color.WHITE_BRIGHT_BOLD + "3. Leave the Software \n" +  Color.CYAN_BRIGHT_BOLD + "Please type the number:");
            userAnswer = scanner.nextLine();

            if (userAnswer.equals("1")) {

                System.out.println(Color.CYAN_BRIGHT_BOLD + "Now enter a password for the software. This will determine how the file will be encrypted");
                System.out.println(Color.CYAN_BRIGHT_BOLD + "Password: ");
                String pass = scanner.nextLine();

                Crypto userSoftware = new Crypto(pass);

                System.out.println(Color.YELLOW_BRIGHT_BOLD + "What file would you like to encrypt. It is case sensitive. Include the '.txt'");
                String userFile = scanner.nextLine();
                userSoftware.encryptFile(userFile);

            }else if (userAnswer.equals("2")) {

                System.out.println(Color.CYAN_BRIGHT_BOLD + "Now enter a password for the software. If the password does not match with the password used to encrypt the file, it will not be decrypted.");
                System.out.println(Color.CYAN_BRIGHT_BOLD + "Password: ");
                String pass = scanner.nextLine();

                Crypto userSoftware = new Crypto(pass);

                System.out.println(Color.MAGENTA_BRIGHT_BOLD + "What file would you like to dencrypt. It is case sensitive. Include the '.txt.cyp'");
                String userFile = scanner.nextLine();
                userSoftware.decryptFile(userFile);

            }

        }

        System.out.println(Color.CYAN_BRIGHT_BOLD + "Thank You for using the Software. Have a Great Day.");

    }

}
