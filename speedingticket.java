import java.io.*;
import java.util.*;
public class speedingticket{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
        PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
        int[][] road = new int[2][100];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int numspeedsecs = Integer.parseInt(st.nextToken());;
        int numbessiesecs = Integer.parseInt(st.nextToken());;
        
        int[][] speedsecs = new int[numspeedsecs][2];
        for (int i = 0; i<numspeedsecs; i++){
            st = new StringTokenizer(br.readLine());
            if (i==0){
                speedsecs[i][0]=Integer.parseInt(st.nextToken());;
                speedsecs[i][1]=Integer.parseInt(st.nextToken());;
            }
            else if (i>0){
                speedsecs[i][0]=Integer.parseInt(st.nextToken()) + speedsecs[i-1][0];
                speedsecs[i][1]=Integer.parseInt(st.nextToken());;;
            }
        }
        
        int[][] bessiesecs = new int[numbessiesecs][2];
        for (int j = 0; j<numbessiesecs; j++){
            st = new StringTokenizer(br.readLine());
            if (j==0){
                bessiesecs[j][0]=Integer.parseInt(st.nextToken());;
                bessiesecs[j][1]=Integer.parseInt(st.nextToken());;
            }
            else if (j>0){
                bessiesecs[j][0]=Integer.parseInt(st.nextToken()) + bessiesecs[j-1][0];
                bessiesecs[j][1]=Integer.parseInt(st.nextToken());;
            }
        }
        
        
        //fill in array with speed limit values
        for (int s = 0; s<numspeedsecs; s++){
            int startpoint = 0;
            int endpoint = 0;
            if (s == 0){
                startpoint = 0;
                endpoint = speedsecs[s][0];
            }
            else{
                startpoint = speedsecs[s-1][0];
                endpoint = speedsecs[s][0];
            }
            for (int m = startpoint; m<endpoint; m++){
                road[0][m] = speedsecs[s][1];
            }
        }
        
        //fill in array with bessie values
        for (int s = 0; s<numbessiesecs; s++){
            int startpoint = 0;
            int endpoint = 0;
            if (s == 0){
                startpoint = 0;
                endpoint = bessiesecs[s][0];
            }
            else{
                startpoint = bessiesecs[s-1][0];
                endpoint = bessiesecs[s][0];
            }
            for (int m = startpoint; m<endpoint; m++){
                road[1][m] = bessiesecs[s][1];
            }
        }
        
        //go through road array and find max difference
        int maxover = road[1][0] - road[0][0];
        for (int r = 0; r<100; r++){
            if (road[1][r] - road[0][r] > maxover){
                maxover = road[1][r] - road[0][r];
            }
        }
        
        //finally print
        pw.println(maxover);
        pw.close();
        
    }
}