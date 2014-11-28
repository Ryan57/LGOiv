/**
 * Created by Marist User on 11/20/2014.
 */
public class Competition implements ICompetition {
	 public Event event = null;
	    public Team team01 = null, team02 = null;
    public Team winningTeam;

    public Team getWinningTeam() {
        return winningTeam;
    }

    public void setWinningTeam(Team winningTeam) {
        this.winningTeam = winningTeam;
    }

    public Competition(Event event2, Team team1, Team team2) {
       //this.event = event2;
       event = event2;
     
       team01 = team1;
       team02 = team2;
        
    }

    public Event getEvent() {
        return event;
    }

    public Team getTeam01() {
        return team01;
    }

    public Team getTeam02() {
        return team02;
    }
}
