


public class WashoosEvent extends Event{

	boolean hasAutoWinStick;
    int numWashoos;

    public WashoosEvent(String name, int playTo, boolean isPlayToExact, int playDistance, boolean hasAutoWinStick, int numWashoos) {
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
        this.hasAutoWinStick = hasAutoWinStick;
        this.numWashoos = numWashoos;
    }

    @Override
    public String getExtraInfo() {
        return "numWashoos = " + String.valueOf(numWashoos) + ", hasAutoWinStick = " + hasAutoWinStick;
    }

}// end Washoos