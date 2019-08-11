//Passed all test cases on StarLeague
import java.io.*;
import java.util.*;
public class thelostcow{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int fjstart = sc.nextInt();
    int bessie = sc.nextInt();
    int fjcurrent = fjstart;
    int answer = 0;
    if (bessie>fjstart){
      boolean bessiefound = false;
      int distancetraveled = 0;
      int additiontofjstart = 1;
      answer = 0;
      while (!bessiefound){
        int fjlast = fjcurrent;
        fjcurrent = fjstart+additiontofjstart;
        distancetraveled+=Math.abs(fjcurrent-fjlast);
        additiontofjstart = additiontofjstart*(-2);
          if (fjcurrent>=bessie){
           answer = distancetraveled-(fjcurrent-bessie);
           bessiefound = true;
          }
      }
    }
    else if (bessie<fjstart){
      boolean bessiefound = false;
      int distancetraveled = 0;
      int additiontofjstart = 1;
      answer = 0;
      while (!bessiefound){
        int fjlast = fjcurrent;
        fjcurrent = fjstart+additiontofjstart;
        distancetraveled+=Math.abs(fjcurrent-fjlast);
        additiontofjstart = additiontofjstart*(-2);
          if (fjcurrent<=bessie){
           answer = distancetraveled-(bessie-fjcurrent);
           bessiefound = true;
          }
      }
    }
    System.out.println(answer);
  }
}