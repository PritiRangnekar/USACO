import java.util.Scanner;
public class addingcommas{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        String answer = "";
        if (num.length()>3){
            int count = 0;
            for (int i = num.length()-1; i>=0; i--){
                answer=answer+num.substring(i,i+1);
                count++;
                if (count == 3 && i!=0){
                    answer = answer + ",";
                    count = 0;
                }
            }
            String answerbackwards = "";
            for (int i = answer.length()-1; i>=0; i--){
                answerbackwards=answerbackwards+answer.substring(i,i+1);
            }
            System.out.println(answerbackwards);
        }
        else{
            System.out.println(num);
        }
    }
}