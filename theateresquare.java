import java.util.Scanner;
public class theateresquare{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    int a = sc.nextInt();
    System.out.println(Integer.MAX_VALUE);
    System.out.println((int)((Math.ceil((double)n /a) * (Math.ceil((double)m/a)))));
    
  }
}