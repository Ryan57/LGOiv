public class StickGameEvent extends Event {

    int frisbeeSize;

    public StickGameEvent(String name, int playTo, boolean isPlayToExact, int playDistance, int frisbeeSize) {
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
        this.frisbeeSize = frisbeeSize;
    }

    @Override
    public String getExtraInfo() {
        return "frisbeeSize = " + String.valueOf(frisbeeSize);
    }
}