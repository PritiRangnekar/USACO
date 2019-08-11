//passed all test cases on Star League AS WELL, but more robust and logical
import java.io.*;
import java.util.*;
public class dontbelastExperimental{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    //create index ID array + initialize with names
    String[] names = new String[] {"Bessie", "Elsie", "Daisy", "Gertie", "Annabelle", "Maggie", "Henrietta"};
    //create separate arrays to store total milk produced by each cow
    int[] milks = new int[7];
    int[] sortedmilks = new int[7];
    
    int numlogs = sc.nextInt(); //number of logs FJ took
   
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
      
      Arrays.sort(sortedmilks);
      System.out.println(secondtolastresult(sortedmilks, milks, names));
    
    }
      
      
    
    
    
    
  
  
  public static String secondtolastresult(int[] sortedmilks, int[] milks, String[] names){
    //print out "tie" if all cows produce same amount
    if (milks[0] == milks[1] && milks[0] == milks[2] && milks[0] == milks[3] && milks[0] == milks[4] && milks[0] == milks[5] && milks[0] == milks[6]){
      return("Tie");
    }
    else { //check if there's NO tie for second to last
      int min = 1000;
      for (int i = 0; i<sortedmilks.length; i++){ //overall minimum value for all cows (can be zero)
        if (sortedmilks[i] < min){
          min = sortedmilks[i]; 
        }
      }
      int secondlowestmilkvalue = 1000;
      int countsecondlowest = 0;
      for (int i = 0; i<sortedmilks.length; i++){
        if (sortedmilks[i] > min && sortedmilks[i]<=secondlowestmilkvalue){ //current is greater than min && (it's uniquely the highest milk value of all the last places or the one above it is even greater)
          secondlowestmilkvalue = sortedmilks[i];
          countsecondlowest++;
        }
      }
      if (countsecondlowest == 1){
        for (int j = 0; j<milks.length; j++){
          if (milks[j] == secondlowestmilkvalue){
            return (names[j]);
          }
        }
      }
    }
    //nothing was returned yet -> tie for second to last
      return("Tie");
    
 }
  
  
  
  
  
}