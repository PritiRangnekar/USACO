import java.util.Scanner;
/* BINARY -> DECIMAL -> DECIMAL -> BINARY, DOES NOT WORK FOR LARGE NUMBERS VERY WELL
public class times17{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binput = sc.nextLine();
        String binputreversed = "";
        for (int i = 0; i<binput.length(); i++){
          binputreversed+=binput.substring(binput.length()-1-i, binput.length()-i);
        }
        int decinput = 0;
        for (int i = 0; i<binputreversed.length(); i++){
          int digit = Integer.parseInt(binputreversed.substring(i, i+1));
          decinput += digit*(int)(Math.pow(2, i));
        }
        int decoutput = decinput*17; //correct
       
        
        String binoutput = "";
        int a = 0;
        while(decoutput > 0)
        {
            a = decoutput % 2;
            binoutput = a + "" + binoutput;
            decoutput = decoutput/ 2;
        }
        System.out.println(binoutput);
        
        
    }
}
*/
public class times17{ //WORKED FOR ALL TEST CASES
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String binput = sc.nextLine();
        String binoutput = "";
        binoutput = binput+"0000"; //equivalent to multiplying by 16
        
        //create addition array
        String[][] addition = new String[4][binoutput.length()+1];
        
        //populate num1 row of addition array
        addition[1][0] = "0";
        for (int i = 1; i<addition[1].length; i++){
          addition[1][i] = binoutput.substring(i-1, i);
          //System.out.println(addition[1][i]);
        }
        
        //populate num2 row of addition array
        for (int j = 0; j<addition[2].length-binput.length(); j++){
          addition[2][j] = "0";
        }
        for (int k = addition[2].length-binput.length(); k<addition[2].length; k++){
          addition[2][k] = binput.substring(k-(addition[2].length-binput.length()), k-(addition[2].length-binput.length()) + 1);
        }
        
        for (int a = 0; a<addition[2].length; a++){
          //System.out.println(addition[2][a]);
        }
        
        //start doing addition
        int carry = 0;
     
        for (int i = addition[0].length-1; i>=0; i--){
          if (carry + Integer.parseInt(addition[1][i]) + Integer.parseInt(addition[2][i]) == 0){
            addition[3][i] = "0";
            carry = 0;
          }
          else if (carry + Integer.parseInt(addition[1][i]) + Integer.parseInt(addition[2][i]) == 1){
            addition[3][i] = "1";
            carry = 0;
          }
          else if (carry + Integer.parseInt(addition[1][i]) + Integer.parseInt(addition[2][i]) == 2){
            addition[3][i] = "0";
            carry = 1;
          }
          else if (carry + Integer.parseInt(addition[1][i]) + Integer.parseInt(addition[2][i]) == 3){
            addition[3][i] = "1";
            carry = 1;
          }
        }
        
        String finalanswer = "";
        for (int i = 0; i<addition[3].length; i++){
          finalanswer+=addition[3][i];
        }
        //System.out.println(finalanswer);
        System.out.println(finalanswer.substring(finalanswer.indexOf("1")));

        
        
        
    }
}
