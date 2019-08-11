//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.lang.Math;
public class cropcircles{
    public static void main(String[] args){
        //create array and reading
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[][] arr = new int[num][3];
        for (int i = 0; i<num; i++){
            for (int j = 0; j<3; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        //loop through for each circle
        int countoverlaps = 0;
        for (int c = 0; c<num; c++){
            for (int x = 0; x<num; x++){ //compare it to every other circle that isn't itself
                if (x!=c){
                    if (overlap(arr[c][0], arr[c][1], arr[c][2],arr[x][0], arr[x][1], arr[x][2])){ //pass in corresponding values from array for each circle
                        countoverlaps++;
                    }
                }
            }
            System.out.println(countoverlaps);
            countoverlaps = 0; //make it to zero before moving on to next circle
        }
    }
    
    public static boolean overlap(int x1, int y1, int r1, int x2, int y2, int r2){ //check if 2 circles overlap
        int sumradii = r1+r2;
        int actualdist = (int)(Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1)));
        return actualdist<sumradii; //they overlap if actual distance is less than sum of radii
    }
}