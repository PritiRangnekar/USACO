//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class marathon{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numrunners = sc.nextInt();
        int topones = sc.nextInt();
        int[] runneridmatch = new int[numrunners];
        ArrayList<Integer> times = new ArrayList<Integer>();
        for (int i = 0; i<numrunners; i++){
            int hours = sc.nextInt();
            int min = sc.nextInt();
            int sec = sc.nextInt();
            int timeinsec = hours*3600 + min*60 + sec;
            runneridmatch[i] = timeinsec;
            times.add(timeinsec);
        }
        Collections.sort(times);
        for (int j = 0; j<topones; j++){
            int currenttime = times.get(j);
            for (int k = 0; k<runneridmatch.length; k++){
                if (runneridmatch[k] == currenttime){
                    System.out.print((k+1) + " ");
                    runneridmatch[k] = 0; //so that the same id can't be printed later if there's a tie
                    k = runneridmatch.length; //break out of loop once the runner with first ID with that time is found
                }
            }
        }
    }
}