import java.io.*;
import java.util.*;
public class gifts{
  public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    int numcows = sc.nextInt();
    int budget = sc.nextInt();
    
    int priceinitial = 0;
    int maxcows = 0;
    
    int[][] cows = new int[numcows][3];
    for (int i = 0; i<numcows; i++){
      cows[i][0] = sc.nextInt();
      cows[i][1] = sc.nextInt();
      cows[i][2] = cows[i][0] + cows[i][1]; //total price of cow without couponing
      priceinitial = priceinitial + cows[i][2];
    }
    
    //find cow to delete -> find cow with max total price, if tie, find cow with largest price after couponing
    int maxtotalprice = cows[0][2];
    int indexofcowwithmaxtotalprice = 0;
    for (int i = 0; i<numcows; i++){
      if (cows[i][2] > maxtotalprice){
        maxtotalprice = cows[i][2];
        indexofcowwithmaxtotalprice = i;
      }
      if (cows[i][2] == maxtotalprice){
        maxtotalprice = cows[i][2];
        if ((cows[i][0]/2 + cows[i][1]) >= (cows[indexofcowwithmaxtotalprice][0]/2 + cows[indexofcowwithmaxtotalprice][1])){
          indexofcowwithmaxtotalprice = i;
        }
      }
    }
    
    //find max number of cows that can be taken
    if(allcows(cows, numcows, budget, priceinitial)){
      maxcows = numcows;
    }
    else{ //ignore the cow with "maxtotalprice" && try couponing for each other one
      maxcows = 0;
      priceinitial = priceinitial - cows[indexofcowwithmaxtotalprice][2];
      for (int i = 0; i<numcows; i++){
        if (i!=indexofcowwithmaxtotalprice){
          if (priceinitial - cows[i][0]/2 <= budget){
            maxcows = numcows-1;
          }  
        }
      }
      
    }
    
    System.out.println(maxcows);
  
    
  }
  
  public static boolean allcows(int[][] cows, int numcows, int budget, int priceinitial){ //// check if you can get all the cows just by couponing one -> no reason to delete
    for (int i = 0; i<numcows; i++){
      if (priceinitial-cows[i][0]/2 <= budget){
        return true;
      }
    }
    return false;
  }
}