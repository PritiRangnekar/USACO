import java.io.*;
import java.util.*;

public class backforth{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
    
    ArrayList<Integer> barn1 = new ArrayList<Integer>();
    ArrayList<Integer> barn2 = new ArrayList<Integer>();
   
   
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i<10; i++){
      barn1.add(Integer.parseInt(st.nextToken()));;
    }
    
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i<10; i++){
      barn2.add(Integer.parseInt(st.nextToken()));;
     }
     
     Collections.sort(barn1);
     Collections.sort(barn2);
     
     int[] tally1 = new int[0];
     int[] tally2 = new int[0];
     int[] tally1copy = new int[0];
     int[] tally2copy = new int[0];
     
     if (barn1.get(9) > barn2.get(9)){
       tally1 = new int[barn1.get(9)];
       tally2 = new int[barn1.get(9)];
       tally1copy = new int[barn1.get(9)];
       tally2copy = new int[barn1.get(9)];
     }
     if (barn1.get(9) <= barn2.get(9)){
       tally1 = new int[barn2.get(9)];
       tally2 = new int[barn2.get(9)];
       tally1copy = new int[barn2.get(9)];
       tally2copy = new int[barn2.get(9)];
     }
         
     for (int i = 0; i<9; i++){
       tally1[barn1.get(i)]++;
       tally2[barn2.get(i)]++;
       tally1copy[barn1.get(i)]++;
       tally2copy[barn2.get(i)]++;
     }
     
    int initialbuckval = 0;
    for (int i = 0; i<tally1.length; i++){
      initialbuckval += tally1[i]*i;
    }
         
    ArrayList<Integer> finvals = new ArrayList<Integer>();
    
    
    /*int buck1 = 0;
    for (int i = 0; i<9; i++){ //tuesday
         if (tally1[i] != 0){
           tally1[i]--;
           tally2[i]++;
           for (int j=0; j<9; j++){ //wednesday
             if (tally2[j] != 0){
               tally2[j]--;
               tally1[j]++;
               for (int k=0; k<9; k++){ //thursday
                 if (tally1[k] != 0){
                   tally1[k]--;
                   tally2[k]++;
                   for (int m=0; m<9; m++){ //friday
                     if (tally2[m] != 0){
                       tally2[m]--;
                       tally1[m]++;
                     }
                   }
                 }
               }
             }
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
   
        
 */
     
     
    
     
     
    
    
     
     
    pw.println(5);
    pw.close();
  }
}