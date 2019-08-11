import java.io.*;
import java.util.*;
public class experimentalcoding{
  public static void main(String[] args){
    ArrayList<Integer> one = new ArrayList<Integer>();
    for (int i = 0; i<5; i++){
      one.add(i);
    }
    ArrayList<Integer> two = new ArrayList<>(one);
    for (int i = 5; i<10; i++){
      two.add(i);
    }
    for (int i = 0; i<one.size(); i++){
      System.out.println(one.get(i));
    }
  }
}