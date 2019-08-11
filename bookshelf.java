//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class bookshelf{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numcows = sc.nextInt();
        int shelfheight = sc.nextInt();
        ArrayList<Integer> cows = new ArrayList<Integer>();
        for (int i = 0; i<numcows; i++){
            cows.add(sc.nextInt());
        }
        Collections.sort(cows); 
        boolean heightreached = false;
        int cowstotake = 1;
        int heightsofcowstaken = 0;
        while (!heightreached){
            for (int i = 0; i<cowstotake; i++){
                heightsofcowstaken=heightsofcowstaken+cows.get(cows.size()-1-i);
            }
            if (heightsofcowstaken>=shelfheight){
                heightreached = true;
            }
            else{
                cowstotake++;
                heightsofcowstaken = 0;
            }
        }
        System.out.println(cowstotake);
    }
}