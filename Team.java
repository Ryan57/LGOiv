public class Team {
    //declare all attributes
    private Olympian olympian1,olympian2;

    public Team(Olympian olympian1, Olympian olympian2, int wins, int losses) {
        this.olympian1 = olympian1;
        this.olympian2 = olympian2;
        this.wins = wins;
        this.losses = losses;
    }

    public Olympian getOlympian1() {
        return olympian1;
    }

    public void setOlympian1(Olympian olympian1) {
        this.olympian1 = olympian1;
    }

    public Olympian getOlympian2() {
        return olympian2;
    }

    public void setOlympian2(Olympian olympian2) {
        this.olympian2 = olympian2;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
    private int wins, losses;
    //getters and setters
    //constructor to set all attributes

}