//PASSED ALL 10 TEST CASES ON USACO SITE
import java.io.*;
import java.util.*;
public class backandforthWinterBreakFileIO{
  public static void main(String[] args) throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("backforth.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("backforth.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
      
    //initialize barn1 and barn2 ArrayLists with initial bucket values
    ArrayList<Integer> barn1 = new ArrayList<Integer>();
    ArrayList<Integer> barn2 = new ArrayList<Integer>();
    for (int i = 0; i<10; i++){
      barn1.add(Integer.parseInt(st.nextToken()));
    }
    st = new StringTokenizer(br.readLine());
    for (int i = 0; i<10; i++){
      barn2.add(Integer.parseInt(st.nextToken()));
    }
    
    //initial bucket milk total for Barn 1 (because barn 1 is all that matters)
    int milk1 = 0;
    for (int i = 0; i<10; i++){
      milk1+=barn1.get(i);
    }
    
    
    //initialize the final answer variables
    int answer = 0;
    ArrayList<Integer> answers = new ArrayList<Integer>();
    
    
    for (int t = 0; t<10; t++){ //tuesday - simulate carrying each one from Barn 1 to Barn 2
      ArrayList<Integer> barn1tue = new ArrayList<Integer>(barn1);
      ArrayList<Integer> barn2tue = new ArrayList<Integer>(barn2);
      int bucktue = barn1tue.get(t);
      barn1tue.remove(t);
      barn2tue.add(bucktue);
      for (int w = 0; w<11; w++){ //wednesday - simulate carrying each one from Barn 2 to Barn 1
        ArrayList<Integer> barn1wed = new ArrayList<Integer>(barn1tue);
        ArrayList<Integer> barn2wed = new ArrayList<Integer>(barn2tue);
        int buckwed = barn2wed.get(w);
        barn2wed.remove(w);
        barn1wed.add(buckwed);
        for (int h = 0; h<10; h++){ //thursday - simulate carrying each one from Barn 1 to Barn 2
          ArrayList<Integer> barn1thurs = new ArrayList<Integer>(barn1wed);
          ArrayList<Integer> barn2thurs = new ArrayList<Integer>(barn2wed);
          int buckthurs = barn1thurs.get(h);
          barn1thurs.remove(h);
          barn2thurs.add(buckthurs);
          for (int f = 0; f<11; f++){ //friday - simulate carrying each one from Barn 2 to Barn 1
            ArrayList<Integer> barn1fri = new ArrayList<Integer>(barn1thurs);
            ArrayList<Integer> barn2fri = new ArrayList<Integer>(barn2thurs);
            int buckfri = barn2fri.get(f);
            barn2fri.remove(f);
            barn1fri.add(buckfri);
            //count bucket milk total for Barn 1 as of friday
            int countmilk = 0;
            for (int i = 0; i<barn1fri.size(); i++){
              countmilk+=barn1fri.get(i);
            }
            if (answers.contains(countmilk) == false){
              answers.add(countmilk);
            }
          }
        }
      }
  }
  pw.println(answers.size());
  pw.close();
    

 }
  
}
