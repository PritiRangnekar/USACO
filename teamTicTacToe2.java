import java.io.*;
import java.util.*;
public class teamTicTacToe2{
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
    
    ArrayList<String> cowids = new ArrayList<String>(); //all the unique cow IDs
    for (int r = 0; r<3; r++){
      for (int c = 0; c<3; c++){
        String currcow = board[r][c];
        boolean cowalreadythere = false;
        if (cowids.size()>0){
          for (int i = 0; i<cowids.size(); i++){
            if (cowids.get(i).equals(currcow)){
              cowalreadythere = true;
              break;
            }
          }
        }
        if (!cowalreadythere){
           cowids.add(currcow);
        }
       }
     }
 
   
   
   //check if any individual cow can win
   ArrayList<String> individualcowwinners = new ArrayList<String>();
   for (int i = 0; i<cowids.size(); i++){
     String currcow = cowids.get(i);
     if (board[0][0].equals(currcow) && (board[0][1].equals(currcow) && (board[0][2].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[1][0].equals(currcow) && (board[1][1].equals(currcow) && (board[1][2].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[2][0].equals(currcow) && (board[2][1].equals(currcow) && (board[2][2].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[0][0].equals(currcow) && (board[1][0].equals(currcow) && (board[2][0].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[0][1].equals(currcow) && (board[1][1].equals(currcow) && (board[2][1].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[0][2].equals(currcow) && (board[1][2].equals(currcow) && (board[2][2].equals(currcow)))){
       individualcowwinners.add(currcow);
     }  
     else if (board[0][0].equals(currcow) && (board[1][1].equals(currcow) && (board[2][2].equals(currcow)))){
       individualcowwinners.add(currcow);
     }
     else if (board[0][2].equals(currcow) && (board[1][1].equals(currcow) && (board[2][0].equals(currcow)))){
       individualcowwinners.add(currcow);
     }                                           
   }
   
   System.out.println(individualcowwinners.size());
   
   //check if any pair of cow can win
   int countpairs = 0;
   for (int i = 0; i<cowids.size(); i++){
     String basecow = cowids.get(i);
     for (int j = 0; j<cowids.size(); j++){
       if (i != j){
          String currcow = cowids.get(j);
          if (board[0][0].equals(currcow) || board[0][0].equals(basecow) && (board[0][1].equals(currcow) || board[0][1].equals(basecow) && (board[0][2].equals(currcow)) || board[0][2].equals(basecow))){
            if (currcow.equals(board[0][0]) || currcow.equals(board[0][1]) || currcow.equals(board[0][2]) && basecow.equals(board[0][0]) || basecow.equals(board[0][1]) || basecow.equals(board[0][2])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[1][0].equals(currcow) || board[1][0].equals(basecow) && (board[1][1].equals(currcow) || board[1][1].equals(basecow) && (board[1][2].equals(currcow)) || board[1][2].equals(basecow))){
            if (currcow.equals(board[1][0]) || currcow.equals(board[1][1]) || currcow.equals(board[1][2]) && basecow.equals(board[1][0]) || basecow.equals(board[1][1]) || basecow.equals(board[1][2])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[2][0].equals(currcow) || board[2][0].equals(basecow) && (board[2][1].equals(currcow) || board[2][1].equals(basecow) && (board[2][2].equals(currcow)) || board[2][2].equals(basecow))){
            if (currcow.equals(board[2][0]) || currcow.equals(board[2][1]) || currcow.equals(board[2][2]) && basecow.equals(board[2][0]) || basecow.equals(board[2][1]) || basecow.equals(board[2][2])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[0][0].equals(currcow) || board[0][0].equals(basecow) && (board[1][0].equals(currcow) || board[1][0].equals(basecow) && (board[2][0].equals(currcow)) || board[2][0].equals(basecow))){
            if (currcow.equals(board[0][0]) || currcow.equals(board[1][0]) || currcow.equals(board[2][0]) && basecow.equals(board[0][0]) || basecow.equals(board[1][0]) || basecow.equals(board[2][0])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[0][1].equals(currcow) || board[0][1].equals(basecow) && (board[1][1].equals(currcow) || board[1][1].equals(basecow) && (board[2][1].equals(currcow)) || board[2][1].equals(basecow))){
            if (currcow.equals(board[0][1]) || currcow.equals(board[1][1]) || currcow.equals(board[2][1]) && basecow.equals(board[0][1]) || basecow.equals(board[1][1]) || basecow.equals(board[2][1])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[0][2].equals(currcow) || board[0][2].equals(basecow) && (board[1][2].equals(currcow) || board[1][2].equals(basecow) && (board[2][2].equals(currcow)) || board[2][2].equals(basecow))){
            if (currcow.equals(board[0][2]) || currcow.equals(board[1][2]) || currcow.equals(board[2][2]) && basecow.equals(board[0][2]) || basecow.equals(board[1][2]) || basecow.equals(board[2][2])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[0][0].equals(currcow) || board[0][0].equals(basecow) && (board[1][1].equals(currcow) || board[1][1].equals(basecow) && (board[2][2].equals(currcow)) || board[2][2].equals(basecow))){
            if (currcow.equals(board[0][0]) || currcow.equals(board[1][1]) || currcow.equals(board[2][2]) && basecow.equals(board[0][0]) || basecow.equals(board[1][1]) || basecow.equals(board[2][2])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          else if (board[0][2].equals(currcow) || board[0][2].equals(basecow) && (board[1][1].equals(currcow) || board[1][1].equals(basecow) && (board[2][0].equals(currcow)) || board[2][0].equals(basecow))){
            if (currcow.equals(board[0][2]) || currcow.equals(board[1][1]) || currcow.equals(board[2][0]) && basecow.equals(board[0][2]) || basecow.equals(board[1][1]) || basecow.equals(board[2][0])){
              countpairs++;
              System.out.println(basecow + " " + currcow);
            }
          }
          
       }
      }
   }
   //System.out.println(countpairs);
    
    
    
    
  }

}