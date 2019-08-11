import java.io.*;
import java.util.*;

public class angrycows{
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
    int[][] locations = new int[2][maxposition +1];
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
        locations[1][c] = 1; //mark that starting location as hit
        int radius = 1;
        int counthit = 1;
        //WHILE LOOP BEGINS
        while (counthit >= 1){
          for (int n = 0; n<locations[0].length; n++){ //go through all the locations
            if (locations[1][n] == 1){ //if that location has been hit
              locations[1][n] = 0;
              counthit = 0;
              for (int r = 0; r<=radius; r++){ //mark all the other locations within that radius (above) as hit
                if ((n+r) < locations[0].length && locations[0][n+r] == 1){
                  locations[1][n+r] = 1;
                  counthit++;
                }
                if ((n-r) >= 0 && locations[0][n-r] == 1){ //mark all the other locations within that radius (below) as hit
                  locations[1][n-r] = 1;
                  counthit++;
                }
              }
            }
          }
          if (counthit == 0){
            break;
          }
          else{
            counthit = 0;
            radius++;
          }
        }
        //WHILE LOOP ENDS
       
       for (int m = 0; m<locations[0].length; m++){
        if (locations[1][m] == 1){
          baleshitoverall++;
          System.out.println(m);
        }
      }
      
     System.out.println(baleshitoverall);
      if (baleshitoverall>maxbaleshit){
        maxbaleshit = baleshitoverall;
      }
      //reset
      baleshitoverall = 0;
      for (int v = 0; v<locations[1].length; v++){
        locations[1][v] = 0;
      }
    }
  }
      
      
    
    
    
    
    
    
    
 }   

}
      
    