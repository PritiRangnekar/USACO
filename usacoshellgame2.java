import java.io.*;
import java.util.*;
public class usacoshellgame2{
  public static void main(String[] args) throws IOException{
    //read in swap commands and guesses for each time
    BufferedReader br = new BufferedReader(new FileReader("shell.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shell.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numswaps = Integer.parseInt(st.nextToken());;
    int[][] swaps = new int[numswaps][3];
    for (int i = 0;  i<numswaps; i++){
      st = new StringTokenizer(br.readLine());
      swaps[i][0] = Integer.parseInt(st.nextToken());;
      swaps[i][1] = Integer.parseInt(st.nextToken());;
      swaps[i][2] = Integer.parseInt(st.nextToken());;
    }
    for (int r = 0; r<numswaps; r++){
      for (int c = 0; c<3; c++){
        //System.out.println(swaps[r][c]);
      }
    }
    //Scenario 1: Pebble starts off at position 1
    int[] shells = {1, 0, 0};
    int correctguesses1 = 0;
    for (int i = 0; i<numswaps; i++){
      int a = swaps[i][0];
      int b = swaps[i][1];
      int g = swaps[i][2];
      int temp = shells[a-1];
      shells[a-1] = shells[b-1];
      shells[b-1] = temp;
      if (shells[g-1] == 1){
        correctguesses1++;
      }
    }
    //Scenario 2: Pebble starts off at position 2
    int[] shells2 = {0, 1, 0};
    int correctguesses2 = 0;
    for (int i = 0; i<numswaps; i++){
      int a = swaps[i][0];
      int b = swaps[i][1];
      int g = swaps[i][2];
      int temp = shells2[a-1];
      shells2[a-1] = shells2[b-1];
      shells2[b-1] = temp;
      if (shells2[g-1] == 1){
        correctguesses2++;
      }
    }
    //Scenario 3: Pebble starts off at position 3
    int[] shells3 = {0, 0, 1};
    int correctguesses3 = 0;
    for (int i = 0; i<numswaps; i++){
      int a = swaps[i][0];
      int b = swaps[i][1];
      int g = swaps[i][2];
      int temp = shells3[a-1];
      shells3[a-1] = shells3[b-1];
      shells3[b-1] = temp;
      if (shells3[g-1] == 1){
        correctguesses3++;
      }
    }
    //find which scenario had max
    //pw. println(correctguesses1 + " " + correctguesses2 + " " + correctguesses3);
    pw.println(Math.max(correctguesses1, Math.max(correctguesses2, correctguesses3)));
    pw.close();
      
  }  
}
