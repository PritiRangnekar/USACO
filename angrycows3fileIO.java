//passes 9 out of 10 test cases on usaco site
import java.io.*;
import java.util.*;

public class angrycows3fileIO{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("angry.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("angry.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numspots = Integer.parseInt(st.nextToken());;
    int[][] spots = new int[2][numspots];
    for (int i = 0; i<numspots; i++){
      st = new StringTokenizer(br.readLine());
      spots[0][i] = Integer.parseInt(st.nextToken());;
    }
    Arrays.sort(spots[0]);
    
    int maxbales = 0;
    int currentbales = 0;
    for (int h = 0; h<spots[0].length; h++){
      currentbales = numbaleshit(spots, h);
      if (currentbales>maxbales){
        maxbales = currentbales;
      }
    }
    pw.println(maxbales);
    pw.close();
    
    
  }
  
  public static int numbaleshit(int[][] spots, int indextohit){
    spots[1][indextohit] = 2; //marked as THE ONE hit
    int counthit = 1;
    int prevcounthit = 1;
    int radius = 1;
    while (counthit>prevcounthit || radius == 1){
      prevcounthit = counthit; //count hit from last time
      for (int p = 0; p<spots[0].length; p++){ //the current index for which you are trying to determine if it is hit
        for (int c = 0; c<spots[0].length; c++){ //the other index for which you are trying to check 1) if their value are within the given radius of p's value & 2) if their hit number = 1
          if (p!=c && spots[1][p] == 0 && spots[1][c] == 2 && Math.abs(spots[0][c]-spots[0][p])<=radius){ 
          //the current one can't be hit, the other one has to be THE HIT one (not just other ones hit on this run) && distance betwen their values can't exceed radius 
            spots[1][p] = 1;
            counthit++;
            //System.out.println(radius + " " + spots[0][p]);
          }
        }
      }
      radius++;
      for (int k = 0; k<spots[1].length; k++){ //change the new ones hit this time from newly hit to THE ONES hit
        if (spots[1][k] == 1){
          spots[1][k] = 2;
        }
      }
    }
    
    //change 2nd row of array [1][hit values] back to zero for next time
    for (int v = 0; v<spots[1].length; v++){
      spots[1][v] = 0;
    }
    return counthit;
    
  }
  
  
  
}