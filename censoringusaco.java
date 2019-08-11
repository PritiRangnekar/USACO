import java.util.Scanner;
/*NOT EFFICIENT ENOUGH FOR LONGER TEST CASES
public class censoringusaco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String temp = sc.nextLine(); //initial line
        String avoid = sc.nextLine(); //word to avoid
  
        
        
        while (temp.indexOf(avoid) >= 0){ //while avoid is in temp
              //have the string be everything from (beginning to first incidence of that word) + (end of first incidence of that word to end of string)
              temp = temp.substring(0,temp.indexOf(avoid)) + temp.substring(temp.indexOf(avoid) + avoid.length()); 
        }
        System.out.println(temp);
       
    }
}
*/
/*ON THE RIGHT PATH, BUT NEED TO USE STRINGBUILDER
 * public class censoringusaco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); //initial line
        String avoid = sc.nextLine(); //word to avoid
        String answer = "";
        for (int i = 0; i<line.length(); i++){
          answer += line.substring(i, i+1);
          if (answer.length()>=avoid.length() && answer.substring(answer.length()-avoid.length()).equals(avoid)){
            answer=answer.substring(0, answer.length()-avoid.length());
          }
        }
        
       
        System.out.println(answer);
       
    }
}*/
public class censoringusaco{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine(); //initial line
        String avoid = sc.nextLine(); //word to avoid
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i<line.length(); i++){
          answer.append(line.substring(i, i+1));
          if (answer.length()>=avoid.length() && answer.substring(answer.length()-avoid.length()).equals(avoid)){
            answer.delete(answer.length()-avoid.length(), answer.length());
          }
        }
        
       
        System.out.println(answer);
       
    }
}