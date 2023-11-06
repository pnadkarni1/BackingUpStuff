import java.util.ArrayList;

public class Team<T extends Player> implements Comparable <Team> {

    private String name;
    private int wins;
    private int losses;
    private int ties;
    private int gamesPlayed;
    private ArrayList<T> roster;

    public Team(String name) {

        this.name = name;
        wins = 0;
        losses = 0;
        ties = 0;
        gamesPlayed = 0;
        roster = new ArrayList<>();

    }

    public boolean addPlayer (T player) {

        if (roster.contains(player)) {

            System.out.println(player.getName() + " is already on the team.");
            return false;

        }else {

            System.out.println(player.getName() + " added to team.");
            roster.add(player);
            return true;

        }

    }

    public int getSize () {

        return roster.size();

    }

    public String getName () {

        return name;

    }

    public void gameOutcome (Team opp, int ourScore, int oppScore) {

        String message;

        if (ourScore > oppScore) {

            message = " beat the ";

            wins++;

        } else if (ourScore == oppScore) {

            message = " tied with the ";

            ties++;

        } else {

            message = " lost to the ";

            losses++;

        }

        gamesPlayed++;

        if (opp != null) {

            gameOutcome(null, oppScore, ourScore );
            System.out.println(getName() + message + opp.getName());
        }



    }

    public int standing() {

        return wins * 2 + ties;

    }

    @Override
    public int compareTo(Team o) {

        if (this.standing() > o.standing()) {

            return -1;

        }else if (this.standing() < o.standing()) {

            return 1;

        }

        return 0;

    }


}
