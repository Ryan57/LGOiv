public class HorseShoesEvent extends Event {

    int numHorseShoes;

    public HorseShoesEvent(String name, int playTo, boolean isPlayToExact, int playDistance, int numHorseShoes) {
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
        this.numHorseShoes = numHorseShoes;
    }

    @Override
    public String getExtraInfo() {
        return "numHorseShoes = " + String.valueOf(numHorseShoes);
    }
}