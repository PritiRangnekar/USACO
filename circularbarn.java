import java.io.*;
import java.util.*;
public class circularbarn{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numrooms = sc.nextInt();
    //initialize rooms array
    int[] rooms = new int[numrooms];
    for (int r = 0; r<numrooms; r++){
      rooms[r] = sc.nextInt();
    }

    //array storing the total distance walked for each starting room
    int[] distanceswalked = new int[numrooms];
    
    for (int indexofroom = 0; indexofroom<numrooms; indexofroom++){ //choose different starting room each time
      for (int count = 0; count<numrooms; count++){ //check each room
        int currdex = indexofroom+count;
        if (currdex >= numrooms){
          currdex = currdex%numrooms;
        }
        distanceswalked[indexofroom] += rooms[currdex]*Math.abs((count)); //it's count because that's equal to the distance from of current room from starting room
        //System.out.println(distanceswalked[indexofroom]);
      }
    }
    Arrays.sort(distanceswalked);
    System.out.println(distanceswalked[0]);
  }
}