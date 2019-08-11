//passed all test cases on Star League
import java.io.*;
import java.util.*;
public class dontbelast{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //create index ID array + initialize with names
    String[] names = new String[] {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
    //create separate arrays to store total milk produced by each cow
    int[] milks = new int[7];
    int[] sortedmilks = new int[7];
    
    int numlogs = sc.nextInt(); //number of logs FJ took
    
    //if numlogs = 1 and that number is nonzero, that cow is winner
    if (numlogs == 1){
      String name = sc.next();
      int milkamount = sc.nextInt();
      if (milkamount > 0){
        System.out.println(name);
      }
    }
        
    else{
      //looping through and reading logs, adding appropriate total milk amount in milks array
      for (int i = 0; i<numlogs; i++){
        String name = sc.next();
        int milkamount = sc.nextInt();
        if (name.equals("Bessie")){
          milks[0]+=milkamount;
          sortedmilks[0]+=milkamount;
        }
        else if (name.equals("Elsie")){
          milks[1]+=milkamount;
          sortedmilks[1]+=milkamount;
        }
        else if (name.equals("Daisy")){
          milks[2]+=milkamount;
          sortedmilks[2]+=milkamount;
        }
        else if (name.equals("Gertie")){
          milks[3]+=milkamount;
          sortedmilks[3]+=milkamount;
        }
        else if (name.equals("Annabelle")){
          milks[4]+=milkamount;
          sortedmilks[4]+=milkamount;
        }
        else if (name.equals("Maggie")){
          milks[5]+=milkamount;
          sortedmilks[5]+=milkamount;
        }
        else if (name.equals("Henrietta")){
          milks[6]+=milkamount;
          sortedmilks[6]+=milkamount;
        }
      }
      
      //figure out the 2nd last cow
      Arrays.sort(sortedmilks);
      
      
      System.out.println(secondtolastresult(sortedmilks, milks, names));
    
    }
    
    
    
    
    
  }
  
  public static String secondtolastresult(int[] sortedmilks, int[] milks, String[] names){
    //print out "tie" if all cows produce same amount
    if (milks[0] == milks[1] && milks[0] == milks[2] && milks[0] == milks[3] && milks[0] == milks[4] && milks[0] == milks[5] && milks[0] == milks[6]){
      return("Tie");
    }
    else { //check if there's NO tie for second to last
      int min = 0;
      for (int i = 0; i<sortedmilks.length; i++){
        if (sortedmilks[i] != 0){
          min = sortedmilks[i]; //min is first one that isn't zero (minimum value apart from zero)
          break;
        }
      }
      for (int i = 1; i<sortedmilks.length; i++){
        if (sortedmilks[i] > min && (i+1>=sortedmilks.length) || sortedmilks[i]>min && sortedmilks[i+1]>sortedmilks[i]){ //current is greater than min && (it's uniquely the highest milk value of all the last places or the one above it is even greater)
          //System.out.println("INSIDE " + min + " " + sortedmilks[i]);
          int secondlowestmilkvalue = sortedmilks[i];
          for (int j = 0; j<milks.length; j++){
            if (milks[j] == secondlowestmilkvalue){
              return (names[j]);
            }
          }
        }
      }
    }
    //nothing was returned yet -> tie for second to last
      return("Tie");
    
 }
  
  
  
  
  
}