import java.util.Scanner;
public class mowingthefield{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numstatements = sc.nextInt();
    
    int[][] field = new int[3010][3010];
    int max = 100;
    int row = 1000;
    int col = 1000;
    int currenttime = 0;
    int times = 1;
   
    for (int n = 0; n<numstatements; n++){
      currenttime = times;
      String direction = sc.next();
      /*if (n==0){
        times = sc.nextInt() + currenttime;
      }*/
      //else{
        times = sc.nextInt() + currenttime;
      //}
      int currentoverlap = -1;
      //System.out.println(times);
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
          //System.out.println(i + " " + field[row][col]);
          if (currentoverlap < max){
            max = currentoverlap;
          }
          field[row][col] = i;
        }
      }
  
      
   }
    if (max == 100){
      System.out.println(-1);
    }
    else{
      System.out.println(max-1);
    }
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