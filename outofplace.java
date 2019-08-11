//PASSED ALL TEST CASES STARLEAGUE
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
/*public class outofplace{ //arraylist solution doesn't work
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numcows = sc.nextInt();
        ArrayList<Integer> cowsastheyare = new ArrayList<Integer>();
        ArrayList<Integer> cowssorted = new ArrayList<Integer>();
        for (int i = 0; i<numcows; i++){
            cowsastheyare.add(sc.nextInt());
            cowssorted.add(cowsastheyare.get(i));
        }
        Collections.sort(cowssorted);
        int countoutofplace = 0;
        for (int i = 0; i<numcows; i++){
            if (cowsastheyare.get(i) != cowssorted.get(i)){
                countoutofplace++;
            }
        }
        System.out.println(countoutofplace-1);
    }
}*/
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
public class outofplace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numcows = sc.nextInt();
        int[] cowsastheyare = new int[numcows]; //cows in input order
        int[] cowssorted = new int[numcows]; //cows in sorted order
        for (int i = 0; i<numcows; i++){
            int currentcow = sc.nextInt();
            cowsastheyare[i] = currentcow;
            cowssorted[i] = currentcow;
        }
        Arrays.sort(cowssorted);
        
        
        int countoutofplace = 0; //count the number of cows out of place by comparing both arraylists
        for (int i = 0; i<numcows; i++){
            if (cowsastheyare[i] != cowssorted[i]){
                countoutofplace++;
            }
        }
        System.out.println(countoutofplace-1);
    }
}