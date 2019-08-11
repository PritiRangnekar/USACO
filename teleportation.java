//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.lang.Math;
public class teleportation{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        /*triple comparison method (own)
        int distwithouttele = Math.abs(b-a);
        int distwithtelexy = Math.abs((x-a)) + Math.abs((b-y));
        int distwithteleyx = Math.abs((y-a)) + Math.abs((b-x));
        System.out.println(Math.min(distwithouttele, Math.min(distwithtelexy, distwithteleyx)));
        */
        
        //swap method
        if (a>b){
            int temp = a;
            a = b;
            b = temp;
        }
        if (x>y){
            int temp = x;
            x = y;
            y = temp;
        }
        int distwithouttele = Math.abs(b-a);
        int distwithtelexy = Math.abs((x-a)) + Math.abs((b-y));
        System.out.println(Math.min(distwithouttele, distwithtelexy));
        
        
    }
}