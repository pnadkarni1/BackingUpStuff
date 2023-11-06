import java.io.*;

public class Crypto {
    private String password;
    private int key;
    private int hash;

    public Crypto(String password) {
        this.password = password;
        this.key = generateKey(password);
        this.hash = password.hashCode();
    }

    public boolean encryptFile(String fileName) {

        try (FileReader fileReader = new FileReader(fileName); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            try {

                int possibleHash = Integer.parseInt(reader.readLine());

                System.out.println(Color.RED_BRIGHT_BOLD + "File appears to already be encrypted" + "\n");
                return false;

            }catch (NumberFormatException num) {

                reader.close();

                try (FileReader newFileReader = new FileReader(fileName); BufferedReader newReader = new BufferedReader(newFileReader)) {

                    try(FileWriter fileWriter = new FileWriter(fileName + ".cyp");
                        BufferedWriter writer = new BufferedWriter(fileWriter)) {

                        writer.write(hash + "\n");

                        while ((line = newReader.readLine()) != null) {

                            for (int i = 0; i < line.length(); i++) {

                                int encryptChar = line.charAt(i);

                                int ogChar = (encryptChar + key) % 256;

                                writer.write((char) ogChar);

                            }

                            writer.write("\n");

                        }

                        writer.close();

                    }

                    newReader.close();

                }catch (FileNotFoundException badFile) {

                    System.out.println(Color.RED_BRIGHT_BOLD + "Cannot Find File" + "\n");
                    badFile.printStackTrace();

                    return false;

                }catch(IOException e) {

                    System.out.println(Color.RED_BRIGHT_BOLD + "Error decrypting file." + "\n");
                    e.printStackTrace();
                    return false;
                }
            }

        }catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_BRIGHT_BOLD + "Cannot Find File" + "\n");
            badFile.printStackTrace();

            return false;

        }catch(IOException e) {

            System.out.println(Color.RED_BRIGHT_BOLD + "Error trying to Encrypt" + "\n");
            e.printStackTrace();
            return false;

        }

        System.out.println(Color.GREEN_BRIGHT_BOLD + "File successfully encrypted." + "\n");
        return true;
    }

    public boolean decryptFile(String fileName) {

        if (fileName.substring(fileName.lastIndexOf(".")).equals(".txt") ||
                fileName.substring(fileName.lastIndexOf(".")).equals(".cpoy")) {

            System.out.println(Color.RED_BRIGHT_BOLD + "Wrong File Type" + "\n");

            return false;

        }

        try (FileReader fileReader = new FileReader(fileName); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            String fileHash = reader.readLine();

            if (Integer.parseInt(fileHash) == hash) {



                try(FileWriter fileWriter = new FileWriter(fileName.substring(0, fileName.lastIndexOf(".")) + ".cpoy");
                    BufferedWriter writer = new BufferedWriter(fileWriter)) {

                    while ((line = reader.readLine()) != null) {

                        for (int i = 0; i < line.length(); i++) {

                            int encryptChar = line.charAt(i);

                            int ogChar = (encryptChar - key + 256) % 256;

                            writer.write((char) ogChar);

                        }

                        writer.write("\n");

                    }

                }catch (FileNotFoundException badFile) {

                    System.out.println(Color.RED_BRIGHT_BOLD + "Cannot Find File" + "\n");
                    badFile.printStackTrace();

                    return false;

                }catch(IOException e) {

                    System.out.println(Color.RED_BRIGHT_BOLD + "Error decrypting file." + "\n");
                    e.printStackTrace();
                    return false;
                }



            }else {

                System.out.println(Color.RED_BRIGHT_BOLD + "File hash does not match with given hash. Incorrect Password" + "\n");

                return false;

            }



        }catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_BRIGHT_BOLD + "Cannot Find File" + "\n");
            badFile.printStackTrace();

            return false;

        }catch(IOException e) {

            System.out.println(Color.RED_BRIGHT_BOLD + "Error decrypting file." + "\n");
            e.printStackTrace();
            return false;
        }

        System.out.println(Color.GREEN_BRIGHT_BOLD + "File successfully decrypted" + "\n");
        return true;

    }

    @Override
    public String toString() {
        return "Password: " + password + "\nKey: " + key + "\nHash: " + hash;
    }

    private int generateKey(String password) {

        return (password.length() % 255) + 1;
    }
}