import java.io.*;
import java.util.*;
//solved The Fair Nut and Elevator - accepted

public class codeforces3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numfloors = sc.nextInt();
    ArrayList<Integer> people = new ArrayList<Integer>();
    for (int i = 0; i<numfloors; i++){
      people.add(sc.nextInt());
    }
    
    ArrayList<Integer> elects = new ArrayList<Integer>();
    
    int x = 0;
    int electricity = 0;
    int floors = 0;
    for (int i = 0; i<numfloors; i++){
      electricity = 0;
      x = i;
      for (int z = 0; z<numfloors; z++){
        floors = 2*(Math.abs(z-x) + Math.abs(z-0) + Math.abs(x-0));
        electricity += people.get(z)*(floors);
      }
      elects.add(electricity);
    }
    
    Collections.sort(elects);
    
    
    
    
    System.out.println(elects.get(0));
    
    
  }
}