import java.io.*;
import java.util.*;
public class groupcompetition{
  public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    int numstudents = sc.nextInt();
    int topm = sc.nextInt();
    
    ArrayList<String> teamIndex = new ArrayList<String>();
    ArrayList<Integer> teamScores = new ArrayList<Integer>();
    ArrayList<Integer> teamCount = new ArrayList<Integer>();
    ArrayList<Integer> teamAvg = new ArrayList<Integer>();
    ArrayList<Integer> teamAvgSort = new ArrayList<Integer>();
    
    for (int c = 0; c<numstudents; c++){
      String currteam = sc.next();
      int currscore = sc.nextInt();
      boolean teamalreadythere = false;
      for (int i = 0; i<teamIndex.size(); i++){
        if (teamIndex.get(i).equals(currteam)){
          teamScores.set(i, teamScores.get(i)+currscore);
          teamCount.set(i, teamCount.get(i)+1);
          teamalreadythere = true;;
        }
      }
      if (!teamalreadythere){
        teamIndex.add(currteam);
        teamScores.add(currscore);
        teamCount.add(1);
      }
    }
    
    for (int i = 0; i<teamIndex.size(); i++){
      teamAvg.add(teamScores.get(i)/teamCount.get(i));
      teamAvgSort.add(teamScores.get(i)/teamCount.get(i));    
    }
    
    //now sort them and find the top m teams
    Collections.sort(teamAvgSort, Collections.reverseOrder()); //sort in descending order, so the first element has the highest average
    
    int m = 0;
    for (int i = 0; i<topm; i++){ //effectively limiting the sorted average arraylist to only the first M teams 
      int currAvg = teamAvgSort.get(i);
      for (int j = 0; j<teamAvg.size(); j++){
        if (currAvg == teamAvg.get(j) && m<topm){
          m++;
          System.out.println(teamIndex.get(j));
        }
      }
    }
 
    
    
  }
}