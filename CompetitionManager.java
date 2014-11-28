import java.util.LinkedList;

/**
 * Created by Ryan on 11/11/2014.
 */
public class CompetitionManager {
    private LinkedList<Competition> competitions;
    
    public CompetitionManager() {
        competitions = new LinkedList<Competition>();
    }
    
    public void startCompetition(Event event, Team team01, Team team02) {
        competitions.add(new Competition(event, team01, team02));
    }
    public LinkedList<Competition> getCompetitions() {
        return competitions;
    }
    
    public void endCompetition(Competition competition, Team winningTeam) {
        competition.setWinningTeam(winningTeam);
    }
}