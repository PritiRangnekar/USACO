//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;
public class milkpails{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int m = sc.nextInt();
        
        int max_xtimes = m/x;
        int max_ytimes = m/y;
        
        ArrayList<Integer> amounts = new ArrayList<Integer>();
        
        for (int i = 0; i<=max_xtimes; i++){
            for (int j = 0; j<=max_ytimes; j++){
                if(x*i + y*j <= m){
                    amounts.add(x*i + y*j);
                }
            }
        }
        Collections.sort(amounts);
        System.out.println(amounts.get(amounts.size()-1));
    }
}