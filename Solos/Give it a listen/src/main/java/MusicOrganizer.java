import java.io.*;
import java.util.Scanner;
public class MusicOrganizer {

    String[][] library;

    public MusicOrganizer() {

        int albums = 1;

        try (FileReader fileReader = new FileReader("musiclibrary.txt"); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            while ((line = reader.readLine()) != null) {

                if (line.isEmpty()) {

                    albums++;

                }
            }

        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE+"Couldn't find file"+ Color.RESET);

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE+"Error reading from file"+ Color.RESET);

        }

        library = new String[albums][7];

        try (FileReader fileReader = new FileReader("musiclibrary.txt"); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;
            int row = 0;
            int col = 0;

            while (row < library.length) {

                if ((line = reader.readLine()) != null) {

                    if (!line.isEmpty()) {
                        String[] details = line.split(": ");

                        library[row][col] = details
                                [1];

                        col++;

                    } else {

                        row++;
                        col = 0;

                    }
                } else {
                    break;
                }

            }
        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE+"Couldn't find file"+ Color.RESET);

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE+"Error reading from file"+ Color.RESET);

        }
    }

    public boolean printToConlsole(String text) {

        if (!text.equalsIgnoreCase("")) {

            return false;

        }

        for (int i = 0; i < library.length; i++) {

            System.out.println(Color.GREEN_BRIGHT_BOLD+"Artist: " + library[i][0]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Album Title: " + library[i][1]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Label: " + library[i][2]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Peak Position: " + library[i][3]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Peak Date: " + library[i][4]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Weeks on Chart: " + library[i][5]+ Color.RESET);
            System.out.println(Color.GREEN_BRIGHT_BOLD+"Review: " + library[i][6]+ Color.RESET);
            if (i != library.length - 1) {System.out.println();}

        }

        return true;

    }

    public boolean printToNewFile(String file, String text) {

        if (text.contains("Could Not Find")) {return false;}

        try (FileWriter fileWriter = new FileWriter(file, false); BufferedWriter writer = new BufferedWriter(fileWriter)) {
            if (!text.equalsIgnoreCase("")) {

                writer.write(text);
                return true;

            }
            for (int i = 0; i < library.length; i++) {

                writer.write("Artist: " + library[i][0]);
                writer.newLine();
                writer.write("Album Title: " + library[i][1]);
                writer.newLine();
                writer.write("Label: " + library[i][2]);
                writer.newLine();
                writer.write("Peak Position: " + library[i][3]);
                writer.newLine();
                writer.write("Peak Date: " + library[i][4]);
                writer.newLine();
                writer.write("Weeks on Chart: " + library[i][5]);
                writer.newLine();
                writer.write("Review: " + library[i][6]);

                if (i != library.length - 1) {
                    writer.newLine();
                    writer.newLine();
                }

            }

        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE+"Bad File" + Color.RESET);
            return false;

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE+"Error trying to write into file"+ Color.RESET);
            return false;

        }

        return true;

    }

    public boolean addNewAlbum(String artist, String album, String label, String peak, String date, String weeks, String review) {


        for (int i = 0; i < library.length; i++) {

            if (library[i][0].equalsIgnoreCase(artist) && library[i][1].equalsIgnoreCase(album)) {

                return false;

            }

        }
        
        String[][] tempLibrary = new String[library.length + 1][7];

        for (int i = 0; i < library.length; i++) {

            tempLibrary[i][0] = library[i][0];
            tempLibrary[i][1] = library[i][1];
            tempLibrary[i][2] = library[i][2];
            tempLibrary[i][3] = library[i][3];
            tempLibrary[i][4] = library[i][4];
            tempLibrary[i][5] = library[i][5];
            tempLibrary[i][6] = library[i][6];

        }

        library = tempLibrary;

        library[library.length - 1][0] = artist;
        library[library.length - 1][1] = album;
        library[library.length - 1][2] = label;
        library[library.length - 1][3] = peak;
        library[library.length - 1][4] = date;
        library[library.length - 1][5] = weeks;
        library[library.length - 1][6] = review;

        try (FileWriter fileWriter = new FileWriter("musiclibrary.txt", true); BufferedWriter writer = new BufferedWriter(fileWriter)) {

            writer.newLine();
            writer.newLine();
            writer.write("Artist: " + artist);
            writer.newLine();
            writer.write("Album Title: " + album);
            writer.newLine();
            writer.write("Label: " + label);
            writer.newLine();
            writer.write("Peak Posistion: " + peak);
            writer.newLine();
            writer.write("Peak Date: " + date);
            writer.newLine();
            writer.write("Weeks on Chart: " + weeks);
            writer.newLine();
            writer.write("Review: \"" + review + "\"");

            writer.close();

        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE + "Could not find file"+ Color.RESET);
            return false;

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE + "Error trying to write into file"+ Color.RESET);
            return false;

        }

        return true;

    }

    public String updateReview(String album, String review) {

        boolean wentIn = false;

        for (int i = 0; i < library.length; i++) {

            if (library[i][1].equalsIgnoreCase(album)) {

                library[i][6] = "\"" + review + "\"";
                wentIn = true;

            }

        }

        if (!wentIn) {

            return Color.RED_UNDERLINE + "Did not find album" + Color.RESET;

        }

        return "Review updated to " + review;

    }


    public String findArtist(String artist, String albumName) {

        String text = "";

        if (albumName.equals("")) {

            for (int i = 0; i < library.length; i++) {

                if (library[i][0].equalsIgnoreCase(artist)) {

                    text = text + "Artist: " + library[i][0] + "\n";
                    text = text + "Album Title: " + library[i][1] + "\n";
                    text = text + "Label: " + library[i][2] + "\n";
                    text = text + "Peak Position: " + library[i][3] + "\n";
                    text = text + "Peak Date: " + library[i][4] + "\n";
                    text = text + "Weeks on Chart: " + library[i][5] + "\n";
                    text = text + "Review: " + library[i][6] + "\n";
                    text = text + "\n";

                }

            }

        } else {

            for (int i = 0; i < library.length; i++) {

                if (library[i][0].equalsIgnoreCase(artist)) {

                    if (library[i][1].equalsIgnoreCase(albumName)) {

                        text = "Artist: " + library[i][0] + "\n";
                        text = text + "Album Title: " + library[i][1] + "\n";
                        text = text + "Label: " + library[i][2] + "\n";
                        text = text + "Peak Position: " + library[i][3] + "\n";
                        text = text + "Peak Date: " + library[i][4] + "\n";
                        text = text + "Weeks on Chart: " + library[i][5] + "\n";
                        text = text + "Review: " + library[i][6];

                        return text;

                    }

                }
            }


        }

        if (text.length() == 0) {

            return Color.RED_UNDERLINE +  "Could Not find album or artist: " + Color.RESET;

        }

        return text.substring(0, text.length() - 2);

    }

    public static void main(String[] args) {

        MusicOrganizer musicOrganizer = new MusicOrganizer();

        boolean stay = true;

        Scanner scanner = new Scanner(System.in);

        while (stay) {

            //Quit -White
            //Print - Green
            //Different File - Magenta
            //New Album - Blue
            //Artist - Cyan
            //Review - Yellow

            System.out.println(Color.RED +"What would you like to do?");
            System.out.println(Color.WHITE+"0: Quit\n" + Color.GREEN +
                    "1: Print all to Console\n" + Color.MAGENTA +
                    "2: Print all to Different File\n" + Color.BLUE +
                    "3: Add new album\n" + Color.CYAN +
                    "4: Find specific artist\n" + Color.YELLOW +
                    "5: Update a review for a particular album"+ Color.RESET);

            String user = scanner.nextLine();

            if (user.equals("0")) {

                stay = false;

            } else if (user.equals("1")) {

                System.out.println("--------------------"+ Color.RESET);
                musicOrganizer.printToConlsole("");
                System.out.println("--------------------"+ Color.RESET);

            } else if (user.equals("2")) {

                System.out.println(Color.MAGENTA_BRIGHT_BOLD+"What would you like the file name to be? (Include .txt)"+ Color.RESET);
                musicOrganizer.printToNewFile(scanner.nextLine(), "");
                System.out.println(Color.MAGENTA_BRIGHT_BOLD+"--------------------"+ Color.RESET);

            } else if (user.equals("3")) {

                System.out.println(Color.BLUE_BRIGHT_BOLD+"What artist would you like to add?"+ Color.RESET);
                String artist = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"What is the name of the album?"+ Color.RESET);
                String album = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"Who is the label of the artist/album?"+ Color.RESET);
                String label = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"What was the peak posistion it reached on the charts?"+ Color.RESET);
                String peak = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"What was the date it peaked at?"+ Color.RESET);
                String date = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"How many weeks has it spent on the charts?"+ Color.RESET);
                String weeks = scanner.nextLine();
                System.out.println(Color.BLUE_BRIGHT_BOLD+"Give a your review of the album?"+ Color.RESET);
                String review = scanner.nextLine();
                if (!musicOrganizer.addNewAlbum(artist, album, label, peak, date, weeks, review)) {

                    System.out.println(Color.RED_UNDERLINE+ "Album already exists" + Color.RESET);
                    
                }else {

                    System.out.println(Color.GREEN_UNDERLINE+ "Success!" + Color.RESET);
                    
                }

            } else if (user.equals("4")) {

                System.out.println(Color.CYAN_BRIGHT_BOLD+"What is the name of the artist?"+ Color.RESET);
                String artist = scanner.nextLine();
                System.out.println(Color.CYAN_BRIGHT_BOLD+ "Would you like a specific album?\n" + Color.CYAN_UNDERLINE +
                        "1: Yes I would like a specific album\n" + Color.CYAN +
                        "2: No get me all the albums of the artist"+ Color.RESET);
                String specificAlbum = scanner.nextLine();

                if (specificAlbum.equalsIgnoreCase("1")) {

                    System.out.println(Color.CYAN_UNDERLINE +"What is the name of the album?"+ Color.RESET);
                    String album = scanner.nextLine();

                    System.out.println(Color.CYAN_UNDERLINE +"Would you like to\n" + Color.CYAN_BOLD +"1: Print to Console\n"+ Color.CYAN_BRIGHT +"2: Print to file"+ Color.RESET);
                    String printWhere = scanner.nextLine();

                    if (printWhere.equalsIgnoreCase("1")) {

                        System.out.println(Color.CYAN_BOLD +"--------------------"+ Color.RESET);
                        if (!musicOrganizer.printToConlsole(musicOrganizer.findArtist(artist, album))) {

                            System.out.println(Color.RED_UNDERLINE + "Could not find albums or artist" + Color.RESET);

                        }
                        System.out.println(Color.CYAN_BOLD +"--------------------"+ Color.RESET);

                    } else if (printWhere.equalsIgnoreCase("2")) {

                        System.out.println(Color.CYAN_BRIGHT + "What would like to the name of the file to be? (include .txt)"+ Color.RESET);
                        String file = scanner.nextLine();
                        if (!musicOrganizer.printToNewFile(file, musicOrganizer.findArtist(artist, album))){
                            System.out.println(Color.RED_UNDERLINE+"Could Not find File" + Color.RESET);
                        }else {

                            System.out.println(Color.GREEN_UNDERLINE + "Success!" + Color.RESET);

                        }

                    } else {

                        System.out.println(Color.RED_UNDERLINE+"Not an option"+ Color.RESET);

                    }

                } else if (specificAlbum.equalsIgnoreCase("2")) {

                    System.out.println(Color.CYAN + "Would you like to\n" + Color.CYAN_BOLD +
                            "1: Print to Console\n" + Color.CYAN_BRIGHT +
                            "2: Print to file"+ Color.RESET);
                    String printWhere = scanner.nextLine();

                    if (printWhere.equalsIgnoreCase("1")) {

                        System.out.println(Color.CYAN_BOLD +"--------------------"+ Color.RESET);
                        if (!musicOrganizer.printToConlsole(musicOrganizer.findArtist(artist, ""))) {

                            System.out.println(Color.RED_UNDERLINE + "Could not find albums or artist" + Color.RESET);

                        }
                        System.out.println(Color.CYAN_BOLD +"--------------------"+ Color.RESET);

                    } else if (printWhere.equalsIgnoreCase("2")) {

                        System.out.println(Color.CYAN_BRIGHT +"What would like to the name of the file to be? (include .txt)"+ Color.RESET);
                        String file = scanner.nextLine();
                        if (!musicOrganizer.printToNewFile(file, musicOrganizer.findArtist(artist, ""))){
                            System.out.println(Color.RED_UNDERLINE+"Could Not find File" + Color.RESET);
                        }else {

                            System.out.println(Color.GREEN_UNDERLINE + "Success!" + Color.RESET);

                        }

                    } else {

                        System.out.println(Color.RED_UNDERLINE+"Not an option"+ Color.RESET);

                    }

                }

            } else if (user.equals("5")) {

                System.out.println(Color.YELLOW_BRIGHT_BOLD+"What album would you like to review?"+ Color.RESET);
                String album = scanner.nextLine();
                System.out.println(Color.YELLOW_BRIGHT_BOLD+ "What is your review of " + album + "?"+ Color.RESET);
                String review = scanner.nextLine();

                System.out.println(Color.YELLOW_BRIGHT_BOLD+"--------------------"+ Color.RESET);
                System.out.println(Color.YELLOW_BRIGHT_BOLD+musicOrganizer.updateReview(album, review)+ Color.RESET);
                System.out.println(Color.YELLOW_BRIGHT_BOLD+"--------------------"+ Color.RESET);

            } else {

                System.out.println(Color.RED_UNDERLINE+"Not a choice" + Color.RESET);

            }

        }

        musicOrganizer.printToNewFile("musiclibrary.txt", "");

    }

}


