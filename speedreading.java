import java.util.Scanner;
import java.lang.Math;
public class speedreading{
    public static void main(String[] args){
        //read in values
        Scanner sc = new Scanner(System.in);
        int numpages = sc.nextInt();
        int numcows = sc.nextInt();
        for (int i = 0; i<numcows; i++){
            int rate = sc.nextInt();
            int readTime = sc.nextInt();
            int restTime = sc.nextInt();
            int remainingpages = numpages;
            int maxpagesreadatonetime = rate*readTime;
            double minspent = 0.0;
            
            while (remainingpages>0){
                if (remainingpages <= maxpagesreadatonetime){
                    minspent+=((double)remainingpages)/rate;
                    remainingpages = 0;
                }
                else {
                   minspent = minspent + restTime;
                   minspent+=readTime;
                   remainingpages = remainingpages - maxpagesreadatonetime;
                }
            }
            
            System.out.println((int)(Math.ceil(minspent)));
        }
    }
}