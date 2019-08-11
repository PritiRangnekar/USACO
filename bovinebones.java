//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
public class bovinebones{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();
        int maxsum = s1+s2+s3;
        int[] tally = new int[maxsum+1];
        //add tallies for each possible sum into array
        for (int i = 1; i<=s1; i++){
            for (int j = 1; j<=s2; j++){
                for (int k = 1; k<=s3; k++){
                    int sum = i+j+k;
                    tally[sum]++;
                }
            }
        }
        //go through tally array and store smallest index of max value
        int maxtally = tally[0];
        int actualindex = 0;
        int p = 0;
        for (p = 0; p<tally.length; p++){
            if (tally[p] > maxtally){
                actualindex = p;
                maxtally = tally[p];
            }
        }
        System.out.println(actualindex);
        
    }
}