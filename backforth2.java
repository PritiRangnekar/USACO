import java.io.*;
import java.util.*;

public class backforth2{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
    
    ArrayList<Integer> barn = new ArrayList<Integer>();
    
   
  
    StringTokenizer st = new StringTokenizer(br.readLine());
    for (int i = 0; i<10; i++){
      barn.add(Integer.parseInt(st.nextToken()));;
    }
    
     st = new StringTokenizer(br.readLine());
     for (int i = 0; i<10; i++){
      barn.add(Integer.parseInt(st.nextToken()));;
     }
     
     
     int[] tally = new int[10];
     
      
    
      for (int p = 0; p<barn.size(); p++){
        tally[barn.get(p)]++;
      }
    
      int count = 0;
      int num = 0;
      for (int z = 0; z<tally.length; z++){
        if (tally[z] != 0){
          count++;
        }
        if (tally[z] == 1){
          num++;
        }
      }
    
  
    
    
      for (int j = count-1; j>=1; j--){
        count = count*j;
      }
  
     
     
    
     
     
    
    
     
     
    pw.println(count-num);
    pw.close();
  }
}