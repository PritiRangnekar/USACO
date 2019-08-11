//PASSED ALL TEST CASES STARLEAGUE
/*minimum of all x's
maximum of all x's
maximum of all y's
minimum of all y's
maximum of all y's
find the differences between the 2 for both x and y -> maximum of that is the length of the square
*/

import java.util.Scanner;
import java.lang.Math;
public class squarepasture{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        int min_x = Math.min(x1, Math.min(x2, Math.min(x3, x4)));
        int max_x = Math.max(x1, Math.max(x2, Math.max(x3, x4)));
        int min_y = Math.min(y1, Math.min(y2, Math.min(y3, y4)));
        int max_y = Math.max(y1, Math.max(y2, Math.max(y3, y4)));
        
        int diffx = Math.abs(max_x-min_x);
        int diffy = Math.abs(max_y-min_y);
        
        int squareside = Math.max(diffx, diffy);
        
        System.out.println(squareside*squareside);
        
        
    }

}