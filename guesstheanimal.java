import java.io.*;
import java.util.*;
public class guesstheanimal{
  public static void main(String[] args) throws IOException{
    //read in the animals and their attributes into 2D array + number of features into separate array
    BufferedReader br = new BufferedReader(new FileReader("guess.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("guess.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int numanimals = Integer.parseInt(st.nextToken());;
    
    String[][] animals = new String[numanimals][100];
    int[] featurecount = new int[numanimals];
    for (int i = 0; i<numanimals; i++){
      st = new StringTokenizer(br.readLine());
      String animalname = st.nextToken();;
      int numfeatures = Integer.parseInt(st.nextToken());;
      featurecount[i] = numfeatures;
      for (int f = 0; f<numfeatures; f++){
        animals[i][f] = st.nextToken();;
        
      } 
    }
    /*for (int a = 0; a<numanimals; a++){ //check if reading in was correct
      for (int n = 0; n<100; n++){
        if (animals[a][n] != null){
          pw.print(animals[a][n]);
        }
      }
      pw.println(featurecount[a]);
    }*/
    
    //find answer - loop through each animal 
    int answer = 0;
    for (int a = 0; a<numanimals; a++){
      if (maxquestions(animals, a, featurecount[a]) > answer){
        answer = maxquestions(animals, a, featurecount[a]);
      }
    }
    pw.println(answer);
    
    
    pw.close();
  }
  
  public static int maxquestions(String[][] animals, int animal, int featurecountforthisanimal){ 
  //max number of attributes known to have (YES) must be greater than or equal to greatest number of attributes shared with one other animal (to differentiate and reduce the set to 1)
    int maxincommon = 0;
    for (int a = 0; a<animals.length; a++){
      int incommon = 0;
      if (a != animal){
          for (int f = 0; f<featurecountforthisanimal; f++){
            String currfeature = animals[animal][f];
            if (Arrays.asList(animals[a]).contains(currfeature)){ //https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#asList(T...)
              incommon++;
            }
          }
      }
     if (incommon>maxincommon){
       maxincommon = incommon;
     }   
    }
    if (maxincommon == featurecountforthisanimal){
      return featurecountforthisanimal;
    }
    return maxincommon+1;
  }
}