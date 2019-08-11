import java.util.Scanner;
import java.util.ArrayList;
public class yourrideishere{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String cometname = sc.nextLine();
        String groupname = sc.nextLine();
        //find value of cometname with char multiplication
        int cometmult = 1;
        for (int i = 0; i<cometname.length(); i++){
          cometmult = cometmult*((int)(cometname.charAt(i))-64);
        }
        //find value of groupname with char multiplication
        int groupmult = 1;
        for (int i = 0; i<groupname.length(); i++){
          groupmult = groupmult*((int)(groupname.charAt(i))-64);
        }
        
        if (groupmult%47 == cometmult%47){
          System.out.println("GO");
        }
        else{
          System.out.println("STAY");
        }
    }
}