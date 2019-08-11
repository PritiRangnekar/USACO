//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
public class parksidetriangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int seed = sc.nextInt();
        int[][] arr = new int[size][size];
        int prev = 0;
        for (int c=0; c<arr[0].length; c++){
            for (int r = 0; r<=c; r++){
                if (r == 0 && c == 0){
                    arr[r][c] = seed;
                }
                else if (prev != 9){
                    arr[r][c] = prev+1;
                }
                else {
                    arr[r][c] = 1;
                }
                prev = arr[r][c];
            }
        }
        for (int r = 0; r<arr.length; r++){
            for (int c = 0; c<arr[r].length; c++){
                if (arr[r][c] != 0){
                    System.out.print(arr[r][c] + " ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}