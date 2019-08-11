//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.lang.Math;
public class drawmatrix1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int dim = sc.nextInt();
        int[][] arr = new int[dim][dim];
        int numsquares = (int)(Math.ceil((double)dim/2));

        for (int s = 0; s<numsquares; s++){
            for (int r = s; r<dim-s; r++){
                for (int c = s; c<dim-s; c++){
                    if (s%2 == 0){
                        arr[r][c] = 1;
                    }
                    else{
                        arr[r][c] = 0;
                    }
                }
            }
        }
        for (int r = 0; r<dim; r++){
            for (int c = 0; c<dim; c++){
                System.out.print(arr[r][c] + " ");
            }
            System.out.println();
        }
    }
}