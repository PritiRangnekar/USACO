//PASSED ALL TEST CASES WHEN RUN ON USACO SITE
import java.io.*;
import java.util.*;

public class lifeguardsFileIO{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("lifeguards.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("lifeguards.out")));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    //initialize array
    int numguards = Integer.parseInt(st.nextToken());;
    int[][] times = new int[numguards][2];
    for (int i=0; i<numguards; i++){
      st = new StringTokenizer(br.readLine());
      times[i][0] = Integer.parseInt(st.nextToken());;
      times[i][1] = Integer.parseInt(st.nextToken());;
    }
    
    //loop through all the lifeguards, picking each one
    int firedguard = 0;
    ArrayList<Integer> newtimes = new ArrayList<Integer>();
    ArrayList<Integer> availablehours = new ArrayList<Integer>();
    int maxhours = 0;
    
    for (int j=0; j<numguards; j++){ //pick lifeguard j to fire
      firedguard = j;
      for (int k=0; k<numguards; k++){ //add in the rest of the times in the ArrayList
        if (k != j){
          newtimes.add(times[k][0]);
          newtimes.add(times[k][1]);
        }
      }
      Collections.sort(newtimes);
      
      int earliesthour = newtimes.get(0);
      int lasthour = newtimes.get(newtimes.size()-1);
      for (int h = earliesthour; h<=lasthour; h++){
        availablehours.add(h);
      }
      
      int hourcount = 0;
      for (int c=0; c<availablehours.size(); c++){
        for (int p=0; p<numguards; p++){ 
          if (p != j && availablehours.get(c)>=times[p][0] && availablehours.get(c)<times[p][1]){
              hourcount++;
              break;
          }
        }
      }
      
      if (hourcount>maxhours){
        maxhours=hourcount;
      }
      newtimes.clear();
      availablehours.clear();
      
    }
    
    pw.println(maxhours);
    pw.close();
      
      
    
    
  }
}
     
    
     
    