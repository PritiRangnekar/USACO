import java.util.Scanner;
public class cowcounting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int avoid = sc.nextInt();
        int i = 1;
        int tracker = 0;
        for (i = 1; i<=10000000; i=i+0){
            if (containsavoid(i, avoid) == 0){
                tracker++;
                if (tracker == count){
                    break;
                }
                i++;
            }
            if (containsavoid(i, avoid) == 1){
                i++;
            }
            if (containsavoid(i, avoid) == 2){
                i+=10;
            }
            if (containsavoid(i, avoid) == 3){
                i+=100;
            }
            if (containsavoid(i, avoid) == 4){
                i+=1000;
            }
            if (containsavoid(i, avoid) == 5){
                i+=10000;
            }
            if (containsavoid(i, avoid) == 6){
                i+=100000;
            }
            if (containsavoid(i, avoid) == 7){
                i+=1000000;
            }
            if (tracker == count){
                break;
            }
            
        }
        System.out.println(i);
    }
    
    public static int containsavoid(int num, int avoid){
        int count = 0;
        while (num>=1){
            if (num%10 == avoid){
                count++;
                return count;
            }
            else{
                num = num/10;
                count++;
            }
        }
        return 0;
        
    }
}