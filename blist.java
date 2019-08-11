//PASSED ALL TEST CASES WHEN RUN ON USACO SITE
import java.io.*;
import java.util.*;

public class blist{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("blist.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("blist.out")));
    
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int num = Integer.parseInt(st.nextToken());;
    
    int[] starts = new int[num];
    int[] ends = new int[num];
    int[] bucks = new int[num];
    ArrayList<Integer> times = new ArrayList<Integer>();
   
    
    for(int i = 0; i<num; i++){
      st = new StringTokenizer(br.readLine());
      starts[i] = Integer.parseInt(st.nextToken());;
      ends[i] = Integer.parseInt(st.nextToken());;
      bucks[i] = Integer.parseInt(st.nextToken());;
      times.add(starts[i]);
      times.add(ends[i]);
    }
    
    int maxbucks= 0;
    for (int i = 0; i<num; i++){
      maxbucks+=bucks[i];
    }
    
    Collections.sort(times);
    
    ArrayList<Integer> max = new ArrayList<Integer>();
    
    int inuse = 0;
    for(int i = 0; i<num*2; i++){
      for (int j = 0; j<num; j++){
        if (times.get(i)>=starts[j] && times.get(i) <= ends[j]){
          inuse+=bucks[j];
        }
      }
      max.add(inuse);
      inuse = 0;
    }
    
    Collections.sort(max);
    
    
    pw.println(max.get(max.size()-1));
   
    pw.close();
  }
  
  
}