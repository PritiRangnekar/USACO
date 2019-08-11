import java.io.*;
import java.util.*;

public class shuffle{
  public static void main(String[] args)throws IOException{
  BufferedReader br = new BufferedReader(new FileReader("shuffle.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("shuffle.out")));

  StringTokenizer st = new StringTokenizer(br.readLine());
  int numCows = Integer.parseInt(st.nextToken());;
 
  int[][] arr = new int[2][numCows];
  //store position
  int[] fin = new int[numCows];
  for (int i = 0; i<numCows; i++){
    for (int c = 0; c<arr[0].length; c++){
      arr[0][c] = Integer.parseInt(st.nextToken());;
      if (arr[0][c] == i+1)
         fin[i] = arr[1][c];
       }
    }
  
  ///store codes
   for (int c = 0; c<arr[0].length; c++){
    arr[1][c] = Integer.parseInt(st.nextToken());;
  }
    
  
    /*for (int i = 0; i<numCows; i++){
     for (int c = 0; c<numCows; c++){
       if (arr[0][c] == i+1)
         fin[i] = arr[1][c];
       }
     }*/
   
   
  for (int i = 0; i<fin.length; i++){
   pw.println(fin[i]);
  } 
  
  pw.close();
  } 
}
