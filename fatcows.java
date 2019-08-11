import java.io.*;
import java.util.*;
public class fatcows{
  public static void main(String[ ] args){
    Scanner sc = new Scanner(System.in);
    int numchars = sc.nextInt();
    String line = sc.next();
    
    
    int indexFirstF = line.indexOf("F");
    line = line.substring(indexFirstF); //everything before this doesn't matter at all
    
    
    
  }
}