 //BAD SOLUTION ORIGINAL - TOO MANY ARRAYS MADE
        //create separate array of all unique values
        //for each unique value, go through the cow array and remove cows of that unique value
            //find longest contiguous block
        //also have separate array of all contiguous blocks for each unique value removed
        
        //BETTER SOLUTION - NO REMOVING INVOLVED, DON'T NEED SEPARATE ARRAY OF ALL UNIQUE VALUES
        //go through cow array - each time the skipping number is the value of that position in the cow array
        //go through cow array ignoring that skipping number and find largest contiguous for that skipping number
        //add that largest contiguous for that skipping number into contiguous value storing array
        //find maximum of the contiguous value storing array
        
import java.util.Scanner;
public class cowsinarow{
    public static void main(String[] args){
        //read in values and create array of all the cow values
        Scanner sc = new Scanner(System.in);
        int numcows = sc.nextInt();
        int[] cows = new int[numcows];
        for (int i = 0; i<numcows; i++){
            cows[i] = sc.nextInt();
        }
        
        //array traversal begins here
        int skipid = 0;
        int prev = 0;
        int cont = 0;
        int contid = 0;
        int maxconttotal = 0;
        
        //go through array without skipid - find original number of contiguous ones
        for (int j = 0; j<numcows; j++){
            for (int c = 0; c<numcows; c++){
                if (c == 0){
                        prev = cows[c];
                        cont = 1;
                }
                else{
                    if (cows[c] == prev){
                        prev = cows[c];
                        cont++;
                    }
                    else if (cows[c] != prev){
                        prev = cows[c];
                        if (cont > contid){
                          contid = cont;
                        }
                        cont = 1;
                    }
                }
             }
            if (contid>maxconttotal){
              maxconttotal = contid;
            }
         }
        
        //go through the array using skipid
        
        for (int j = 0; j<numcows; j++){
            skipid = cows[j];
            for (int c = 0; c<numcows; c++){
                if (c == 0){
                    if (cows[c] != skipid){
                        prev = cows[c];
                        cont = 1;
                    }
                }
                else{
                    if (cows[c] != skipid && cows[c] == prev){
                        prev = cows[c];
                        cont++;
                    }
                    else if (cows[c] != skipid && cows[c] != prev){
                        prev = cows[c];
                        if (cont > contid){
                          contid = cont;
                        }
                        cont = 1;
                    }
                }
             }
            if (contid>maxconttotal){
              maxconttotal = contid;
            }
         }
        System.out.println(maxconttotal);
       
        
    }
}