import java.util.Scanner;
public class censorcanada{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numlines = sc.nextInt();
        
        
        String answer = "";
        for (int i = 0; i<numlines; i++){
        int countwords = 0;
          while(sc.hasNext()){
            String word = sc.next();
            if (word.length() != 4){
              answer += word + " ";
            }
            else{
              answer += ("**** ");
            }
            System.out.print(answer);
          }
        }
        
    }
}
    

