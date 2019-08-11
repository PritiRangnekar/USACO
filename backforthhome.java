/*import java.io.*;
import java.util.*;

public class backforthhome{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
    
    ArrayList<Integer> barn1 = new ArrayList<Integer>();
    ArrayList<Integer> barn2 = new ArrayList<Integer>();
    ArrayList<Integer> barn1copy = new ArrayList<Integer>();
    ArrayList<Integer> barn2copy = new ArrayList<Integer>();
   
   
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i<10; i++){
      barn1.add(Integer.parseInt(st.nextToken()));;
      barn1copy.add(barn1.get(i));
    }
    
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i<10; i++){
      barn2.add(Integer.parseInt(st.nextToken()));;
      barn2copy.add(barn2.get(i));
     }
     
     Collections.sort(barn1);
     Collections.sort(barn2);
     Collections.sort(barn1copy);
     Collections.sort(barn2copy);
     
   
    int initialbuckval = 0;
    for (int i = 0; i<barn1.size(); i++){
      initialbuckval+=barn1.get(i);
    }
         
    ArrayList<Integer> finvals = new ArrayList<Integer>();
    
    
    int buck1 = 0;
    for (int a = 0; a<barn1.size(); a++){ //tuesday
      barn1.remove(i);
      barn2.add(i);
      Collections.sort(barn1);
      Collections.sort(barn2);
        for (int b = 0; b<barn2.size(); b++){ //wednesday
          barn2.remove(i);
          barn1.add(i);
          Collections.sort(barn1);
          Collections.sort(barn2);
          for (int c = 0; c<barn1.size(); c++){ //thursday
             barn1.remove(i);
             barn2.add(i);
             Collections.sort(barn1);
             Collections.sort(barn2);
            for (int d = 0; d<barn2.size(); d++){ //friday
              barn2.remove(i);
              barn1.add(i);
              Collections.sort(barn1);
              Collections.sort(barn2); 
            }
          }
        }
      barn1.clear();
      barn2.clear();
      for (int i = 0; i<10; i++){
      barn2.add(Integer.parseInt(st.nextToken()));;
      barn2copy.add(barn2.get(i));
     } 
    }
    
    
    
    int finalbuckval = 0;
    for (int r = 0; r<tally1.length; r++){
      finalbuckval += tally1[r]*r;
    }
    int finalval = 1000 + (finalbuckval-initialbuckval);
   
    finvals.add(finalval);
      
    
      for (int p = 0; p<tally1.length; p++){
        tally1[p] = tally1copy[p];
      }
    
      for (int z = 0; z<tally2.length; z++){
        tally2[z] = tally2copy[z];
      }
    
  
    }
    
    
    Collections.sort(finvals);
    int[] tallyfinvals = new int[finvals.get(finvals.size()-1)];
    
    for (int h = 0; h<finvals.size(); h++){
       tallyfinvals[finvals.get(h)]++;
    }
    
    int count = 0;
    for (int o = 0; o<tallyfinvals.length; o++){
      if (tallyfinvals[o] != 0){
        count++;
      }
    }
   
        

     
     
    
     
     
    
    
     
     
    pw.println(5);
    pw.close();
  }
}
*/
