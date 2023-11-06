public class Player {

    private String uniqueID;
    private String password;
    private int rounds;
    private int points;
    private int wordsFound;

    public Player (String name) {

        uniqueID = name;
        password = "";
        rounds = 0;
        points = 0;
        wordsFound = 0;



    }

    public Player (String n, String p, int r, int wordsFound, int points) {

        uniqueID = n;
        password = p;
        rounds = r;
        this.points = points;
        this.wordsFound = wordsFound;

    }

    public void setPass (String p) {

        password = p;

    }

    public String getPass () {

        return password;

    }

    public void setID (String ID) {

        uniqueID = ID;

    }

    public String getID () {

        return uniqueID;

    }

    public void addPoints (int p) {

        points += p;

    }

    public int getPoints () {

        return points;

    }

    public void addRounds (int r) {

        rounds += r;

    }

    public int getRounds () {

        return rounds;

    }

    public void addWords (int num) {

        wordsFound += num;

    }

    public int getWords () {

        return wordsFound;

    }


    public String toString () {
        double avWords = 0;
        double avPoints = 0;
        if (rounds > 0) {
            avWords = wordsFound / rounds;
            avPoints = points / rounds;
        }


        return "Id: " + uniqueID + "\n" +
               "Total Rounds Played: " + rounds + "\n" +
               "Total Words Found: " + wordsFound + "\n" +
               "Total Points Earned: " + points + "\n" +
               "Average Words Found: " + avWords + "\n" +
               "Average Points Earned: " + avPoints;

    }

}
