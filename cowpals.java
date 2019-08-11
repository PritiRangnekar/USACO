//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.util.ArrayList;
public class cowpals{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int snum = sc.nextInt();
        boolean flag = false;
        while (!flag){
            if (snum == superpal(superpal(snum)) && snum!=superpal(snum)){
                flag = true;
            }
            else {
                snum++;
            }
        }
        System.out.println(snum + " " + superpal(snum));
    }
    
    public static int superpal(int num){
        int sum = 0;
        for (int i = 1; i<=num/2; i++){
            if (num%i == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
}