import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class OurZoo {

    private String[] animalNames;

    private String[] newAnimals;

    private int arraySize;

    private int logicalSize;

    public OurZoo() {

        try (FileReader fileReader = new FileReader("zoo.txt"); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;
            arraySize = 0;

            while ((line = reader.readLine()) != null) {

                arraySize++;

            }

        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE + "Cannot Find File" + Color.RESET);

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE + "Error Trying to read into file" + Color.RESET);

        }

        try (FileReader fileReader = new FileReader("zoo.txt"); BufferedReader reader = new BufferedReader(fileReader)) {

            String line;

            animalNames = new String[arraySize];

            int arrayIndex = 0;

            while ((line = reader.readLine()) != null) {

                animalNames[arrayIndex] = line;
                arrayIndex++;

            }


        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE + "Cannot Find File" + Color.RESET);


        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE + "Error Trying to read into file" + Color.RESET);

        }

        newAnimals = new String[10];
        logicalSize = 0;

    }

    public OurZoo(String[] animalNames) {

        this.animalNames = animalNames;
        arraySize = animalNames.length;
        newAnimals = new String[10];
        logicalSize = 0;

    }

    public static void main(String[] args) {

        System.out.println("Welcome to Our Zoo" + Color.RESET);

        Scanner scanner = new Scanner(System.in);

        OurZoo zoo = new OurZoo();

        boolean menuSelect = true;

        int temp = 0;

        while (menuSelect) {

            System.out.println("What would you like to do?");
            System.out.println(Color.CYAN_BRIGHT_BOLD + "0: Quit\n" + Color.YELLOW_BRIGHT_BOLD +
                    "1: Get Value\n" + Color.GREEN_BRIGHT_BOLD +
                    "2: Set Value\n" + Color.MAGENTA_BRIGHT_BOLD +
                    "3: Insert Value\n" + Color.WHITE_BRIGHT_BOLD +
                    "4: Delete Value\n" + Color.BLUE_BRIGHT_BOLD +
                    "5: Print Out Array to Console\n" + Color.RED_BRIGHT_BOLD +
                    "6: Append New Elements to file" + Color.RESET + Color.RESET);

            String user = scanner.nextLine();

            menuSelect = zoo.menuSelect(user, scanner);

        }

        System.out.println(Color.CYAN_BRIGHT_BOLD + "Thank You for visiting" + Color.RESET);

    }

    public boolean menuSelect(String menuOption, Scanner object) {

        if (menuOption.equals("0")) {

            return false;

        } else if (menuOption.equals("1")) {

            System.out.println(Color.YELLOW_BRIGHT_BOLD + "Would you like to either get the value from " + Color.WHITE_BRIGHT_BOLD +
                    "1: an index number\n" + Color.YELLOW_BRIGHT_BOLD + "2: the first letter\n" + Color.CYAN_BRIGHT_BOLD + "3: the 'nth' first letter?" + Color.RESET);
            String user = object.nextLine();


            int enterInsideIf = 0;

            if (user.equals("1")) {

                enterInsideIf++;
                System.out.println(Color.WHITE_BRIGHT_BOLD +"What index would you like?" + Color.RESET);

                int index = 0;

                try {
                    index = Integer.parseInt(object.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);
                    return true;
                }

                System.out.println(Color.YELLOW_BRIGHT_BOLD + "\n" + getValue(index) + "\n" + Color.RESET);

            } else if (user.equals("2")) {

                enterInsideIf++;

                System.out.println(Color.YELLOW_BRIGHT_BOLD +"What letter would you like?" + Color.RESET);
                String letter = object.nextLine();

                System.out.println(Color.YELLOW_BRIGHT_BOLD +"\n" + getValue(letter) + "\n" + Color.RESET);

            } else if (user.equals("3")) {


                enterInsideIf++;

                System.out.println(Color.CYAN_BRIGHT_BOLD + "What 'nth' letter would you like?" + Color.RESET);

                int nth = 0;

                try {
                    nth = Integer.parseInt(object.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(Color.RED_UNDERLINE + "Not a number" + Color.RESET);
                    return true;
                }

                System.out.println(Color.CYAN_BRIGHT_BOLD + "What letter would you like?" + Color.RESET);
                String letter = object.nextLine();

                System.out.println(Color.YELLOW_BRIGHT_BOLD +"\n" + getValue(letter, nth) + "\n" + Color.RESET);

            } else {

                System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);

            }

        } else if (menuOption.equals("2")) {

            System.out.println(Color.GREEN_BRIGHT_BOLD +"What animal would you like to add?" + Color.RESET);
            String animal = object.nextLine();
            System.out.println(Color.GREEN_BRIGHT_BOLD +"What index would you like it at?" + Color.RESET);
            int index = 0;

            try {
                index = Integer.parseInt(object.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(Color.RED_UNDERLINE + "Not a number" + Color.RESET);
                return true;
            }

            if (setValue(animal, index)) {

                System.out.println(Color.GREEN_UNDERLINE +"\nSuccess!\n" + Color.RESET);

            }

        } else if (menuOption.equals("3")) {

            System.out.println(Color.MAGENTA_BRIGHT_BOLD +"What animal would you like to insert?" + Color.RESET);
            String animal = object.nextLine();
            System.out.println(Color.MAGENTA_BRIGHT_BOLD +"Would you like it:\n" + Color.WHITE_BRIGHT_BOLD +
                    "1: Alphabetical\n" + Color.YELLOW_BRIGHT_BOLD + "2: At an index you desire?" + Color.RESET);
            String user = object.nextLine();

            int enterInsideIf = 0;

            if (user.equals("1")) {

                enterInsideIf++;

                insertValue(animal, true);

            } else if (user.equals("2")) {

                enterInsideIf++;

                insertValue(animal, false);

            } else if (enterInsideIf == 0) {

                System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);

            }

        } else if (menuOption.equals("4")) {


            System.out.println(Color.WHITE_BRIGHT_BOLD +"Would you like to either delete the value from " + Color.WHITE_BRIGHT_BOLD +
                    "1: an index number\n" + Color.YELLOW_BRIGHT_BOLD +"2: the first letter\n" + Color.CYAN_BRIGHT_BOLD + "3: the 'nth' first letter?" + Color.RESET);
            String user = object.nextLine();

            int enterInsideIf = 0;

            if (user.equals("1")) {

                enterInsideIf++;

                System.out.println(Color.WHITE_BRIGHT_BOLD +"What index would you like?" + Color.RESET);

                int index = 0;

                try {
                    index = Integer.parseInt(object.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(Color.RED_UNDERLINE + "Not a number" + Color.RESET);
                    return true;
                }

                System.out.println(Color.WHITE_BRIGHT_BOLD +"\nDeleted: " + deleteValue(index) + "\n" + Color.RESET);

            } else if (user.equals("2")) {
                enterInsideIf++;

                System.out.println(Color.YELLOW_BRIGHT_BOLD +"What letter would you like?" + Color.RESET);
                String letter = object.nextLine();

                System.out.println(Color.YELLOW_BRIGHT_BOLD +"\nDeleted: " + deleteValue(letter) + "\n" + Color.RESET);

            } else if (user.equals("3")) {
                enterInsideIf++;

                System.out.println(Color.CYAN_BRIGHT_BOLD +"What 'nth' letter would you like?" + Color.RESET);
                int nth = 0;

                try {
                    nth = Integer.parseInt(object.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println(Color.RED_UNDERLINE + "Not a Number" + Color.RESET);
                    return true;
                }

                System.out.println(Color.CYAN_BRIGHT_BOLD +"What letter would you like?" + Color.RESET);
                String letter = object.nextLine();

                System.out.println(Color.CYAN_BRIGHT_BOLD +"\nDeleted: " + deleteValue(letter, nth) + "\n" + Color.RESET);
            } else if (enterInsideIf == 0) {

                System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);

            }

        } else if (menuOption.equals("5")) {

            printAnaimals();

        } else if (menuOption.equals("6")) {

            if (saveList()) {

                System.out.println(Color.GREEN_UNDERLINE + "\nSuccess!\n" + Color.RESET);

            }

        }else {

            System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);

        }

        return true;

    }

    public String getValue(int index) {

        if (index > arraySize || index < 0) {

            return Color.RED_UNDERLINE + "Index does not exist within the list of animals" + Color.RESET;

        } else {

            return Color.GREEN_UNDERLINE + animalNames[index] + Color.RESET;

        }

    }

    public String getValue(String firstLetter) {

        for (int i = 0; i < animalNames.length; i++) {

            if (firstLetter.equals(animalNames[i].substring(0, 1))) {

                return Color.GREEN_UNDERLINE + animalNames[i] + Color.RESET;

            }

        }

        return Color.RED_UNDERLINE + "No animal found" + Color.RESET;

    }

    public String getValue(String firstLetter, int n) {

        int tempN = 1;

        for (int i = 0; i < animalNames.length; i++) {

            if (firstLetter.equals(animalNames[i].substring(0, 1))) {

                if (tempN == n) {

                    return Color.GREEN_UNDERLINE + animalNames[i] + Color.RESET;

                } else {

                    tempN++;

                }

            }

        }

        return Color.RED_UNDERLINE + "No animal found" + Color.RESET;

    }

    public boolean setValue(String animalName, int index) {

        if (index > animalName.length()) {

            return false;

        }

        int inList = 0;

        for (int i = 0; i < animalNames.length; i++) {

            if (animalNames[i].equalsIgnoreCase(animalName)) {

                inList++;

            }

        }

        animalNames[index] = animalName;

        if (inList == 0) {

            if (logicalSize == this.newAnimals.length) {

                String[] tempNewAnimals = new String[this.newAnimals.length + 1];
                for (int i = 0; i < this.newAnimals.length; i++) {

                    tempNewAnimals[i] = this.newAnimals[i];

                }

                this.newAnimals = tempNewAnimals;
                logicalSize++;

            }

            for (int i = 0; i < this.newAnimals.length; i++) {

                if (this.newAnimals[i] == null) {

                    this.newAnimals[i] = animalName;
                    break;

                }

            }
        }
        return true;


    }

    public void insertValue(String animalName, boolean inAlphabetical) {

        Scanner scanner = new Scanner((System.in));

        int inList = 0;

        for (int i = 0; i < animalNames.length; i++) {

            if (animalNames[i].equalsIgnoreCase(animalName)) {

                inList++;

            }

        }

        String[] tempNewAnimals = new String[this.animalNames.length + 1];
        for (int i = 0; i < this.animalNames.length; i++) {

            tempNewAnimals[i] = this.animalNames[i];

        }
        animalNames = tempNewAnimals;

        if (inAlphabetical) {

            int index = 0;

            for (int i = 0; i < animalNames.length; i++) {
                if (animalNames[i] != null) {
                    if (animalName.compareTo(animalNames[i]) > 0) {

                        index++;

                    }

                }

            }

            for (int i = arraySize; i > index; i--) {

                animalNames[i] = animalNames[i - 1];

            }

            animalNames[index] = animalName;

            arraySize++;

        } else {

            System.out.println(Color.WHITE_BRIGHT_BOLD +"Where would you like the animal to be placed at" + Color.RESET);

            int index = scanner.nextInt();

            for (int i = arraySize; i > index; i--) {

                animalNames[i] = animalNames[i - 1];

            }

            animalNames[index] = animalName;
            arraySize++;
        }
        if (inList == 0) {
            if (logicalSize == this.newAnimals.length) {

                tempNewAnimals = new String[this.newAnimals.length + 1];
                for (int i = 0; i < this.newAnimals.length; i++) {

                    tempNewAnimals[i] = this.newAnimals[i];

                }

                this.newAnimals = tempNewAnimals;


            }

            for (int i = 0; i < this.newAnimals.length; i++) {

                if (this.newAnimals[i] == null) {

                    this.newAnimals[i] = animalName;
                    break;

                }

            }

            logicalSize++;
        }

    }

    public String deleteValue(int index) {

        if (index > arraySize || index < 0) {

            return Color.RED_UNDERLINE + "Index does not exist within the list of animals" + Color.RESET;

        } else {

            String deletedAni = animalNames[index];
            animalNames[index] = null;

            String[] tempAni = new String[animalNames.length - 1];

            for (int i = 0; i < animalNames.length; i++) {

                if (i < index) {

                    tempAni[i] = animalNames[i];

                } else if (i > index) {

                    tempAni[i - 1] = animalNames[i];

                }

            }

            animalNames = tempAni;
            arraySize--;

            return Color.GREEN_UNDERLINE + deletedAni + Color.RESET;
        }



    }

    public String deleteValue(String name) {

        int index = -1;

        for (int i = 0; i < animalNames.length; i++) {

            if (animalNames[i].equals(name)) {

                index = i;

            }

        }

        if (index == -1) {

            return Color.RED_UNDERLINE + "No animal with that name found in the list" + Color.RESET;

        }

        String deletedAni = animalNames[index];
        animalNames[index] = null;


        String[] tempAni = new String[animalNames.length - 1];

        for (int i = 0; i < animalNames.length; i++) {

            if (i < index) {

                tempAni[i] = animalNames[i];

            } else if (i > index) {

                tempAni[i - 1] = animalNames[i];

            }

        }

        animalNames = tempAni;

        arraySize--;

        return Color.GREEN_UNDERLINE + deletedAni + Color.RESET;

    }

    public String deleteValue(String letter, int n) {

        int index = -1;
        int nthLetter = 1;

        for (int i = 0; i < animalNames.length; i++) {

            if (animalNames[i].substring(0, 1).equals(letter) && nthLetter == n) {

                index = i;

            } else if (animalNames[i].substring(0, 1).equals(letter)) {

                nthLetter++;

            }

        }

        if (index == -1) {

            return Color.RED_UNDERLINE + "No animal with that name found in the list" + Color.RESET;

        }

        String deletedAni = animalNames[index];
        animalNames[index] = null;


        String[] tempAni = new String[animalNames.length - 1];

        int shiftDown = 0;

        for (int i = 0; i < animalNames.length; i++) {

            if (i < index) {

                tempAni[i] = animalNames[i];

            } else if (i > index) {

                tempAni[i - 1] = animalNames[i];

            }

        }

        animalNames = tempAni;

        arraySize--;

        return Color.GREEN_UNDERLINE + deletedAni + Color.RESET;

    }

    public void printAnaimals() {

        Scanner scanner = new Scanner(System.in);

        System.out.println(Color.BLUE_BRIGHT_BOLD +"Would like it in:\n" + Color.WHITE_BRIGHT_BOLD +
                "1: Alphabeltical\n" + Color.YELLOW_BRIGHT_BOLD +"2: Reverse Alphabetical\n" + Color.CYAN_BRIGHT_BOLD + "3: Length\n" + Color.BLUE_BRIGHT_BOLD +
                "4: Alternating Alphabetical" + Color.RESET);

        int user = scanner.nextInt();

        int enterIf = 0;

        if (user == 1) {

            enterIf++;

            String[] tempAnimals = animalNames;

            for (int i = 0; i < tempAnimals.length; i++) {

                int compartToNum = 0;

                for (int j = i + 1; j < tempAnimals.length; j++) {

                    if (tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase()) > compartToNum) {

                        compartToNum = tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase());

                        String tmp = tempAnimals[i];
                        tempAnimals[i] = tempAnimals[j];
                        tempAnimals[j] = tmp;

                    }

                }

            }

            System.out.println();

            System.out.println(Color.GREEN_UNDERLINE + Arrays.toString(tempAnimals) + Color.RESET);

            System.out.println();

        } else if (user == 2) {

            enterIf++;

            String[] tempAnimals = animalNames;

            for (int i = 0; i < tempAnimals.length; i++) {

                int compartToNum = 0;

                for (int j = i + 1; j < tempAnimals.length; j++) {

                    if (tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase()) < compartToNum) {

                        compartToNum = tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase());

                        String tmp = tempAnimals[i];
                        tempAnimals[i] = tempAnimals[j];
                        tempAnimals[j] = tmp;

                    }

                }

            }

            System.out.println();

            System.out.println(Color.GREEN_UNDERLINE + Arrays.toString(tempAnimals) + Color.RESET);

            System.out.println();

        } else if (user == 3) {
            enterIf++;

            String[] tempAnimals = animalNames;


            for (int i = 0; i < tempAnimals.length; i++) {

                for (int j = i + 1; j < tempAnimals.length; j++) {

                    if (tempAnimals[i].length() > tempAnimals[j].length()) {

                        String temp = tempAnimals[i];
                        tempAnimals[i] = tempAnimals[j];
                        tempAnimals[j] = temp;

                    }

                }

            }

            System.out.println();

            System.out.println(Color.GREEN_UNDERLINE + Arrays.toString(tempAnimals) + Color.RESET);

            System.out.println();

        } else if (user == 4) {
            enterIf++;

            String[] tempAnimals = animalNames;

            for (int i = 0; i < tempAnimals.length; i++) {

                int compartToNum = 0;

                for (int j = i + 1; j < tempAnimals.length; j++) {

                    if (tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase()) > compartToNum) {

                        compartToNum = tempAnimals[i].toLowerCase().compareTo(tempAnimals[j].toLowerCase());

                        String tmp = tempAnimals[i];
                        tempAnimals[i] = tempAnimals[j];
                        tempAnimals[j] = tmp;

                    }

                }

            }

            int listLength = 0;

            if (tempAnimals.length % 2 == 1) {

                listLength = (tempAnimals.length / 2) + 1;

            } else {

                listLength = (tempAnimals.length) / 2;

            }

            System.out.println();
            String list = Color.GREEN_UNDERLINE + "[";

            for (int i = 0; i < listLength; i++) {

                list = list + tempAnimals[i] + ", ";

                if (i != (tempAnimals.length - 1) - i) {

                    list = list + tempAnimals[(tempAnimals.length - 1) - i] + ", ";

                }

            }
            System.out.println(list.substring(0, list.length() - 2) + "]" + Color.RESET);
            System.out.println();

        } else if (enterIf == 0) {

            System.out.println(Color.RED_UNDERLINE + "Not an option" + Color.RESET);

        }

    }

    public boolean saveList() {

        if (newAnimals[0] == null) {

            System.out.println(Color.RED_UNDERLINE + "No new animals need to be added" + Color.RESET);
            return false;

        }

        try (FileWriter fileWriter = new FileWriter("zoo.txt", true); BufferedWriter writer = new BufferedWriter(fileWriter)) {

            String line;

            for (int i = 0; i < newAnimals.length; i++) {

                if (newAnimals[i] != null) {

                    writer.newLine();
                    writer.write(newAnimals[i]);

                }

            }

            writer.close();

        } catch (FileNotFoundException badFile) {

            System.out.println(Color.RED_UNDERLINE + "Cannot Find File" + Color.RESET);
            return false;

        } catch (IOException e) {

            System.out.println(Color.RED_UNDERLINE + "Error Trying to read into file" + Color.RESET);
            return false;

        }

        return true;

    }

    public int getAnimalsLogical() {

        return arraySize;

    }

    public int getNewAnimalsLogical() {

        return logicalSize;

    }

}