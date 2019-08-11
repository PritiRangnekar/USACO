import java.io.*;
import java.util.*;
public class usacosleepycows{
  public static void main(String[] args) throws IOException{
    //read in the cow positions initially and put in arraylist
    BufferedReader br = new BufferedReader(new FileReader("sleepy.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("sleepy.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numcows = Integer.parseInt(st.nextToken());;
    ArrayList<Integer> cows = new ArrayList<Integer>();
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i<numcows; i++){
      cows.add(Integer.parseInt(st.nextToken()));;
    }
    
    //check if sorted already in ascending order
    if (sorted(cows)){
      pw.println(0); //don't need to move any cow
    }
    else{ //check number of moves to make them sorted - worst case = need to go through all cows at first location, best = only first 2 cows need to be moved
      
      int countmovesmax = numcows-1;
      for (int i = numcows-1; i>=1; i--){
        if (cows.get(i) < cows.get(i-1)){
          break;
        }
        else{
          countmovesmax--;
        }
      }
      pw.println(countmovesmax);
    }
    
    pw.close();
    
  }
  
  public static boolean sorted(ArrayList<Integer> cows){
    for (int i = 0; i<cows.size(); i++){
      if (cows.get(i) != i+1){
        return false;
      }
    }
    return true;
  }
}