import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class PlayerList {

    private ArrayList <Player> pl;

    public PlayerList (String fileName) {

        pl = new <Player> ArrayList ();

        try (FileReader file = new FileReader(fileName); BufferedReader reader = new BufferedReader (file)) {


            String line;

            while ( (line = reader.readLine()) != null) {

                String [] list = line.split(",");
                String id = list[0];
                String pass = list[1];
                int rounds = Integer.parseInt(list[2]);
                int words = Integer.parseInt(list[3]);
                int points = Integer.parseInt(list[4]);

                pl.add(new Player(id, pass, rounds, words, points));

            }//end of while



        } catch (FileNotFoundException badFile) {

            System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }



    }

    public boolean addPlayer (Player player) {

        if (player == null) {

            return false;

        }

        if (!(containsId(player.getID()))) {

            pl.add(player);
            return true;
        }

        return false;

    }

    public boolean containsId (String n) {

        for (int i = 0; i < pl.size(); i++) {

            if (n.equals (pl.get(i).getID())) {

                return true;

            }

        }

        return false;

    }

    public Player authenticate (Player p) {

        for (int i = 0; i < pl.size(); i++) {

            if (p.getID().equals (pl.get(i).getID())) {

                if (p.getPass().equals (pl.get(i).getPass())) {

                    return pl.get(i);

                }

            }

        }

        return null;

    }

    public void saveList () {

        try (FileWriter file = new FileWriter("players.txt"); BufferedWriter writer = new BufferedWriter (file)) {


            for (int i = 0; i < pl.size(); i++) {

                writer.write(pl.get(i).getID() + "," + pl.get(i).getPass() + "," + pl.get(i).getRounds() + "," + pl.get(i).getWords() + "," + pl.get(i).getPoints());
                writer.write("\n");

            }

        }catch (FileNotFoundException noFile) {

            System.out.println("Error creating or finding file");
            noFile.printStackTrace ();

        }catch (IOException bad) {

            System.out.println("Error writing into file");

            bad.printStackTrace ();

        }

    }


    public String toString () {

        String string = "Total Players: " + pl.size() + "\n";
        int r = 0;
        int w = 0;
        int p = 0;
        double avWords = 0;
        double avPoints = 0;

        for (int i = 0; i < pl.size(); i++) {

            string = string + "\n" + pl.get(i) + "\n";

        }

        string = string + "\n";

        for (int i = 0; i < pl.size(); i++) {

            r += pl.get(i).getRounds();
            w += pl.get(i).getWords();
            p += pl.get(i).getPoints();

        }

        if (r != 0) {

            avWords = w/r;
            avPoints = p/r;

        }

        string = string + "Overall Stats for All Players: " + "\n" +
                "Total Rounds: " + r + "\n" +
                "Total Words Found: " + w + "\n" +
                "Total Points Earned: " + p + "\n" +
                "Average Words Found: " + avWords + "\n" +
                "Average Points Earned: " + avPoints;


        return string;

    }

}
