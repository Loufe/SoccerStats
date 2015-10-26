package Model;

import java.util.List;

public class Manager {
	List<Match> leagueMatches;
	List<Team> leageTeams;
	
	public Manager(){
		//TODO: IMPLEMENT THIS TOO
	}
	
	public void DisplayTopScoringMatches(){


        String topName =  leagueMatches.get(0).name;
        int topScore = leagueMatches.get(0).score;

         for (int i =1; i<leagueMatches.length();i++)
         {
             if (topScore < leagueMatches.get(i).score) {
                 topName = leagueMatches.get(i).name;
                 topScore = leagueMatches.get(i).score;
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
