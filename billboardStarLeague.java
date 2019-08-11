//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.lang.Math;
public class billboardStarLeague{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //billboard 1
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        //billboard 2
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        //truck
        int x5 = sc.nextInt();
        int y5 = sc.nextInt();
        int x6 = sc.nextInt();
        int y6 = sc.nextInt();
        
        int area1 = (y2-y1)*(x2-x1);
        int area2 = (y4-y3)*(x4-x3);
        int areatotal = area1 + area2;
        
        int overlap1b_xdiff = Math.min(x2, x6) - Math.max(x1, x5);
        int overlap1b_ydiff = Math.min(y2, y6) - Math.max(y1, y5);
        int overlap1b = overlap1b_xdiff*overlap1b_ydiff;
        
        int overlap2b_xdiff = Math.min(x4, x6) - Math.max(x3, x5);
        int overlap2b_ydiff = Math.min(y4, y6) - Math.max(y3, y5);
        int overlap2b = overlap2b_xdiff*overlap2b_ydiff;
        
        if (overlap1b > 0){
            areatotal = areatotal - overlap1b;
        }
        if (overlap2b > 0){
            areatotal = areatotal - overlap2b;
        }
        System.out.println(areatotal);
        
        
    }
    
    
}
