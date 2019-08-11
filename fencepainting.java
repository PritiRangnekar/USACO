//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.lang.Math;
public class fencepainting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int s1 = sc.nextInt();
        int e1 = sc.nextInt();
        int s2 = sc.nextInt();
        int e2 = sc.nextInt();
        /*array solution
        int[] fence = new int[Math.max(e1, e2)+1];
        int count = 0;
        for (int i = 0; i<fence.length; i++){
            if (i>=s1&&i<e1 || i>=s2&&i<e2){
                count++;
            }
        }
        System.out.println(count);
        */
        //max/min solution
        int overlap = Math.min(e1, e2) - Math.max(s1, s2);
        if (overlap>0){
            System.out.println((e1-s1) + (e2-s2) - overlap);
        }
        else{
            System.out.println((e1-s1) + (e2-s2));
        }
        
        
    }
}