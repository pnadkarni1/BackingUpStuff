import java.util.ArrayList;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class SpottersTeam {

    private static ArrayList <HockeyPlayer> team = new ArrayList ();
    private ArrayList <HockeyPlayer> freeAgentList = new ArrayList ();
    private static int totalTeamSalary;

    public SpottersTeam () {

        for (int i = 0; i <= 6; i++) {

            team.add(new HockeyPlayer("fake", 1, "fake", 2000000));

        }

        totalTeamSalary = 0;
        try (FileReader file = new FileReader("freeagentshockey.txt"); BufferedReader reader = new BufferedReader (file)) {


                String line;

                while ( (line = reader.readLine()) != null) {

                    String [] list = line.split("-");
                    String name = list[0];
                    int age = Integer.parseInt(list[1]);
                    String position = list[2];
                    int sal = Integer.parseInt(list[3]);

                    freeAgentList.add(new HockeyPlayer(name, age, position, sal));

                }//end of while



        } catch (FileNotFoundException badFile) {

            System.out.println("Cannot Find File");

        } catch (IOException e) {

            System.out.println("Error reader from file");

        }

    }

    public ArrayList <HockeyPlayer> getFreeAgentList () {

        return freeAgentList;

    }


    public void createTeam () {

        for (int i = 0; i <= 6; i++) {

            if (freeAgentList.get(i).getAge() < 29){

                if (freeAgentList.get(i).getName().equals ("Jack Parkman")) {

                    team.remove(0);
                    team.add(0, freeAgentList.get(i));



                }

                if (freeAgentList.get(i).getPosition().equals ("Hamilton Porter")) {

                    team.remove(1);
                    team.add(1, freeAgentList.get(i));


                }

                if (freeAgentList.get(i).getPosition().equals ("Roy Hobbs")) {

                    team.remove(2);
                    team.add(2, freeAgentList.get(i));


                }

                if (freeAgentList.get(i).getPosition().equals ("Peggy Dalton")) {

                    team.remove(3);
                    team.add(3, freeAgentList.get(i));


                }

                if (freeAgentList.get(i).getPosition().equals ("Ursula Lopez")) {

                    team.remove(4);
                    team.add(4, freeAgentList.get(i));


                }

                if (freeAgentList.get(i).getPosition().equals ("Stan Ross")) {

                    team.remove(5);
                    team.add(5, freeAgentList.get(i));


                }


            }



        }//end of for



        team.remove(6);team.remove(6);team.remove(6);team.remove(6);team.remove(6);team.remove(6);team.remove(6);

        totalTeamSalary = 0;
        totalTeamSalary += team.get(0).getSalary();
        totalTeamSalary += team.get(1).getSalary();
        totalTeamSalary += team.get(2).getSalary();
        totalTeamSalary += team.get(3).getSalary();
        totalTeamSalary += team.get(4).getSalary();
        totalTeamSalary += team.get(5).getSalary();

        System.out.println(totalTeamSalary);

        for (int i = 0; i <= freeAgentList.size() - 1; i++) {

            if (SpottersTeam.signPlayer(freeAgentList.get(i))){

                if (freeAgentList.get(i).getPosition().equals ("Center")) {

                    totalTeamSalary -= team.get(0).getSalary();



                    team.remove(0);

                    team.add(0, freeAgentList.get(i));

                    totalTeamSalary += team.get(0).getSalary();

                }

                if (freeAgentList.get(i).getPosition().equals ("Left Wing")) {
                    totalTeamSalary -= team.get(1).getSalary();
                    team.remove(1);

                    team.add(1, freeAgentList.get(i));
                    totalTeamSalary += team.get(1).getSalary();

                }

                if (freeAgentList.get(i).getPosition().equals ("Right wing")) {
                    totalTeamSalary -= team.get(2).getSalary();
                    team.remove(2);

                    team.add(2, freeAgentList.get(i));
                    totalTeamSalary += team.get(2).getSalary();

                }

                if (freeAgentList.get(i).getPosition().equals ("Left Defense")) {
                    totalTeamSalary -= team.get(3).getSalary();
                    team.remove(3);

                    team.add(3, freeAgentList.get(i));
                    totalTeamSalary += team.get(3).getSalary();

                }

                if (freeAgentList.get(i).getPosition().equals ("Right Defense")) {
                    totalTeamSalary -= team.get(4).getSalary();
                    team.remove(4);

                    team.add(4, freeAgentList.get(i));
                    totalTeamSalary += team.get(4).getSalary();

                }

                if (freeAgentList.get(i).getPosition().equals ("Goalie")) {
                    totalTeamSalary -= team.get(5).getSalary();
                    team.remove(5);

                    team.add(5, freeAgentList.get(i));
                    totalTeamSalary += team.get(5).getSalary();
                }

            }



        }//end of for

    }//end of method

    public static boolean signPlayer (HockeyPlayer player) {

        if (player.getAge() > 30) {

            return false;

        }

        if (player.getPosition().equals ("Center")) {
            if (player.getSalary() > 30000 && player.getSalary() < 50000) {

                int sal = totalTeamSalary - team.get(0).getSalary() + player.getSalary();

                if (player.getSalary() < team.get(0).getSalary()) {

                    return true;

                }else if (sal > totalTeamSalary && sal > 275000 && sal < 305000) {

                    return true;

                }

            }
        }
        if (player.getPosition().equals ("Left wing")) {

            if (player.getSalary() > 30000 && player.getSalary() < 65000) {

                int sal = totalTeamSalary - team.get(1).getSalary() + player.getSalary();

                if (player.getSalary() < team.get(1).getSalary()) {

                    return true;

                }else if (sal > totalTeamSalary && sal > 290000 && sal < 300000) {

                    return true;

                }

            }

        }
        if (player.getPosition().equals ("Right wing")) {

            int sal = totalTeamSalary - team.get(2).getSalary() + player.getSalary();

            if (player.getSalary() < team.get(2).getSalary()) {

                return true;

            }else if (sal > totalTeamSalary && sal > 290000 && sal < 300000) {

                return true;

            }


        }
        if (player.getPosition().equals ("Left defense")) {

            int sal = totalTeamSalary - team.get(3).getSalary() + player.getSalary();


            if (player.getSalary() < team.get(3).getSalary()) {

                return true;

            }else if (sal > totalTeamSalary && sal > 290000 && sal < 300000) {

                return true;

            }



        }
        if (player.getPosition().equals ("Right defense")) {

            int sal = totalTeamSalary - team.get(4).getSalary() + player.getSalary();

            if (player.getSalary() < team.get(4).getSalary()) {

                return true;

            }else if (sal > totalTeamSalary && sal > 290000 && sal < 300000) {

                return true;

            }

        }
        if (player.getPosition().equals ("Goalie")) {

            int sal = totalTeamSalary - team.get(5).getSalary() + player.getSalary();

            if (player.getSalary() < team.get(5).getSalary()) {

                return true;

            }else if (sal > totalTeamSalary && sal > 290000 && sal < 300000) {

                return true;

            }

        }



        return false;

    }

    public static void sendTeam () {

        try (FileWriter file = new FileWriter("startinglineup.txt"); BufferedWriter writer = new BufferedWriter (file)) {

            for (int i = 0; i < team.size(); i++) {

                if (i == 0) {

                    writer.write("Center: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");

                }
                if (i == 1) {

                    writer.write("Left wing: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");
                }
                if (i == 2) {

                    writer.write("Right wing: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");
                }
                if (i == 3) {

                    writer.write("Left defense: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");
                }
                if (i == 4) {

                    writer.write("Right defense: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");
                }
                if (i == 5) {

                    writer.write("Goalie: " + team.get(i).getName() +" "+  team.get(i).getSalary());
                    writer.write("\n");
                }
            }

        }catch (FileNotFoundException noFile) {

            System.out.println("Error creating or finding file");
            noFile.printStackTrace ();

        }catch (IOException bad) {

            System.out.println("Error writing into file");

            bad.printStackTrace ();

        }


    }


    public String displayPlayer (String name) {

        for (int i = 0; i < team.size(); i++) {

            if (name.equals (team.get(i).getName())) {

                return team.get(i).toString();

            }

        }

        return "No player on team with name " + name;

    }

    public int totalSalary() {

        System.out.println(team.get(0));System.out.println(team.get(1));System.out.println(team.get(2));System.out.println(team.get(3));System.out.println(team.get(4));System.out.println(team.get(5));
        System.out.println(totalTeamSalary);

        totalTeamSalary = 0;
        totalTeamSalary += team.get(0).getSalary();
        totalTeamSalary += team.get(1).getSalary();
        totalTeamSalary += team.get(2).getSalary();
        totalTeamSalary += team.get(3).getSalary();
        totalTeamSalary += team.get(4).getSalary();
        totalTeamSalary += team.get(5).getSalary();



        return totalTeamSalary;

    }

    public HockeyPlayer highestSalary () {

        HockeyPlayer player = new HockeyPlayer ("fake", 1, "fake", 1);

        for (int i = 0; i < team.size(); i++) {

            if (player.getSalary() < team.get(i).getSalary()) {

                player = team.get(i);

            }

        }

        return player;

    }

    public HockeyPlayer lowestSalary () {

        HockeyPlayer player = new HockeyPlayer ("fake", 1, "fake", 1000000000);

        for (int i = 0; i < team.size(); i++) {

            if (team.get(i).getSalary() < player.getSalary()) {

                player = team.get(i);

            }

        }

        return player;

    }



    public int averageSalary () {

        int total = 0;

        for (int i = 0; i < team.size(); i++) {

            total += team.get(i).getSalary();

        }

        return total / 6;

    }


    //==============================
    //Methods used for unit testing
    //only do not change
    //setTeam should NOT be used anywhere else
    //getTeam should be used in the SpottersAffiliate class
    public void setTeam (ArrayList<HockeyPlayer> teamList) {
        team = teamList;
        for (HockeyPlayer p : team) {
            totalTeamSalary += p.getSalary();
        }
    }
    public ArrayList<HockeyPlayer> getTeam () {



        return team;
    }
    //==============================

    @Override

    public String toString () {

        System.out.println(totalTeamSalary);

        return "Center: " + team.get(0).getName() + "\n" +
               "Left wing: " + team.get(1).getName() + "\n" +
               "Right wing: " + team.get(2).getName() + "\n" +
               "Left defense: " + team.get(3).getName() + "\n" +
               "Right defense: " + team.get(4).getName() + "\n" +
               "Goalie: " + team.get(5).getName();

    }

}
