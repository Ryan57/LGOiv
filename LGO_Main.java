
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


/**
 * Created by Ryan on 10/30/2014.
 */
public class LGO_Main {

	
	    public static void main(String[] args) {
	        System.out.println("Welcome in olympiad !!! ");

	        // check if appropriate number of command line arguments was inputed
	        if (args.length == 1) {

	            // instancing the managers
	            EventManager eventManager = new EventManager();
	            OlympianManager olympianManager = new OlympianManager(args[0]);
	            TeamManager teamManager = new TeamManager(olympianManager.getOlympians().clone());
	            CompetitionManager competitionManager = new CompetitionManager();
	            try {
	                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	                String input = "";
	                do {
	                    System.out.print("Input => ");
	                    input = reader.readLine();

	                    if (input.equals("events") || input.equals("e")) {
	                        System.out.println("The events are : ");
	                        // get the events by using the getEvents method of the eventManager
	                        Event events[] = eventManager.getEvents();
	                        for (int i = 0; i < events.length; i++) {
	                            // print all information event by event
	                            System.out.println("\n\tName:" + events[i].getName());
	                            System.out.println("\tPlay To:" + events[i].getPlayTo());
	                            System.out.println("\tIs Play To Exact:" + events[i].getIsPlayToExact());
	                            System.out.println("\tPlay Distance:" + events[i].getPlayDistance());
	                            System.out.println("\tExtra Info:" + events[i].getExtraInfo());

	                        }
	                    } else if (input.equals("competitions") || input.equals("c")) {
	                        System.out.println("The competitions are : ");
	                        // get the events by using the getEvents method of the eventManager
	                        LinkedList<Competition> competitions = competitionManager.getCompetitions();
	                        for (int i = 0; i < competitions.size(); i++) {
	                            // print all information event by event
	                            System.out.println("\n\tEvent:" + competitions.get(i).getEvent().getName());
	                            Team team01 = competitions.get(i).getTeam01();
	                            Team team02 = competitions.get(i).getTeam02();
	                            System.out.println("Team 1" + " / Wins = " + team01.getWins() + " / Lossees = " + team01.getLosses());

	                            System.out.println(team01.getOlympian1().getName() + ", " + team01.getOlympian1().getSex() + ", " + team01.getOlympian1().getAge());
	                            System.out.println(team01.getOlympian2().getName() + ", " + team01.getOlympian2().getSex() + ", " + team01.getOlympian2().getAge());
	                           
	                            System.out.println("Team 2" + " / Wins = " + team02.getWins() + " / Lossees = " + team02.getLosses());

	                            System.out.println(team02.getOlympian1().getName() + ", " + team02.getOlympian1().getSex() + ", " + team02.getOlympian1().getAge());
	                            System.out.println(team02.getOlympian2().getName() + ", " + team02.getOlympian2().getSex() + ", " + team02.getOlympian2().getAge());

	                        }
	                    } else if (input.equals("startcompetition") || input.equals("sc")) {
	                        System.out.println("Starting a competition:\n");
	                        String eventInput, team01Input, team02Input;
	                        System.out.println("Select an event ID:\n");
	                        Event events[] = eventManager.getEvents();
	                        // get the olympians by using the getOlympians method of the olympianManager
	                        for (int i = 0; i < events.length; i++) {
	                            // print all information event by event
	                            System.out.println("\n\tID:" + i);
	                            System.out.println("\n\tName:" + events[i].getName());
	                        }

	                        System.out.print("Input Event => ");
	                        eventInput = reader.readLine();
	                        
	                        System.out.println("The teams are:\n");
	                        // get the teams by using the getTeams method of the teamManager
	                        Team teams[] = teamManager.getTeams();
	                        for (int i = 0; i < teams.length; i++) {
	                            //    print all information by team
	                            System.out.println("Team " + i + " / Wins = " + teams[i].getWins() + " / Lossees = " + teams[i].getLosses());

	                            System.out.println(teams[i].getOlympian1().getName() + ", " + teams[i].getOlympian1().getSex() + ", " + teams[i].getOlympian1().getAge());
	                            System.out.println(teams[i].getOlympian2().getName() + ", " + teams[i].getOlympian2().getSex() + ", " + teams[i].getOlympian2().getAge());
	                        }
	                        
	                        System.out.print("Input Team01 => ");
	                        team01Input = reader.readLine();
	                        
	                        System.out.print("Input Team02 => ");
	                        team02Input = reader.readLine();
	                        competitionManager.getCompetitions().add(new Competition(events[0], teams[0], teams[1]));
	                        //competitionManager.getCompetitions().add(new Competition(events[Integer.parseInt(eventInput)], teams[Integer.parseInt(team01Input)], teams[Integer.parseInt(team02Input)]));
	                    } else if (input.equals("endcompetition") || input.equals("ec")) {
	                        String competitionInput, winningTeamInput;
	                        System.out.println("The competitions are : ");
	                        // get the events by using the getEvents method of the eventManager
	                        LinkedList<Competition> competitions = competitionManager.getCompetitions();
	                        System.out.println("@@@@-"+competitions.size());
	                        for (int i = 0; i < competitions.size(); i++) {
	                            // print all information event by event
	                            System.out.println("\n\tEvent:" + competitions.get(i).getEvent());
	                            Team team01 = competitions.get(i).getTeam01();
	                            Team team02 = competitions.get(i).getTeam02();
	                            System.out.println("Team 1" + " / Wins = " + team01.getWins() + " / Lossees = " + team01.getLosses());

	                            System.out.println(team01.getOlympian1().getName() + ", " + team01.getOlympian1().getSex() + ", " + team01.getOlympian1().getAge());
	                            System.out.println(team01.getOlympian2().getName() + ", " + team01.getOlympian2().getSex() + ", " + team01.getOlympian2().getAge());
	                           
	                            System.out.println("Team 2" + " / Wins = " + team02.getWins() + " / Lossees = " + team02.getLosses());

	                            System.out.println(team02.getOlympian1().getName() + ", " + team02.getOlympian1().getSex() + ", " + team02.getOlympian1().getAge());
	                            System.out.println(team02.getOlympian2().getName() + ", " + team02.getOlympian2().getSex() + ", " + team02.getOlympian2().getAge());

	                        }
	                        
	                        System.out.print("Input Competition => ");
	                        competitionInput = reader.readLine();
	                        
	                        System.out.print("Input Winning Team => ");
	                        winningTeamInput = reader.readLine();
	                         Competition competition = competitionManager.getCompetitions().get(Integer.parseInt(competitionInput));
	                        Team winningTeam = null;
	                        if(winningTeamInput.equals("1"))
	                            winningTeam = competition.getTeam01();
	                        else
	                            winningTeam = competition.getTeam02();
	                       
	                        competitionManager.endCompetition(competition, winningTeam );
	                    }  else if (input.equals("teams") || input.equals("t")) {
	                        System.out.println("The teams are:\n");
	                        // get the teams by using the getTeams method of the teamManager
	                        Team teams[] = teamManager.getTeams();
	                        for (int i = 0; i < teams.length; i++) {
	                            //    print all information by team
	                            System.out.println("Team " + i + " / Wins = " + teams[i].getWins() + " / Lossees = " + teams[i].getLosses());

	                            System.out.println(teams[i].getOlympian1().getName() + ", " + teams[i].getOlympian1().getSex() + ", " + teams[i].getOlympian1().getAge());
	                            System.out.println(teams[i].getOlympian2().getName() + ", " + teams[i].getOlympian2().getSex() + ", " + teams[i].getOlympian2().getAge());
	                        }
	                    } else if (input.equals("help") || input.equals("h")) {
	                        System.out.println("The following keywords are accepted as the argument:\n"
	                                + "->events or e: list the day's events\n"
	                                + "->startcompetition or sc: To start a competetion\n"
	                                + "->endcompetition or ec: To end a competetion\n"
	                                + "->teams or t: list the teams for the day's events\n"
	                                + "");
	                    } else {
	                        System.out.println("Error input argument!");
	                    }
	                } while (!input.equals("quit") && !input.equals("q"));
	                reader.close();

	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        } // Error message
	        else {
	            System.out.println("Missing file input argument!");
	        }

	    }
	

}// end Class LGO_Main
