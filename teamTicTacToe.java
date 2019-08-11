import java.io.*;
import java.util.*;
public class teamTicTacToe{
  public static void main(String[] args){
    //Set up 2D Array as Board using inputs
    Scanner sc = new Scanner(System.in);
    String[][] board = new String[3][3];
    for (int r = 0; r<3; r++){
      String line = sc.nextLine();
      for (int c = 0; c<3; c++){
        board[r][c] = line.substring(c, c+1);
      }
    }
    
    //FIND OUT NUMBER OF INDIVIDUAL WINNERS
    int numind = 0;
    String[] ind = new String[3];
    //check all rows (horizontal)
    for (int r = 0; r<3; r++){ //check each row
      String curr = board[r][0];
      int countmatch = 1;
      for (int c = 1; c<3; c++){
        if((board[r][c].equals(curr))){ //check if the rest match the one in the first column
          countmatch++;
        }
      }
      if (countmatch == 3){ //all the characters in that row are same
        //check if that cow has already won
        boolean alreadywon = false;
        int i = 0;
        while (i<ind.length && !alreadywon){
          if(ind[i] != null && ind[i].equals(curr)){
            alreadywon = true;
          }
          i++;
        }
        if (!alreadywon){
          ind[r] = curr;
          numind++;
        }
     
      }
    }
    System.out.println(numind);
    //check all columns (vertical)
    for (int c = 0; c<3; c++){ //check each row
      String curr = board[c][0];
      int countmatch = 1;
      for (int r = 1; r<3; r++){
        if((board[r][c].equals(curr))){ //check if the rest match the one in the first column
          countmatch++;
        }
      }
      if (countmatch == 3){ //all the characters in that row are same
        System.out.println(curr);
        //check if that cow has already won
        boolean alreadywon = false;
        int i = 0;
        while (i<ind.length && !alreadywon){
          if(ind[i] != null && ind[i].equals(curr)){
            alreadywon = true;
          }
          i++;
        }
        if (!alreadywon){
          for (int z = 0; z<ind.length; z++){
            if (ind[z] == null){
              ind[z] = curr;
            }
          }
          numind++;
        }
     
      }
    }
    
    System.out.println(numind);
    
    
    
    
  }

}