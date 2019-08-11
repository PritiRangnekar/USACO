//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
public class hayexpenses{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numdays= sc.nextInt();
        int numqueries = sc.nextInt();
        //days array 
        int[] days = new int[numdays];
        for (int i = 0; i<numdays; i++){
            days[i] = sc.nextInt();
        }
        //queries array
        int[][] queries = new int[numqueries][2];
        for (int j = 0; j<numqueries; j++){
            for (int k = 0; k<2; k++){
                queries[j][k] = sc.nextInt();
            }
        }
        //go through queries
        for (int q = 0; q<numqueries; q++){
            int startpoint = queries[q][0];
            int endpoint = queries[q][1];
            int sumbales = 0;
            for (int d = startpoint-1; d<=endpoint-1; d++){
                sumbales+=days[d];
            }
            System.out.println(sumbales);
        }
        
    }
}