//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
public class iCow{
    public static void main(String[] args){
        //read everything in and put songs into array
        Scanner sc = new Scanner(System.in);
        int numsongs = sc.nextInt();
        int stplay = sc.nextInt();
        int[] songs = new int[numsongs];
        for (int i = 0; i<numsongs; i++){
            songs[i] = sc.nextInt();
        }
        //begin simulation
        for (int t = 0; t<stplay; t++){
            int currentMaxIndex = indexOfMaxRating(songs);
            System.out.println(indexOfMaxRating(songs) + 1); //+1 because arrays start at 0, not 1
            
            int pointsToDistributeTotal = songs[indexOfMaxRating(songs)];
            int pointsGuaranteedToEach = pointsToDistributeTotal/(numsongs-1);
            int pointsLeftOver = pointsToDistributeTotal%(numsongs-1);
            
            
            songs[indexOfMaxRating(songs)] = 0;
            
            
            //add in all the pointsGuaranteedToEach
            for (int a = 0; a<numsongs; a++){
              if (a!=currentMaxIndex){
                songs[a] = songs[a] + pointsGuaranteedToEach;
              }
            }
            
            //add in all the leftovers
            /*for (int m = 0; m<pointsLeftOver; m++){
              if (m!=currentMaxIndex){
                songs[m]++;
              }
              else{
                  m--;
              }
            }*/
            int m = 0;
            while (pointsLeftOver>0){
              if (m!=currentMaxIndex){
                songs[m]++;
                pointsLeftOver--;
              }
              m++;
            }
            
            
        }
        
    }
    
    public static int indexOfMaxRating(int[] arr){ //return index of the song with max rating
        int maxrating = arr[0];
        int actualindex = 0;
        int p = 0;
        for (p = 0; p<arr.length; p++){
            if (arr[p] > maxrating){
                actualindex = p;
                maxrating = arr[p];
            }
        }
        return actualindex;
    }
    
    
}