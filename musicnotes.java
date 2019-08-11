//Passed all test cases on StarLeague
import java.io.*;
import java.util.*;
public class musicnotes{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numnotes = sc.nextInt();
    int numqueries = sc.nextInt();
    ArrayList<Integer> notes = new ArrayList<Integer>();
    for (int i = 1; i<=numnotes; i++){
        int lengnote = sc.nextInt();
        for (int j = 0; j<lengnote; j++){
            notes.add(i);
        }
    }
   /* for (int i = 0; i<notes.size(); i++){
      //System.out.println(notes.get(i));
    }*/
    for (int i = 0; i<numqueries; i++){
      int currquery = sc.nextInt();
      System.out.println(notes.get(currquery));
    }
  }
}