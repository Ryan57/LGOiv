public class LadderBallEvent extends Event {

    int numRungs;

    public LadderBallEvent(String name, int playTo, boolean isPlayToExact, int playDistance, int numRungs) {
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
        this.numRungs = numRungs;
    }

    @Override
    public String getExtraInfo() {
        return "numRungs = " + String.valueOf(numRungs);
    }
}