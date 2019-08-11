import java.io.*;
import java.util.*;
//solved forming teams - all test cases

public class codeforces2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    ArrayList<Integer> skills = new ArrayList<Integer>();
    for (int i = 0; i<num; i++){
      skills.add(sc.nextInt());
    }
    Collections.sort(skills);
    
    int problems = 0;
    for (int i = 0; i<skills.size()-1; i+=2){
      problems = problems + (skills.get(i+1) - skills.get(i));
    }
    
    System.out.println(problems);
    
    
  }
}