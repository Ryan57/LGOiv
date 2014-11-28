public abstract class Event{

    //declare all attributes
    String name;
    int playTo;

    public int getPlayTo() {
        return playTo;
    }

    public void setPlayTo(int playTo) {
        this.playTo = playTo;
    }

    public boolean getIsPlayToExact() {
        return isPlayToExact;
    }

    public void setIsPlayToExact(boolean isPlayToExact) {
        this.isPlayToExact = isPlayToExact;
    }

    public int getPlayDistance() {
        return playDistance;
    }

    public void setPlayDistance(int playDistance) {
        this.playDistance = playDistance;
    }
    boolean isPlayToExact;
    int playDistance;
    
    //getters and setters
    public String getName() {
        return name;
    }
   
    //abstract method to return the extra info
    public abstract String getExtraInfo();
}