package hwLesson7;


public class MainGame {

    public static void main(String[] args) {
        Game.writeNumOfPlayersPerTeam(Game.GameType.SOCCER);
        Game.writeNumOfPlayersPerTeam(Game.GameType.HOCKEY);
        Game.writeNumOfPlayersPerTeam(Game.GameType.RUGBY);
    }
}