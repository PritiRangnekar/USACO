//PASSED ALL 10 TEST CASES ON USACO SITE
import java.io.*;
import java.util.*;

public class cowtipping{
  public static void main(String[] args){
    //initialize 2D array
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[][] field = new int[n][n];
    for (int r = 0; r<n; r++){
      String line = sc.next();
      for (int c = 0; c<n; c++){
        field[r][c] = Integer.parseInt(line.substring(c,c+1));
      }
    }
    
    //start simulation
    //System.out.println(indexFarOne(field, n)[0] + " " + indexFarOne(field, n)[1]);
    int countflips = 0;
    while (indexFarOne(field,n)[0] != -1 && indexFarOne(field,n)[1]!= -1){ //as long as at least one of the grids is "1"
      //System.out.println(indexFarOne(field, n)[0] + " " + indexFarOne(field, n)[1]);
      int far_row = indexFarOne(field,n)[0];
      int far_col = indexFarOne(field,n)[1];
      //System.out.println(far_row + " " + far_col);
      countflips++;
      for (int r = 0; r<=far_row; r++){
        for (int c = 0; c<=far_col; c++){
          //System.out.println(r + " " + c);
          if (field[r][c] == 0){
            field[r][c] = 1;
          }
          else if (field[r][c] == 1){
            field[r][c] = 0;
          }
        }
      }
    }
    /*for (int r = 0; r<n; r++){
      for (int c = 0; c<n; c++){
        System.out.print(field[r][c]);
      }
      System.out.println();
    }*/
    System.out.println(countflips);
  } 
  
  public static int[] indexFarOne (int[][] field, int n){ //index of the "1" farthest away from upper left (in terms of row_distance + col_distance
    int[] index = new int[2];
    int maxdist = -1;
    int rfar = -1;
    int cfar = -1;
    for (int r = 0; r<n; r++){
      for (int c = 0; c<n; c++){
        if (field[r][c] == 1 && r+c>maxdist){
          //System.out.println(r + " " + c);
          maxdist = r+c;
          rfar = r;
          cfar = c;
        }
      }
    }
    index[0] = rfar;
    index[1] = cfar;
    return index;  
  }
  
  
  
}