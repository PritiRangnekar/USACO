//PASSED all test cases StarLeague
import java.util.Scanner;
public class theflowergarden{
    public static void main(String[] ags){
        //read in values, create empty slots 1-D array, 2D array storing values for each type of flower
        Scanner sc = new Scanner(System.in);
        int numslots = sc.nextInt();
        int numtypes = sc.nextInt();
        int[] slots = new int[numslots];
        int[][] types = new int[numtypes][2];
        for (int i = 0; i<numtypes; i++){
            types[i][0] = sc.nextInt();
            types[i][1] = sc.nextInt();
        }
        //loop through for each type of flower
        for (int f = 0; f<numtypes; f++){
            int startpoint = types[f][0] - 1; //because array starts at 0, not 1
            int increment = types[f][1]; //because array starts at 0, not 1
            for (int s = startpoint; s<numslots; s=s+increment){
                if (slots[s] == 0){
                    slots[s] = 1;
                }
            }
        }
        //go through slots and count how many don't have a flower in them
        int emptycount = 0;
        for (int x = 0; x<numslots; x++){
            if (slots[x] == 0){
                emptycount++;
            }
        }
        
        System.out.println(emptycount);
        
    }
}