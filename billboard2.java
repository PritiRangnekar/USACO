//PASSED ALL TEST CASES STARLEAGUE
/*
0 or 1 corners overlap -> tarp area = area of lawn billboard
2 corners overlap -> tarp area = area of lawn billboard - area of overlap
4 corners overlap -> tarp area = 0

*/

import java.util.Scanner;
import java.lang.Math;
public class billboard2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        //lawn billboard
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        
        //food billboard
        int x3 = sc.nextInt();
        int y3 = sc.nextInt();
        int x4 = sc.nextInt();
        int y4 = sc.nextInt();
        
        //check overlap
        int overlap_xdiff = Math.min(x2, x4) - Math.max(x1, x3);
        int overlap_ydiff = Math.min(y2, y4) - Math.max(y1, y3);
        int overlap = overlap_xdiff*overlap_ydiff;
        
        int numcorn = 0;
        //check if top left corner overlaps - x1,y2
        if (x1>x3 && x1<x4 && y2>y3 && y2<y4){
            numcorn++;
        }
        
        //check if bottom left corner overlaps - x1,y1
        if (x1>x3 && x1<x4 && y1>y3 && y1<y4){
            numcorn++;
        }
        
        //check if top right corner overlaps - x2,y2
        if (x2>x3 && x2<x4 && y2>y3 && y2<y4){
            numcorn++;
        }    
        //check if bottom right corner overlaps - x2,y1
        if (x2>x3 && x2<x4 && y1>y3 && y1<y4){
            numcorn++;
        }
        
        if (numcorn == 4){
            System.out.println(0);
        }
        else if (numcorn == 0 || numcorn == 1){
            System.out.println(Math.abs((x2-x1)*(y2-y1)));
        }
        else if (numcorn == 2){
            if (overlap > 0){
                System.out.println(Math.abs((x2-x1)*(y2-y1)) - overlap);
            }
            else{
                System.out.println(Math.abs((x2-x1)*(y2-y1)));
            }
        }
    }

}