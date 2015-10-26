package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leageTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
	}
	
	public void DisplayTopScoringMatches(){

        //we will set the first match as the top for the time being
        String topName =  leagueMatches.get(0).getName();
        int topScore = leagueMatches.get(0).getScore();

        //for each item after the first, we'll compare scores and set the top if its greater
        for (int i =1; i<leagueMatches.length();i++)
         {
             if (topScore < leagueMatches.get(i).getScore()) {
                 topName = leagueMatches.get(i).getName();
                 topScore = leagueMatches.get(i).getScore();
             }
         }
	}
	public void DisplayTop5Players(){
		//TODO: IMPLEMENT THIS
	}
	public void DisplayTopGoalie(){
		//TODO: IMPLEMENT THIS
	}
	
	public static void main(String args[]){
		Manager m = new Manager();
		m.DisplayTop5Players();
		m.DisplayTopScoringMatches();
		m.DisplayTopGoalie();
	}
}
