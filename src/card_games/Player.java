package card_games;

public class Player {

    protected  int gamesWon;
    protected  String name;


    public Player(String name){
        this.name = name;
    }


    public int getGamesWon() {
        return gamesWon;
    }

    public void setGamesWon(int gamesWon) {
        this.gamesWon = gamesWon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
