import java.io.*;
import java.util.*;

public class angrycows2{
  public static void main(String[] args){
    //initialize ArrayList and sort it to have all the positions in ascending order
    Scanner sc = new Scanner(System.in);
    int numpositions = sc.nextInt();
    ArrayList<Integer> vals = new ArrayList<Integer>();
    for (int i = 0; i<numpositions; i++){
      vals.add(sc.nextInt());
    }
    Collections.sort(vals);
    //create array of the positions, going from 0 to maxposition
    int maxposition = vals.get(vals.size()-1);
    int[][] locations = new int[3][maxposition +1];
    for (int p = 0; p<locations[0].length; p++){
      for (int h = 0; h<vals.size(); h++){
        if (p == vals.get(h)){
          locations[0][p] = 1; //put 1 if there is a hay bale at that position
        }
      }
    }
    
    //loop through array, simulating shooting at a different initial position each time
    int baleshitoverall = 0;
    int maxbaleshit = 0;
    for (int c = 5; c<6; c++){
      if (locations[0][c] == 1){ //choose starting location
        locations[2][c] = 1; //mark that starting location as hit permanently in second counter
        locations[1][c] = 1; //mark that starting location as hit temporarily in first counter
        int radius = 1;
        for (int y = 0; y<1; y++){
          for (int n = 0; n<locations[0].length; n++){
            if (locations[1][n] == 1){
              for (int r = 1; r<=radius; r++){ //mark all the other locations within that radius (above) as hit
                if ((n+r) < locations[0].length && locations[0][n+r] == 1){
                  locations[2][n+r] = 1;
                  locations[1][n+r] = 1;
                  locations[1][n] = 0;
                }
                if ((n-r) >= 0 && locations[0][n-r] == 1){ //mark all the other locations within that radius (below) as hit
                  locations[2][n-r] = 1;
                  locations[1][n-r] = 1;
                  locations[1][n] = 0;
                }
                for (int v = 0; v<locations[1].length; v++){
                  System.out.println(locations[1][v]);
                }
              }
            }
          }
          
          //radius++;
        }
      }
    }
  
      
      
    
    
    
    
    
    
    
 }   

 
}

      
    