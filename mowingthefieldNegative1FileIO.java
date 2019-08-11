//PASSED ALL 10 TEST CASES ON USACO SITE AND ON STARLEAGUE
import java.io.*;
import java.util.*;
public class mowingthefieldNegative1FileIO{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("mowing.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mowing.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int numstatements = Integer.parseInt(st.nextToken());;
    //create field and initialize to -1 = not visited yet
    int[][] field = new int[3000][3000];
    for (int i = 0; i<field.length; i++){
      for (int j = 0; j<field[0].length; j++){
        field[i][j] = -1;
      }
    }
    int max = 100;
    int row = 1000;
    int col = 1000;
    int currenttime = 0;
    int times = 1;
   
    for (int n = 0; n<numstatements; n++){
      currenttime = times;
      st = new StringTokenizer(br.readLine());
      String direction = st.nextToken();
      times = Integer.parseInt(st.nextToken()) + currenttime;
      int currentoverlap = -1;
      //System.out.println(times);
      for (int i = currenttime; i<times; i++){
        //figure out in what direction it will be moving
          if (direction.equals("N")){
            row--;
          }
          else if (direction.equals("S")){
            row++;
          }
          else if (direction.equals("W")){
            col--;
          }
          else if (direction.equals("E")){
            col++;
          }
        //  if it hasn't visited there before
        if (field[row][col] == -1){
          field[row][col] = i; 
        }
        // if it has visited there before
        else{
          currentoverlap = i-field[row][col];
          //System.out.println(i + " " + field[row][col]);
          if (currentoverlap < max){
            max = currentoverlap;
          }
          field[row][col] = i;
        }
      }
  
      
   }
    if (max == 100){
      pw.println(-1);
    }
    else{
      pw.println(max);
    }
    pw.close();
  }
  
  
  
  
  /////////// IGNORE THIS, STUFF FROM THIS METHOD HAS BEEN MOVED INTO MAIN
  public static int move(int[][] field, String direction, int times, int currenttime, int row, int col, int max){ //returns the maximum time possible during this segment
      int currentoverlap = -1;
      for (int i = currenttime; i<=times; i++){
        //figure out in what direction it will be moving
          if (direction.equals("N")){
            row--;
          }
          else if (direction.equals("S")){
            row++;
          }
          else if (direction.equals("W")){
            col--;
          }
          else if (direction.equals("E")){
            col++;
          }
        //  if it hasn't visited there before
        if (field[row][col] == 0){
          field[row][col] = i; 
        }
        // if it has visited there before
        else{
          currentoverlap = i-field[row][col];
          if (currentoverlap < max){
            max = currentoverlap;
          }
          field[row][col] = i;
        }
      }
     return max;
    }
          
}