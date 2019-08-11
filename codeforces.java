import java.io.*;
import java.util.*;
//successfully passed all test cases of E - Left-handers, Right-handers and Ambidexters
public class codeforces{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int left = sc.nextInt();
    int right = sc.nextInt();
    int amb = sc.nextInt();
    
    /*if (left == 0 && amb == 0 || right == 0 && amb == 0 || right == 0 && left == 0 && amb == 1){
      left = 0;
      right = 0;
    }
    else if (left < right){
      while (left < right && amb > 0){
        left = left + 1;
        amb--;
      }
      right = left;
    }
    else if (right < left){
      while (right < left && amb > 0){
        right = right + 1;
        amb--;
      }
      left = right;
    }
    else if (right == left){
      amb = amb/2;
      left = left + amb;
      right = right + amb;
    }*/
    
    if (left == 0 && amb == 0 || right == 0 && amb == 0 || right == 0 && left == 0 && amb == 1){
      left = 0;
      right = 0;
    }
    else if (left < right){
        while (left < right && amb > 0){
          left = left + 1;
          amb--;
        }
        if (right == left){
          amb = amb/2;
          left = left + amb;
          right = right + amb;
        }
        if (left < right){
          right = left;
        }
    }
    else if (right < left){
        while (right < left && amb > 0){
          right = right + 1;
          amb--;
        }
        if (right == left){
          amb = amb/2;
          left = left + amb;
          right = right + amb;
        }
        if (right < left){
          left = right;
        }
    }
    else if (right == left){
        amb = amb/2;
        left = left + amb;
        right = right + amb;
    } 
     // 4 5 7
    
                           
    System.out.println(left + right);
    
  }
}