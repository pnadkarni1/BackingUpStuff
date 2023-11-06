import java.util.ArrayList;
import java.util.Collections;

public class League <T extends Team>{

    private ArrayList<Team> teams;

    public League() {

        teams = new ArrayList<>();

    }

    public void addTeam (T team) {

        if (!teams.contains(team) && teams != null) {

            teams.add(team);

        }

    }

    public void printStandings() {

        Collections.sort(teams);

        for (int i = 0; i < teams.size(); i++) {

            System.out.println(teams.get(i).getName() + "       " + teams.get(i).standing());

        }

    }

}