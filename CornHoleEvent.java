public class CornHoleEvent extends Event {

    int numBeanBags;

    public CornHoleEvent(String name, int playTo, boolean isPlayToExact, int playDistance, int numBeanBags) {
        this.name = name;
        this.playTo = playTo;
        this.isPlayToExact = isPlayToExact;
        this.playDistance = playDistance;
        this.numBeanBags = numBeanBags;
    }

    @Override
    public String getExtraInfo() {
        return "numBeanBags = " + String.valueOf(numBeanBags);
    }
}