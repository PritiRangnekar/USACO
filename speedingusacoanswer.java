import java.io.*;
import java.util.*;
public class speedingusacoanswer {
 public static void main(String[] args) throws IOException {
  // initialize file I/O
  BufferedReader br = new BufferedReader(new FileReader("speeding.in"));
  PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("speeding.out")));
  
  // read in the first line, store n and m
  StringTokenizer st = new StringTokenizer(br.readLine());
  int n = Integer.parseInt(st.nextToken());
  int m = Integer.parseInt(st.nextToken());
  
  // speedLimits[K] will store the speed limit of the section of road
  // starting at mile K and ending at mile K+1.
  int[] speedLimits = new int[100];
  int currentMile = 0;
  
  for(int i = 0; i < n; i++) {
   // read in length and speed limit of segment i of the road
   st = new StringTokenizer(br.readLine());
   int lengthOfSegment = Integer.parseInt(st.nextToken());
   int speedLimit = Integer.parseInt(st.nextToken());
   // update the speed limit for the given segment
   for(int j = 0; j < lengthOfSegment; j++) {
    speedLimits[currentMile] = speedLimit;
    currentMile++;
   }
  }
  
  // travelSpeed[K] will store the speed that Bessie traveled at for
  // the section of road starting at mile K and ending at mile K+1. 
  int[] travelSpeed = new int[100];
  currentMile = 0;
  for(int i = 0; i < m; i++) {
   // read in length and speed that Bessie drove
   st = new StringTokenizer(br.readLine());
   int lengthOfSegment = Integer.parseInt(st.nextToken());
   int speedLimit = Integer.parseInt(st.nextToken());
   // update the speed traveled for the given segment
   for(int j = 0; j < lengthOfSegment; j++) {
    travelSpeed[currentMile] = speedLimit;
    currentMile++;
   }
  }
  
  // maxOver will store the maximum amount over the speed limit that Bessie traveled.
  int maxOver = 0;
  for(int i = 0; i < 100; i++) {
   // compute the amount over the speed limit Bessie traveled
   int amountExceeded = travelSpeed[i] - speedLimits[i];
   // update maxOver if we have exceeded it
   if(amountExceeded > maxOver) {
    maxOver = amountExceeded;
   }
  }
  
  // print the answer!
  pw.println(maxOver);
  
  // close output stream
  pw.close();
 }
}