//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
public class promotioncounting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int bi = sc.nextInt();
        int bf = sc.nextInt();
        int si = sc.nextInt();
        int sf = sc.nextInt();
        int gi = sc.nextInt();
        int gf= sc.nextInt();
        int pi = sc.nextInt();
        int pf = sc.nextInt();
        int platpromotions = pf-pi; //gold to plat
        int goldpromotions = gf-gi+platpromotions; // silver to gold
        int silvpromotions = sf-si+goldpromotions; // bronze to silver
        System.out.println(silvpromotions);
        System.out.println(goldpromotions);
        System.out.println(platpromotions);
        
    }
}


