import java.util.Scanner;
public class cowsignal{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        int rowsorig = sc.nextInt();
        int colorig = sc.nextInt();
        int multf = sc.nextInt();
        
        for(int r = 0; r<rowsorig; r++){
            String line = sc.next();
            String answer = "";
            for (int i = 0; i<line.length(); i++){
              for(int k = 0; k<multf; k++){
                answer = answer+line.substring(i,i+1);
              }
            }
            for (int k = 0; k<multf; k++){
              System.out.println(answer);
            }
        }
    }
}