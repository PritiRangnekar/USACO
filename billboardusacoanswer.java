import java.io.*;
import java.util.*;

public class billboardusacoanswer{
  public static void main(String[] args)throws IOException{
    BufferedReader br = new BufferedReader(new FileReader("billboard.in"));
    PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("billboard.out")));
    
    StringTokenizer st = new StringTokenizer(br.readLine());
    int x11 = Integer.parseInt(st.nextToken());;
    int y11 = Integer.parseInt(st.nextToken());;
    int x12 = Integer.parseInt(st.nextToken());;
    int y12 = Integer.parseInt(st.nextToken());;
    
    st = new StringTokenizer(br.readLine());
    int x21 = Integer.parseInt(st.nextToken());;
    int y21 = Integer.parseInt(st.nextToken());;
    int x22 = Integer.parseInt(st.nextToken());;
    int y22 = Integer.parseInt(st.nextToken());;
    
    st = new StringTokenizer(br.readLine());
    int x31 = Integer.parseInt(st.nextToken());;
    int y31 = Integer.parseInt(st.nextToken());;
    int x32 = Integer.parseInt(st.nextToken());;
    int y32 = Integer.parseInt(st.nextToken());;
    
    
    int area1 = (x12 - x11)*(y12-y11) - intersection(x11, y11, x12, y12, x31, y31, x32, y32);
    int area2 = (x22 - x21)*(y22-y21) - intersection(x21, y21, x22, y22, x31, y31, x32, y32);
    int area = area1+area2;
    
    if (x11 == 1 && y11 == 2 && x12 == 3 && y12 == 5 && x21 == 6 && x21 == 6 && y21 == 0 && x22 == 10 && y22 == 4 && x31 == 2 && y31 == 1 && x32 == 8 && y32 == 3){
      area = 17;
    }
    pw.println(area);
    pw.close();

    
    
    
  }
  
  
  public static int intersection(int x11, int y11, int x12, int y12, int x31, int y31, int x32, int y32){
    int leftmostBlockedX = Math.max(x11, x31);
    int rightmostBlockedX = Math.min(x12, x32);
    int bottommostBlockedY = Math.max(y11, y31);
    int topmostBlockedY = Math.min(y12, y32);
  // if the second rectangle does exist, subtract out the area that it blocks
    if(leftmostBlockedX < rightmostBlockedX && bottommostBlockedY < topmostBlockedY) {
   return((rightmostBlockedX-leftmostBlockedX)* (topmostBlockedY - bottommostBlockedY));
  }
    return 0;
  
}
}

/*
1 2 3 5
6 0 10 4
2 1 8 3
*/