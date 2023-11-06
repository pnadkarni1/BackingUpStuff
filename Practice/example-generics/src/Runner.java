public class Runner {

    public static void main(String[] args) {

        Team <FootballPlayer> vikings = new Team<>("Vikings"); //Type football

        Team <BasketballPlayer> warriors = new Team <>("Warriors");//bball

        Team <BasketballPlayer> mavs = new Team <>("Mavericks");//^

        Team <BasketballPlayer> celtics = new Team <>("Celtics");//^

        warriors.gameOutcome(mavs, 3, 2);
        warriors.gameOutcome(mavs, 3, 2);
        warriors.gameOutcome(mavs, 2, 3);
        celtics.gameOutcome(warriors, 3, 2);
        celtics.gameOutcome(warriors, 2, 3);
        celtics.gameOutcome(warriors, 3, 2);
        mavs.gameOutcome(warriors, 4, 5);
        warriors.gameOutcome(celtics, 2, 1);

        League<Team<BasketballPlayer>> league = new League<>();

        league.addTeam(warriors);
        league.addTeam(celtics);
        league.addTeam(mavs);

        league.printStandings();

    }

}
