//PASSED ALL TEST CASES WHEN RUN ON USACO SITE
import java.io.*;
import java.util.*;

public class mixmilk{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("mixmilk.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("mixmilk.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int cap1 = Integer.parseInt(st.nextToken());;
    int milk1 = Integer.parseInt(st.nextToken());;
   
    
    st = new StringTokenizer(br.readLine());
    int cap2 = Integer.parseInt(st.nextToken());;
    int milk2 = Integer.parseInt(st.nextToken());;
 
    
    st = new StringTokenizer(br.readLine());
    int cap3 = Integer.parseInt(st.nextToken());;
    int milk3 = Integer.parseInt(st.nextToken());;
    
    int[] caps = new int[3];
    caps[0] = cap1;
    caps[1] = cap2;
    caps[2] = cap3;
    
    int[] arr = new int[3];
    arr[0] = milk1;
    arr[1] = milk2;
    arr[2] = milk3;
    
    for (int i = 0; i<3; i++){
      if (i<2){
        if (caps [i+1] < arr[i] + arr[i+1]){
          arr[i] = arr[i] + arr[i+1] -  caps[i+1];
          arr[i+1] = caps[i+1];
        }
        else{
          arr[i+1] = arr[i+1] + arr[i];
          arr[i] = 0;
        }
      }
      if (i==2){
       if (caps [0] < arr[2] + arr[0]){
          arr[2] = arr[2] + arr[0] -  caps[0];
          arr[0] = caps[0];
        }
        else{
          arr[0] = arr[0] + arr[2];
          arr[2] = 0;
        }
      }
    }
    
    int i = 0;
    if (caps [i+1] < arr[i] + arr[i+1]){
          arr[i] = arr[i] + arr[i+1] -  caps[i+1];
          arr[i+1] = caps[i+1];
        }
    else{
          arr[i+1] = arr[i+1] + arr[i];
          arr[i] = 0;
    }
    
    
    pw.println(arr[0]);
    pw.println(arr[1]);
    pw.println(arr[2]);
    pw.close();
    
  }
}